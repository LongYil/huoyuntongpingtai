package cn.lyl.ssm.dao;

import java.util.List;

import cn.lyl.ssm.po.Cysjs;
import cn.lyl.ssm.vo.CysjsVo;

public interface CysjsDao {
	public List<Cysjs> findByCysId(String arg);
	public List<CysjsVo> findAllCysjs(String arg) throws Exception;
}
