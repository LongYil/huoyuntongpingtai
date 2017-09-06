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
	private PtzhServc ptzhServc;
	
	private List<Wlx> listWlx = new ArrayList<Wlx>();
	private List<Ysdw> listysdw1 = new ArrayList<Ysdw>();
	
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
				ysdw.setCysdz(cysgly.getSzsf()+"-"+cysgly.getSzcs()+"-"+cysgly.getSzx()+"-"+cysgly.getSzjdh());
				ysdw.setCysdh(cysgly.getLxdh());
				ysdw.setCyscd(yscd.getCdmc());
				ysdw.setCyscddh(yscd.getCdlxdh());
				ysdw.setFhdldmc(hygly.getGsmc());
				ysdw.setFhdldbh(hygly.getGlybh());
				ysdw.setFhdh(hygly.getLxdh());
				ysdw.setFhdz(hygly.getSzsf()+"-"+hygly.getSzcs()+"-"+hygly.getSzx()+"-"+hygly.getSzjdh());
				if(dd.getJjlx()==2){//重货  费用按重量计价100
					ysdw.setDlfhfy(dd.getZzl()*1.1f);
					ysdw.setDlshfy(dd.getZzl()*0.6f);
					ysdw.setYsfy(dd.getZzl()*listWlx.get(i).getZhjg());		
				}else{//轻货  费用按轻货计价
					ysdw.setDlfhfy(dd.getZzl()*8.2f);
					ysdw.setDlshfy(dd.getZzl()*3.4f);
					ysdw.setYsfy(dd.getZtj()*listWlx.get(i).getQhjg());	
				}
				ysdw.setYjfy(ysdw.getDlfhfy()+ysdw.getDlshfy()+ysdw.getYsfy());
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
}
