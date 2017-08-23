package cn.lyl.ssm.daoImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cn.lyl.ssm.dao.HydldDao;
import cn.lyl.ssm.po.Hydld;
import cn.lyl.ssm.utils.GetEntity;

@Component(value="hydldDaoImpl")
public class HydldDaoImpl extends CommonDaoImpl<Hydld> implements HydldDao {

	@Autowired
	private GetEntity getEntity ;
	
	@Override
	public void save(Hydld entity) {
		ht.save(entity);		
	}

	@Override
	public void update(Hydld entity) {
		//
	}

	@Override
	public void delete(Hydld entity) {
		//
	}

	@Override
	public Hydld find(String arg) throws Exception {
		return (Hydld) getEntity.getEntity("Hydld","yhbh",arg,Hydld.class);
	}

}
