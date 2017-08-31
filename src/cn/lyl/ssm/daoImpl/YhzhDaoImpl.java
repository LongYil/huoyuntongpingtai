package cn.lyl.ssm.daoImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cn.lyl.ssm.dao.YhzhDao;
import cn.lyl.ssm.po.Yhzh;

@Component(value="yhzhDaoImpl")
public class YhzhDaoImpl extends CommonDaoImpl<Yhzh> implements YhzhDao {
	@Autowired
	private Yhzh yhzh;
	
	@Override
	public void save(Yhzh entity) {
		ht.saveOrUpdate(entity);		
	}

	@Override
	public void update(Yhzh entity) {
		ht.update(entity);
	}

	@Override
	public void delete(Yhzh entity) {
		
	}

	@Override
	public Yhzh find(String arg) throws Exception {
		return (Yhzh) getEntity.getEntity("Yhzh","yhbh",arg,Yhzh.class);
	}

}
