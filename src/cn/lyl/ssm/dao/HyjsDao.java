package cn.lyl.ssm.dao;

import java.util.List;

import cn.lyl.ssm.po.Hyjs;

public interface HyjsDao {
	List<Hyjs> findAll(String arg);
}
