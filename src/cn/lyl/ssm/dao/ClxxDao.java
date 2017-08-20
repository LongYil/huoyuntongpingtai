package cn.lyl.ssm.dao;

import java.util.List;

import cn.lyl.ssm.po.Clxx;

public interface ClxxDao {
	List<Clxx> findByCdid(String arg);
}
