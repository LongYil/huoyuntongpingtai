package cn.lyl.ssm.daoImpl;

import org.springframework.stereotype.Component;

import cn.lyl.ssm.dao.DdDao;
import cn.lyl.ssm.po.Dd;

@Component(value="ddDaoImpl")
public class DdDaoImpl extends CommonDaoImpl<Dd> implements DdDao {

	@Override
	public void save(Dd entity) {
		ht.save(entity);		
	}

	@Override
	public void update(Dd entity) {
		//
		
	}

	@Override
	public void delete(Dd entity) {
		//
		
	}

	@Override
	public Dd find(String arg) {
		//
		return null;
	}

}
