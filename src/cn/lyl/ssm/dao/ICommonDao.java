package cn.lyl.ssm.dao;

public interface ICommonDao<T>{
	public void save(T entity);
	public void update(T entity);
	public void delete(T entity);
	public T find(String arg);
}