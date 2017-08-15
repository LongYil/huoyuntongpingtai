package cn.lyl.ssm.dao;

import java.util.List;

import cn.lyl.ssm.po.Wlx;

public interface WlxDao {
	List<Wlx> findAll(String arg);
}
