package cn.lyl.ssm.dao;

import java.util.List;

import cn.lyl.ssm.po.Jyjl;

public interface JyjlDao {
	List<Jyjl> cysFindAll(String arg);
	List<Jyjl> FindJnjl(String arg);
	List<Jyjl> FindJdjl(String arg);
	List<Jyjl> FindCzjl(String arg);
	List<Jyjl> FindTxjl(String arg);
	List<Jyjl> FindAllJdsq();
	List<Jyjl> FindAllCzsq();
	List<Jyjl> FindAllTxsq();
}
