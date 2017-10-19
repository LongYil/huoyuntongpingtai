package cn.lyl.ssm.daoImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;

import cn.lyl.ssm.dao.ICommonDao;
import cn.lyl.ssm.utils.GetDateAndTime;
import cn.lyl.ssm.utils.GetEntity;

public  class CommonDaoImpl<T> implements ICommonDao<T> {
	
	@Autowired
	public HibernateTemplate ht;
	@Autowired
	public GetDateAndTime getDateAndTime;
	@Autowired
	public GetEntity getEntity;
	@Override
	public  void save(T entity) {
		ht.saveOrUpdate(entity);
	}

	@Override
	public void update(T entity) {
		ht.update(entity);
	}

	@Override
	public void delete(T entity) {
		ht.delete(entity);
	}
	
	
	@Override
	public T find(String arg) throws Exception {
		return null;
	}
	
	
}
