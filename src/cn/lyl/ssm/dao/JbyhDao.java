package cn.lyl.ssm.dao;

import java.util.List;

import cn.lyl.ssm.po.Cysgly;
import cn.lyl.ssm.po.Hygly;
import cn.lyl.ssm.po.Jbyh;

public interface JbyhDao {
	int[] login(Jbyh jbyh);
	List<Jbyh> findAll(List<Cysgly> list);
	List<Jbyh> getJbyhByHygly(List<Hygly> list);
	int appLogin(Jbyh jbyh);
}
