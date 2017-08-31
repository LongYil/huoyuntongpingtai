package cn.lyl.ssm.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.lyl.ssm.daoImpl.DdDaoImpl;
import cn.lyl.ssm.po.Cysgly;
import cn.lyl.ssm.po.Dd;
import cn.lyl.ssm.po.Hygly;
import cn.lyl.ssm.po.Wlx;
import cn.lyl.ssm.po.Yscd;
import cn.lyl.ssm.vo.Ysdw;

@Transactional
@Service(value="ddServc")
@Scope(value="prototype")
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
	
	private List<Wlx> listWlx = new ArrayList<Wlx>();
	private List<Ysdw> listysdw1 = new ArrayList<Ysdw>();
	
	private Ysdw ysdw;
	@Override
	public void save(Dd arg) {
		daoImpl.save(arg);		
	}

	@Override
	public Dd find(String arg) {
		//
		return null;
	}

	@Override
	public List<Dd> findAll(String arg) {
		return null;
	}

	@Override
	public void delete(Dd arg) {
		
	}
	
	public List<Ysdw> findBestYsdw(Dd dd) throws Exception{
		Float tempnum = Float.parseFloat(dd.getZtj())/(Float.parseFloat(dd.getZzl())/1000);//计算货物每吨的体积
		if(tempnum>3){
			dd.setJjlx(2);//重货
		}else{
			dd.setJjlx(1);//轻货
		}
		listysdw1.clear();
		listWlx.clear();
		listWlx = wlxServc.findBestWlx(dd);
		for(int i=0;i<listWlx.size();i++){
			ysdw = new Ysdw();
			ysdw.setId(i);
			cysgly = cysglyServc.findByGlyid(String.valueOf(listWlx.get(i).getCysbh()));
			hygly = hyglyServc.find(String.valueOf(cysgly.getDlbh()));
			yscd = yscdServc.find(String.valueOf(listWlx.get(i).getCdbh()));
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
			
			if(dd.getJjlx()==2){
				ysdw.setYjfy(Float.parseFloat(dd.getZzl())*listWlx.get(i).getZhjg());
			}else{
				ysdw.setYjfy(Float.parseFloat(dd.getZtj())*listWlx.get(i).getQhjg());
			}
			listysdw1.add(ysdw);
		}
		return listysdw1;
	}
}
