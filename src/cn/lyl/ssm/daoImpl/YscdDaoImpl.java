package cn.lyl.ssm.daoImpl;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import cn.lyl.ssm.po.Yscd;

@Component(value="yscdDaoImpl")
@Scope(value="prototype")
public class YscdDaoImpl extends CommonDaoImpl<Yscd> {

	@Override
	public void save(Yscd entity) {
		ht.save(entity);		
	}

	@Override
	public void update(Yscd entity) {
		//
		
	}

	@Override
	public void delete(Yscd entity) {
		//
		
	}

	@Override
	public Yscd find(String arg) {
		//
		return null;
	}

}
