package cn.lyl.ssm.daoImpl;

import org.springframework.stereotype.Component;

import cn.lyl.ssm.dao.BzjDao;
import cn.lyl.ssm.po.Bzj;

@Component(value="bzjDaoImpl")
public class BzjDaoImpl extends CommonDaoImpl<Bzj> implements BzjDao {

	@Override
	public void save(Bzj entity) {
		ht.save(entity);		
	}

	@Override
	public void update(Bzj entity) {
		
		
	}

	@Override
	public void delete(Bzj entity) {
		//
		
	}

	@Override
	public Bzj find(String arg) {
		//
		return null;
	}

}
