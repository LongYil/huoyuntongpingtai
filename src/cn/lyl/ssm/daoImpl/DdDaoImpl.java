package cn.lyl.ssm.daoImpl;

import java.util.List;

import org.springframework.stereotype.Component;

import cn.lyl.ssm.dao.DdDao;
import cn.lyl.ssm.po.Dd;

@Component(value="ddDaoImpl")
public class DdDaoImpl extends CommonDaoImpl<Dd> implements DdDao {

	@Override
	public void save(Dd entity) {
		ht.save(entity);		
	}

	@Override
	public void update(Dd entity) {
		//
		
	}

	@Override
	public void delete(Dd entity) {
		//
		
	}

	@Override
	public Dd find(String arg) {
		//
		return null;
	}

	@Override
	public List<Dd> findAll(String column, String ztid,String yhid) {
		return (List<Dd>) ht.find("from Dd where "+column+" = "+yhid+"and ddzt = "+ztid+"");
	}

}
