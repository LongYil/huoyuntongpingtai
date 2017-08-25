package cn.lyl.ssm.daoImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cn.lyl.ssm.dao.BzjDao;
import cn.lyl.ssm.po.Bzj;
import cn.lyl.ssm.utils.GetEntity;

@Component(value="bzjDaoImpl")
public class BzjDaoImpl extends CommonDaoImpl<Bzj> implements BzjDao {
	
	@Autowired
	private GetEntity getEntity;
	
	@Override
	public void save(Bzj entity) {
		ht.saveOrUpdate(entity);		
	}

	@Override
	public void update(Bzj entity) {
		
		
	}

	@Override
	public void delete(Bzj entity) {
		//
		
	}

	@Override
	public Bzj find(String arg){
		return null;
	}

}
