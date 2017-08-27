package cn.lyl.ssm.daoImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;

import cn.lyl.ssm.dao.ICommonDao;
import cn.lyl.ssm.utils.GetDateAndTime;

public abstract class CommonDaoImpl<T> implements ICommonDao<T> {
	
	@Autowired
	public HibernateTemplate ht;
	@Autowired
	public GetDateAndTime getDateAndTime;
	@Override
	public abstract void save(T entity) ;

	@Override
	public abstract void update(T entity) ;

	@Override
	public abstract void delete(T entity) ;
	
	@Override
	public abstract T find(String arg) throws Exception;
	
	
}
