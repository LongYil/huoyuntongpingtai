package cn.lyl.ssm.dao;

import org.springframework.stereotype.Component;

import cn.lyl.ssm.daoImpl.CommonDaoImpl;
import cn.lyl.ssm.po.Wlx;

@Component(value="wlxDaoImpl")
public class WlxDaoImpl extends CommonDaoImpl<Wlx> implements WlxDao {

	@Override
	public void save(Wlx entity) {
		ht.save(entity);		
	}

	@Override
	public void update(Wlx entity) {
		//
		
	}

	@Override
	public void delete(Wlx entity) {
		//
		
	}

	@Override
	public Wlx find(String arg) {
		//
		return null;
	}

}
