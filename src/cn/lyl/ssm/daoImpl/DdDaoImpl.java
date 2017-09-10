package cn.lyl.ssm.daoImpl;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import cn.lyl.ssm.dao.DdDao;
import cn.lyl.ssm.po.Dd;

@Component(value="ddDaoImpl")
@Scope(value="prototype")
public class DdDaoImpl extends CommonDaoImpl<Dd> implements DdDao {

	@Override
	public void save(Dd entity) {
		ht.save(entity);		
	}

	@Override
	public void update(Dd entity) {
		ht.update(entity);		
	}

	@Override
	public void delete(Dd entity) {
		ht.delete(entity);		
	}

	@Override
	public Dd find(String arg) {
		return ht.get(Dd.class,Integer.parseInt(arg));
	}

	@Override
	public List<Dd> findByDdzt(String column, String ztid,String yhid) {
		return (List<Dd>) ht.find("from Dd where "+column+" = "+yhid+"and ddzt = "+ztid+"");
	}

	@Override
	public List<Dd> findAllByYhlx(String column, String yhid) {
		return (List<Dd>) ht.find("from Dd where "+column+" = "+yhid+"");
	}

	@Override
	public List<Dd> findAllFhAndSh(String yhid) {
		return (List<Dd>) ht.find("from Dd where fhdld = "+yhid+" or shdld = "+yhid+" ");
	}

	@Override
	public List<Dd> cysFindAll(String yhid) {
		return (List<Dd>) ht.find("from Dd where cys = "+yhid+"");
	}

	@Override
	public List<Dd> wtrFindWfk(String yhbh) {
		return (List<Dd>) ht.find("from Dd where wtrbh = "+yhbh+" and fkzt = 1");
	}

	@Override
	public List<Dd> cysFindAllDd(String id, String glybh) {
		return (List<Dd>) ht.find("from Dd where cys = "+glybh+" and  ddzt = "+id+"");
	}


}
