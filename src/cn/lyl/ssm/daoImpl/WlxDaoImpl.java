package cn.lyl.ssm.daoImpl;

import java.util.List;

import org.springframework.stereotype.Component;

import cn.lyl.ssm.dao.WlxDao;
import cn.lyl.ssm.po.Wlx;

@Component(value="wlxDaoImpl")
public class WlxDaoImpl extends CommonDaoImpl<Wlx> implements WlxDao {

	@Override
	public void save(Wlx entity) {
		ht.save(entity);		
	}

	@Override
	public void update(Wlx entity) {
		//
		
	}

	@Override
	public void delete(Wlx entity) {
		//
		
	}

	@Override
	public Wlx find(String arg) {
		//
		return null;
	}

	@Override
	public List<Wlx> findAll(String arg) {
		return (List<Wlx>) ht.find("from Wlx where yhbh = "+arg+"");
	}
	
}
