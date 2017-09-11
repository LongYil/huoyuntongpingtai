package cn.lyl.ssm.daoImpl;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import cn.lyl.ssm.dao.CysjsDao;
import cn.lyl.ssm.po.Cysjs;

@Component(value="cysjsDaoImpl")
@Scope(value="prototype")
public class CysjsDaoImpl extends CommonDaoImpl<Cysjs> implements CysjsDao{

	@Override
	public void save(Cysjs entity) {
		ht.saveOrUpdate(entity);		
	}

	@Override
	public void update(Cysjs entity) {
		//
		
	}

	@Override
	public void delete(Cysjs entity) {
		//
		
	}

	@Override
	public Cysjs find(String arg) throws Exception {
		//
		return null;
	}

}
