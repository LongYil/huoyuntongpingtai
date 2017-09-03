package cn.lyl.ssm.service.impl;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.lyl.ssm.daoImpl.HyglyDaoImpl;
import cn.lyl.ssm.po.Dd;
import cn.lyl.ssm.po.Hygly;

@Transactional
@Service(value="hyglyServc")
public class HyglyServc extends CommonSevc<Hygly, HyglyDaoImpl> {

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
	
	public List<Hygly> findByShdd(Dd dd){//根据收货地址查找收货代理点
		return daoImpl.findByShdz(dd);
	}
	
	public List<Hygly> yhFindAllGly(String arg){//货运代理点用户查找所有管理员
		return daoImpl.yhFindAllGly(arg);
	}
	
	public Hygly getById(String arg) {//根据id得到货运管理员
		return daoImpl.getById(Integer.parseInt(arg));
	}
	
	
	
	
	
}
