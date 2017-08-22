package cn.lyl.ssm.dao;

import java.util.List;

import cn.lyl.ssm.po.Yscd;

public interface YscdDao {
	List<Yscd> cysFindAll(String arg);
	List<Yscd> cysFindByGlyid(String arg);
}
