package cn.lyl.ssm.dao;

import java.util.List;

import cn.lyl.ssm.po.Ptjs;

public interface PtjsDao extends ICommonDao<Ptjs>{
	List<Ptjs> findAll(String arg);
}
