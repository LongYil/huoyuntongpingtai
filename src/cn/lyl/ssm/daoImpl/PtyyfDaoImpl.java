package cn.lyl.ssm.daoImpl;

import org.springframework.stereotype.Component;

import cn.lyl.ssm.dao.PtyyfDao;
import cn.lyl.ssm.po.Ptyyf;

@Component(value="ptyyfDaoImpl")
public class PtyyfDaoImpl extends CommonDaoImpl<Ptyyf> implements PtyyfDao {

	@Override
	public void save(Ptyyf entity) {
		ht.save(entity);		
	}

	@Override
	public void update(Ptyyf entity) {
		//
		
	}

	@Override
	public void delete(Ptyyf entity) {
		//
		
	}

	@Override
	public Ptyyf find(String arg) {
		//
		return null;
	}



}
