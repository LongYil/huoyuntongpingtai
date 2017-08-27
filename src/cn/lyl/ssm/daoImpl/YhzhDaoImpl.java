package cn.lyl.ssm.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cn.lyl.ssm.dao.YhzhDao;
import cn.lyl.ssm.po.Yhzh;
import cn.lyl.ssm.utils.GetEntity;

@Component(value="yhzhDaoImpl")
public class YhzhDaoImpl extends CommonDaoImpl<Yhzh> implements YhzhDao {
	@Autowired
	private Yhzh yhzh;
	@Autowired
	private GetEntity getEntity;
	
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
