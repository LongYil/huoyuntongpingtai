package cn.lyl.ssm.dao;

import java.util.List;

import cn.lyl.ssm.po.Dd;

public interface DdDao {
	List<Dd> findAll(String column,String ztid,String yhid);
}
