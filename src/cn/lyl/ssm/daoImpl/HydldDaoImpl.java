package cn.lyl.ssm.daoImpl;

import org.springframework.stereotype.Component;

import cn.lyl.ssm.dao.HydldDao;
import cn.lyl.ssm.po.Hydld;

@Component(value="hydldDaoImpl")
public class HydldDaoImpl extends CommonDaoImpl<Hydld> implements HydldDao {

	@Override
	public void save(Hydld entity) {
		ht.save(entity);		
	}

	@Override
	public void update(Hydld entity) {
		//
		
	}

	@Override
	public void delete(Hydld entity) {
		//
		
	}

	@Override
	public Hydld find(String arg) {
		//
		return null;
	}

}
