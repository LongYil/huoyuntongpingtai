package cn.lyl.ssm.daoImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cn.lyl.ssm.dao.PtzhDao;
import cn.lyl.ssm.po.Ptzh;
import cn.lyl.ssm.utils.GetEntity;

@Component(value="ptzhDaoImpl")
public class PtzhDaoImpl extends CommonDaoImpl<Ptzh> implements PtzhDao {

	@Autowired
	private GetEntity getEntity;
	
	@Override
	public void save(Ptzh entity) {
		ht.saveOrUpdate(entity);	
	}

	@Override
	public void update(Ptzh entity) {
		//
		
	}

	@Override
	public void delete(Ptzh entity) {
		//
		
	}

	@Override
	public Ptzh find(String arg) throws Exception {
		return (Ptzh) getEntity.getEntity("Ptzh", "yhbh", arg, Ptzh.class);
	}

}
