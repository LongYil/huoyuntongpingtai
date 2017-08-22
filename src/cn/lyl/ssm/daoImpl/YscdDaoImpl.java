package cn.lyl.ssm.daoImpl;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import cn.lyl.ssm.dao.YscdDao;
import cn.lyl.ssm.po.Yscd;

@Component(value="yscdDaoImpl")
@Scope(value="prototype")
public class YscdDaoImpl extends CommonDaoImpl<Yscd> implements YscdDao{

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

	@Override
	public List<Yscd> cysFindAll(String arg) {
		return (List<Yscd>) ht.find("from Yscd where fpzt = 0 and yhbh = "+arg+"");
	}

	@Override
	public List<Yscd> cysFindByGlyid(String arg) {
		return (List<Yscd>) ht.find("from Yscd where cysbh = "+arg+"");
	}
	
	
	
	
	
	
}
