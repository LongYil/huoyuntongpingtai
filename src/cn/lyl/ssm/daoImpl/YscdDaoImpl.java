package cn.lyl.ssm.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import cn.lyl.ssm.dao.YscdDao;
import cn.lyl.ssm.po.Yscd;
import cn.lyl.ssm.utils.GetEntity;

@Component(value="yscdDaoImpl")
@Scope(value="prototype")
public class YscdDaoImpl extends CommonDaoImpl<Yscd> implements YscdDao{
	
	@Autowired
	private GetEntity getEntity;
	
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
	public Yscd find(String arg) throws Exception {
		return (Yscd) getEntity.getEntity("Yscd","cdbh",arg,Yscd.class);
	}

	@Override
	public List<Yscd> cysFindAll(String arg) {
		return (List<Yscd>) ht.find("from Yscd where fpzt = 0 and yhbh = "+arg+"");
	}

	@Override
	public List<Yscd> cysFindByGlyid(String arg) {
		return (List<Yscd>) ht.find("from Yscd where cysbh = "+arg+"");
	}

	@Override
	public void jbyhAddCdToGly(List<Yscd> listcd, String arg2) {
		for (Yscd yscd : listcd) {
			yscd.setFpzt(1);
			yscd.setCysbh(Integer.parseInt(arg2));
			ht.update(yscd);
		}
	}

	@Override
	public List<Yscd> jbyhFindAll(String arg) {
		return (List<Yscd>) ht.find("from Yscd where yhbh = "+arg+"");
	}
	
	
	
	
	
	
}