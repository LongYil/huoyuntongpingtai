package cn.lyl.ssm.dao;

import java.util.List;

import cn.lyl.ssm.po.Lxr;

public interface LxrDao {
	List<Lxr> findAll(String arg);
}
