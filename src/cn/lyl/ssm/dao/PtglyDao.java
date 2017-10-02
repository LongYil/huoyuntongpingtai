package cn.lyl.ssm.dao;

import java.util.List;

import cn.lyl.ssm.po.Ptgly;

public interface PtglyDao {
	List<Ptgly> findAll(String arg);
	Ptgly findById(String arg);
}
