package cn.lyl.ssm.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.lyl.ssm.daoImpl.DdDaoImpl;
import cn.lyl.ssm.po.Cysgly;
import cn.lyl.ssm.po.Dd;
import cn.lyl.ssm.po.Hygly;
import cn.lyl.ssm.po.Ptzh;
import cn.lyl.ssm.po.Wlx;
import cn.lyl.ssm.po.Yscd;
import cn.lyl.ssm.vo.DdVo;
import cn.lyl.ssm.vo.Ysdw;

@Transactional
@Service(value="ddServc")
public class DdServc extends CommonSevc<Dd,DdDaoImpl> {

	@Autowired
	private WlxServc wlxServc;
	@Autowired
	private CysglyServc cysglyServc;
	@Autowired
	private Cysgly cysgly;
	@Autowired
	private Yscd yscd;
	@Autowired
	private YscdServc yscdServc;
	@Autowired
	private Hygly hygly;
	@Autowired
	private HyglyServc hyglyServc;
	@Autowired
	private Ptzh ptzh;
	@Autowired
	private Ptzh ptzhi;
	@Autowired
	private PtzhServc ptzhServc;
	@Autowired
	private Dd dd;
	
	private DdVo ddvo;
	private List<Wlx> listWlx = new ArrayList<Wlx>();
	private List<Ysdw> listysdw1 = new ArrayList<Ysdw>();
	private List<Dd> listdd = new ArrayList<Dd>();
	private List<DdVo> listddvo = new ArrayList<DdVo>();
	
	private Ysdw ysdw;
	@Override
	public void save(Dd arg) {
		daoImpl.save(arg);		
	}
	
	public String saveDd(Dd arg,String time,String yhbh) throws Exception {
		arg.setFqsj(daoImpl.getDateAndTime.getStandardDateAndTime());
		arg.setYjsdsj(daoImpl.getDateAndTime.getExpectTime(daoImpl.getDateAndTime.getStandardDateAndTime(),time));	
		if(arg.getFkf()==1) {//付款方式为   发付   付款成功返回1 付款状态更改为 已付款   付款失败 返回2 不修改付款状态 表示账户余额不足
		    ptzh = ptzhServc.find(yhbh);
			if(ptzh.getZhye()>=arg.getYjyf()) {
				arg.setSfyf(arg.getYjyf());
				arg.setFkzt(2);
				ptzh.setZhye(ptzh.getZhye()-arg.getYjyf());
				
				ptzhServc.update(ptzh);
				daoImpl.save(arg);
				
				jyjl.setYhbh(Integer.parseInt(yhbh));
				jyjl.setJyje(arg.getYjyf());
				jyjl.setJyzt(2);
				jyjl.setJysj(getDateAndTime.getNowDate());
				jyjl.setJylx(6);
				jyjlServc.save(jyjl);
				return "1";
			}else {
				arg.setFkzt(1);
				daoImpl.save(arg);
				return "2";
			}
		}else {//付款方式为  到付  返回3
			arg.setFkzt(1);
			daoImpl.save(arg);
			return "3";
		}
	}
	@Override
	public Dd find(String arg) {
		return daoImpl.find(arg);
	}

	@Override
	public List<Dd> findAll(String arg) {
		//
		return null;
	}

	@Override
	public void delete(Dd arg) {
		daoImpl.delete(arg);
	}
	
	public List<Ysdw> findBestYsdw(Dd dd) throws Exception{
		listysdw1.clear();
		listWlx.clear();
		
		Float tempnum = dd.getZtj()/(dd.getZzl()/1000);//计算货物每吨的体积
		if(tempnum>3){
			dd.setJjlx(2);//重货
		}else{
			dd.setJjlx(1);//轻货
		}

		listWlx = wlxServc.findBestWlx(dd);
		if(listWlx.size()>0) {
			for(int i=0;i<listWlx.size();i++){
				ysdw = new Ysdw();
				ysdw.setId(i);
				cysgly = cysglyServc.findByGlyid(String.valueOf(listWlx.get(i).getCysbh()));
				hygly = hyglyServc.find(String.valueOf(cysgly.getDlbh()));
				yscd = yscdServc.find(String.valueOf(listWlx.get(i).getCdbh()));
				ysdw.setYssx(listWlx.get(i).getYssx());
				ysdw.setCysbh(cysgly.getCysbh());
				ysdw.setCysmc(cysgly.getGsmc());
				ysdw.setCysdz(cysgly.getSzsf()+"-"+cysgly.getSzcs()+"-"+cysgly.getSzx()+(cysgly.getXxdz()!=null?"-"+cysgly.getXxdz():""));
				ysdw.setCysdh(cysgly.getLxdh());
				ysdw.setCyscd(listWlx.get(i).getCdbh());
				ysdw.setCyscddh(yscd.getCdlxdh());
				ysdw.setFhdldmc(hygly.getGsmc());
				ysdw.setFhdldbh(hygly.getGlybh());
				ysdw.setFhdh(hygly.getLxdh());
				ysdw.setFhdz(hygly.getSzsf()+"-"+hygly.getSzcs()+"-"+hygly.getSzx()+"-"+(cysgly.getXxdz()!=null?"-"+cysgly.getXxdz():""));
				if(dd.getJjlx()==2){//重货  费用按重量计价100
					ysdw.setDlfhfy(dd.getZzl()*1.1f);
					ysdw.setDlshfy(dd.getZzl()*0.6f);
					ysdw.setYsfy(dd.getZzl()*listWlx.get(i).getZhjg());		
				}else{//轻货  费用按轻货计价
					ysdw.setDlfhfy(dd.getZzl()*8.2f);
					ysdw.setDlshfy(dd.getZzl()*3.4f);
					ysdw.setYsfy(dd.getZtj()*listWlx.get(i).getQhjg());	
				}
				
				if(dd.getDshk()==1) {//需要代收货款
					dd.setDsdlf(dd.getHkfy()*0.1f);//收货代理点将按照代收款的  百分之一  收取代收代理费
				}else {//不需要代收货款
					dd.setDsdlf(0.0f);
				}
				
				if(dd.getSmth()==1) {//需要上门提货
					if(dd.getJjlx()==2){//重货  费用按重量计价
						ysdw.setThfy(dd.getZzl()*1);		//重货 上门提货  1元一千克
						dd.setThfy(ysdw.getThfy());
					}else{//轻货  费用按轻货计价
						ysdw.setThfy(dd.getZtj()*5);	   //轻货上门提货  5元一立方米
						dd.setThfy(ysdw.getThfy());
					}
				}else {//不需要上门提货
					ysdw.setThfy(0.0f);
					dd.setThfy(0.0f);
				}
				
				ysdw.setDsdlf(dd.getDsdlf());
				ysdw.setYjfy(ysdw.getDlfhfy()+ysdw.getDlshfy()+ysdw.getYsfy()+ysdw.getThfy()+ysdw.getDsdlf());
				listysdw1.add(ysdw);
			}
		}else {
			;
		}
		return listysdw1;
	}
	
	public List<Dd> findAllDdxx(String column,String ztid,String yhid) {
		return daoImpl.findByDdzt(column, ztid, yhid);
	}
	
	public List<Dd> findAllByYhlx(String column,String yhid){
		return daoImpl.findAllByYhlx(column, yhid);
	}
	
	public List<Dd> findAllFhAndSh(String arg){
		return daoImpl.findAllFhAndSh(arg);
	}
	
	public List<Dd> cysFindAll(String arg){
		return daoImpl.cysFindAll(arg);
	}
	
	public void update(Dd dd) {
		daoImpl.update(dd);
	}
	
	public List<Dd> wtrFindWfk(String yhbh){
		return daoImpl.wtrFindWfk(yhbh);
	}
	
	public String wtrQrfk(String id,String yhid) throws Exception {//委托人确认付款
		dd = this.find(id);
		ptzh = ptzhServc.find(yhid);
		if(ptzh.getZhye()>=dd.getYjyf()) {
			dd.setFkzt(2);
			dd.setSfyf(dd.getYjyf());
			ptzh.setZhye(ptzh.getZhye()-dd.getYjyf());
			this.update(dd);
			
			jyjl.setYhbh(Integer.parseInt(yhid));
			jyjl.setJyje(dd.getYjyf());
			jyjl.setJyzt(2);
			jyjl.setJysj(getDateAndTime.getNowDate());
			jyjl.setJylx(6);
			jyjlServc.save(jyjl);
			
			ptzhServc.update(ptzh);
			return "1";
		}else {
			return "2";
		}
	}
	
	public String hydldQrjd(String id,String yhbh) throws Exception {
		dd = this.find(id);
		ptzh = ptzhServc.find(yhbh);
		if(dd.getFkf()==1) {//发付  委托人付款
			if(dd.getFkzt()==1) {//未付款  确认接单将从代理点账户扣除货款
				if(ptzh.getZhye()>=dd.getYjyf()) {//代理点账户费用足够支付
					ptzh.setZhye(ptzh.getZhye()-dd.getYjyf());
					dd.setSfyf(dd.getYjyf());
					dd.setDdzt(2);
					this.update(dd);
					ptzhServc.update(ptzh);
					return "1";
				}else {//代理点账户余额不足，接单失败
					return "2";
				}
			}else {//已付款  修改订单的订单状态即可
				dd.setDdzt(2);
				this.update(dd);
				return "1";
			}
		}else {//到付  货运代理点代付货款
			if(ptzh.getZhye()>=dd.getYjyf()) {//代理点账户费用足够支付
				ptzh.setZhye(ptzh.getZhye()-dd.getYjyf());
				dd.setSfyf(dd.getYjyf());
				dd.setDdzt(2);
				this.update(dd);
				ptzhServc.update(ptzh);
				return "1";
			}else {//代理点账户余额不足，接单失败
				return "2";
			}
		}
	}
	
	public void cysjd(String[] id) {//承运商接单
		for(int i=0;i<id.length;i++) {
			dd = this.find(id[i]);
			dd.setDdzt(3);
			this.update(dd);
		}
	}
	
	public String shdldQs(String id,String yhbh) throws Exception {
		dd = this.find(id);
		
		if(dd.getDshk()==1) {
			ptzh = ptzhServc.find(yhbh);
			ptzhi = ptzhServc.find(String.valueOf(dd.getWtrbh()));
			ptzh.setZhye(ptzh.getZhye()-dd.getHkfy());
			ptzhi.setZhye(ptzhi.getZhye()+dd.getHkfy());
			ptzhServc.update(ptzh);
			ptzhServc.update(ptzhi);
		}else {
			;
		}
		dd.setDdzt(5);
		this.update(dd);
		return "1";
	}
	
	public List<DdVo> cysFindAllDd(String id,String glybh) throws Exception{
		listdd.clear();
		listdd = daoImpl.cysFindAllDd(id,glybh);
		for(int i=0;i<listdd.size();i++) {
			dd = listdd.get(i);
			hygly = hyglyServc.find(String.valueOf(dd.getShdld()));
			ddvo = new DdVo();
			switch(dd.getDdzt()) {
			case 1:
				ddvo.setJyzt("待处理");
				break;
			case 2:
				ddvo.setJyzt("已处理");
				break;
			case 3:
				ddvo.setJyzt("运输中");
				break;
			case 4:
				ddvo.setJyzt("已送达");
				break;
			}
			ddvo.setId(String.valueOf(dd.getId()));
			ddvo.setHwmc(dd.getHwmc());
			ddvo.setShdlddz(hygly.getSzsf()+hygly.getSzcs()+hygly.getSzx()+hygly.getXxdz());
			ddvo.setShdldmc(hygly.getGsmc());
			ddvo.setSpjs(String.valueOf(dd.getZjs()));
			ddvo.setZfy(String.valueOf(dd.getYjyf()));
			ddvo.setYsfy(String.valueOf(dd.getCyssf()));
			ddvo.setQt(dd.getYjsdsj());
			listddvo.add(ddvo);
		}
		
		return listddvo;
	}
	
	public List<Dd> ptFindAllYcdd(String arg){
		return daoImpl.ptFindAllYcdd(arg);
	}
	
	public boolean ptFindAllWwcDd(String yhbh) {
		if(daoImpl.ptFindAllWwcDd(yhbh).size()>0) {
			return false;
		}else {
			return true;
		}
	}
	
	
}
