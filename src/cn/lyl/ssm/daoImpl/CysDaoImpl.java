package cn.lyl.ssm.daoImpl;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import cn.lyl.ssm.dao.CysDao;
import cn.lyl.ssm.po.Cys;

@Component(value="cysDaoImpl")
@Scope(value="prototype")
public class CysDaoImpl extends CommonDaoImpl<Cys> implements CysDao {

	@Override
	public void save(Cys entity) {
		ht.save(entity);		
	}

	@Override
	public void update(Cys entity) {
		//
		
	}

	@Override
	public void delete(Cys entity) {
		//
		
	}

	@Override
	public Cys find(String arg) {
		//
		return null;
	}

}
