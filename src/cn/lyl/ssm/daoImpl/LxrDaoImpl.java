package cn.lyl.ssm.daoImpl;

import org.springframework.stereotype.Component;

import cn.lyl.ssm.dao.LxrDao;
import cn.lyl.ssm.po.Lxr;

@Component(value="lxrDaoImpl")
public class LxrDaoImpl extends CommonDaoImpl<Lxr> implements LxrDao {

	@Override
	public void save(Lxr entity) {
		ht.save(entity);		
	}

	@Override
	public void update(Lxr entity) {
		//
		
	}

	@Override
	public void delete(Lxr entity) {
		//
		
	}

	@Override
	public Lxr find(String arg) {
		//
		return null;
	}

}
