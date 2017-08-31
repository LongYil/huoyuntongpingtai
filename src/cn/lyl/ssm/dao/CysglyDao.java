package cn.lyl.ssm.dao;

import java.util.List;

import cn.lyl.ssm.po.Cysgly;

public interface CysglyDao {
	List<Cysgly> findAll(String arg);
	List<Cysgly> findAllByCysbh(String arg);
	Cysgly findByGlyid(String arg) throws Exception;
	List<Cysgly> findByDlbh(String arg);
}
