package cn.lyl.ssm.dao;

import java.util.List;

import cn.lyl.ssm.po.Hygly;

public interface HyglyDao {
	List<Hygly> findAll();
	List<Hygly> findByYhbh(String arg);
}
