package cn.lyl.ssm.dao;

import java.util.List;

import cn.lyl.ssm.po.Yscd;

public interface YscdDao {
	List<Yscd> cysFindAll(String arg);
	List<Yscd> jbyhFindAll(String arg);
	List<Yscd> cysFindByGlyid(String arg);
	void jbyhAddCdToGly(List<Yscd> listcd,String arg2);
	
}
