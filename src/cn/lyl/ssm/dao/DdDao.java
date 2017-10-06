package cn.lyl.ssm.dao;

import java.util.List;

import cn.lyl.ssm.po.Dd;

public interface DdDao {
	List<Dd> findByDdzt(String column,String ztid,String yhid);
	List<Dd> findAllByYhlx(String column,String yhid);
	List<Dd> findAllFhAndSh(String yhid);
	List<Dd> cysFindAll(String yhid);
	List<Dd> wtrFindWfk(String yhbh);
	List<Dd> cysFindAllDd(String id,String glybh);
	List<Dd> ptFindAllYcdd(String arg);
	List<Dd> ptFindAllWwcDd(String yhbh);
}
