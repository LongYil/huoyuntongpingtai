package cn.lyl.ssm.dao;

import java.util.List;

import cn.lyl.ssm.po.Wlx;
import cn.lyl.ssm.vo.WlxVo;

public interface WlxDao {
	List<Wlx> findAll(String arg);
	List<Wlx> findByCysid(String arg);
	List<WlxVo> findByCysYhid(String arg);
	
}
