package cn.lyl.ssm.dao;

import java.util.List;

import cn.lyl.ssm.po.Clxx;
import cn.lyl.ssm.vo.ClxxVo;

public interface ClxxDao {
	List<Clxx> findByCdid(String arg);
	List<ClxxVo> findByYhbh(String arg);
}
