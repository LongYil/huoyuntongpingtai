package cn.lyl.ssm.daoImpl;

import org.springframework.stereotype.Component;

import cn.lyl.ssm.po.Cysgly;

@Component(value="cysglyDao")
public class CysglyDaoImpl extends CommonDaoImpl<Cysgly> implements cn.lyl.ssm.dao.CysglyDao {

	@Override
	public void save(Cysgly entity) {
		ht.save(entity);		
	}

	@Override
	public void update(Cysgly entity) {
		//
		
	}

	@Override
	public void delete(Cysgly entity) {
		//
		
	}

	@Override
	public Cysgly find(String arg) {
		//
		return null;
	}

}
