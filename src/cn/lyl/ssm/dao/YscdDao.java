package cn.lyl.ssm.dao;

import java.util.List;

import cn.lyl.ssm.po.Cysgly;
import cn.lyl.ssm.po.Yscd;
import cn.lyl.ssm.vo.YscdVo;

public interface YscdDao {
	List<Yscd> cysFindAll(String arg);
	List<Yscd> jbyhFindAll(String arg);
	List<Yscd> cysglyFindAll(String arg);
	List<Yscd> cysFindByGlyid(String arg);
	void jbyhAddCdToGly(List<Yscd> listcd,String arg2);
	List<YscdVo> findYscdByCysgly(List<Cysgly> list) throws Exception;
}
