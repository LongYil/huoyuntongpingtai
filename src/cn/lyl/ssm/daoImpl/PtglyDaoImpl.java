package cn.lyl.ssm.daoImpl;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import cn.lyl.ssm.dao.PtglyDao;
import cn.lyl.ssm.po.Ptgly;

@Component(value="ptglyDaoImpl")
@Scope(value="prototype")
public class PtglyDaoImpl extends CommonDaoImpl<Ptgly> implements PtglyDao {

	@Override
	public void save(Ptgly entity) {
		ht.save(entity);		
	}

	@Override
	public void update(Ptgly entity) {
		//
		
	}

	@Override
	public void delete(Ptgly entity) {
		//
		
	}

	@Override
	public Ptgly find(String arg) {
		//
		return null;
	}

}
