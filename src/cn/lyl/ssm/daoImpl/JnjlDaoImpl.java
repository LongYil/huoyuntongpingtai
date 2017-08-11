package cn.lyl.ssm.daoImpl;

import java.util.List;

import org.springframework.stereotype.Component;

import cn.lyl.ssm.dao.JnjlDao;
import cn.lyl.ssm.po.Jbyh;
import cn.lyl.ssm.po.Jnjl;

@Component(value="jnjlDaoImpl")
public class JnjlDaoImpl extends CommonDaoImpl<Jnjl> implements JnjlDao {

	@Override
	public void save(Jnjl entity) {
		ht.save(entity);		
	}

	@Override
	public void update(Jnjl entity) {
		//
		
	}

	@Override
	public void delete(Jnjl entity) {
		//
		
	}

	@Override
	public Jnjl find(String arg) {
		//
		return null;
	}



}
