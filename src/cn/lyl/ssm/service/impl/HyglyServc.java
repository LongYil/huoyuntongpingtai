package cn.lyl.ssm.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.lyl.ssm.daoImpl.HyglyDaoImpl;
import cn.lyl.ssm.po.Dd;
import cn.lyl.ssm.po.Hygly;
import cn.lyl.ssm.po.Ptzh;

@Transactional
@Service(value="hyglyServc")
public class HyglyServc extends CommonSevc<Hygly, HyglyDaoImpl> {

	private List<Hygly> listgly = new ArrayList<Hygly>();
	@Autowired
	private Ptzh ptzh;
	@Autowired
	private PtzhServc ptzhServc;
	
	@Override
	public void save(Hygly arg) {
		daoImpl.save(arg);
	}

	@Override
	public Hygly find(String arg) throws Exception {
		return daoImpl.find(arg);
	}

	@Override
	public List<Hygly> findAll(String arg) {
		return daoImpl.findAll();
	}

	@Override
	public void delete(Hygly arg) {
		daoImpl.delete(arg);
	}
	
	public List<Hygly> findByYhbh(String arg){
		return daoImpl.findByYhbh(arg);
	}
	
	public List<Hygly> findByShdd(Dd dd) throws Exception{//根据收货地址查找收货代理点   并筛选代理点
		listgly.clear();
		listgly = daoImpl.findByShdz(dd);
		for(int i=0;i<listgly.size();i++) {
			ptzh = ptzhServc.find(String.valueOf(listgly.get(i).getYhbh()));
			if(dd.getFkf()==2) {
				if(ptzh.getZhye()<dd.getYjyf()+dd.getHkfy()) {//如果收货代理点 账户余额小于 订单总费用，则移除该代理点
					listgly.remove(i);
				}else {
					;
				}
			}else {	
			}

		}
		return listgly;
	}
	
	public List<Hygly> yhFindAllGly(String arg){//货运代理点用户查找所有管理员
		return daoImpl.yhFindAllGly(arg);
	}
	
	public Hygly getById(String arg) {//根据id得到货运管理员
		return daoImpl.getById(Integer.parseInt(arg));
	}
	
	
	
	
	
}
