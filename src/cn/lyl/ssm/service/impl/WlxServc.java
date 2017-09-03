package cn.lyl.ssm.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.lyl.ssm.daoImpl.WlxDaoImpl;
import cn.lyl.ssm.po.Cysgly;
import cn.lyl.ssm.po.Dd;
import cn.lyl.ssm.po.Wlx;
import cn.lyl.ssm.po.Yscd;
import cn.lyl.ssm.vo.WlxVo;

@Transactional
@Service(value="wlxServc")
public class WlxServc extends CommonSevc<Wlx, WlxDaoImpl> {
	
	@Autowired
	private YscdServc yscdServc;
	private List<Yscd> listYscd = new ArrayList<Yscd>();
	private List<Wlx> listWlx = new ArrayList<Wlx>();
	private List<Wlx> templistWlx = new ArrayList<Wlx>();
	
	@Override
	public void save(Wlx arg) {
		daoImpl.save(arg);		
	}

	@Override
	public Wlx find(String arg) {
		//
		return null;
	}

	@Override
	public List<Wlx> findAll(String arg) {
		return daoImpl.findAll(arg);
	}

	@Override
	public void delete(Wlx arg) {

	}
	
	public List<Wlx> findByCdid(String arg){
		return daoImpl.findByCdid(arg);
	}
	
	public List<WlxVo> findByCysYhid(String arg){
		return daoImpl.findByCysYhid(arg);
	}
	
	public List<Wlx> dldFindByYhbh(String yhbh) throws Exception{
		listYscd.clear();
		listWlx.clear();
		templistWlx.clear();
		listYscd = yscdServc.hyFindAllYscd(yhbh);
		
		for(int i=0;i<listYscd.size();i++){
			templistWlx.clear();
			templistWlx = this.findByCdid(String.valueOf(listYscd.get(i).getCdbh()));
			if(templistWlx.size()>0){
				listWlx.addAll(templistWlx);
			}else{
				;
			}
		}
		System.out.println(listWlx);
		return listWlx;
	}
	
	public List<Wlx> findBestWlx(Dd dd){//根据订单信息查找物流线
		return daoImpl.findBestWlx(dd);
	}
	
	public List<Wlx> findByYscdId(List<Yscd> listcd){
		listWlx.clear();
		templistWlx.clear();
		for(int i=0;i<listcd.size();i++){
			templistWlx = daoImpl.findByCdid(String.valueOf(listcd.get(i).getCdbh()));
			if(templistWlx.size()>0){
				listWlx.addAll(templistWlx);
			}else{
				;
			}
		}
		return templistWlx;
	}
	
	public void update(Wlx wlx){
		daoImpl.update(wlx);
	}
	
	public List<WlxVo> findByGlyid(List<Cysgly> list){
		return daoImpl.findByGlyid(list);
	}
	
	public List<Wlx> findByCysid(String arg){
		return daoImpl.findByCysid(arg);
	}
	
	
}	