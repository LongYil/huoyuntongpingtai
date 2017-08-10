package cn.lyl.ssm.daoImpl;

import org.springframework.stereotype.Component;

import cn.lyl.ssm.dao.WtrDao;
import cn.lyl.ssm.po.Wtr;

@Component(value="wtrDaoImpl")
public class WtrDaoImpl extends CommonDaoImpl<Wtr> implements WtrDao {

	@Override
	public void save(Wtr entity) {
		ht.save(entity);		
	}

	@Override
	public void update(Wtr entity) {
		//
		
	}

	@Override
	public void delete(Wtr entity) {
		//
		
	}

	@Override
	public Wtr find(String arg) {
		//
		return null;
	}

}
