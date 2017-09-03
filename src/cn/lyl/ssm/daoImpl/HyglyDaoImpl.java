package cn.lyl.ssm.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import cn.lyl.ssm.dao.HyglyDao;
import cn.lyl.ssm.po.Dd;
import cn.lyl.ssm.po.Hygly;
import cn.lyl.ssm.utils.GetEntity;

@Component(value="hyglyDaoImpl")
@Scope(value="prototype")
public class HyglyDaoImpl extends CommonDaoImpl<Hygly> implements HyglyDao {

	private List<Hygly> list = new ArrayList<Hygly>();

	@Autowired
	private Hygly hygly;
	
	@Override
	public void save(Hygly entity) {
		ht.save(entity);		
	}

	@Override
	public void update(Hygly entity) {
		//
		
	}

	@Override
	public void delete(Hygly entity) {
		ht.delete(entity);
	}

	@Override
	public Hygly find(String arg) throws Exception {
		return (Hygly) getEntity.getEntity("Hygly", "glybh", arg, Hygly.class);
	}

	@Override
	public List<Hygly> findAll() {
		return (List<Hygly>) ht.find("from Hygly");
	}

	@Override
	public List<Hygly> findByYhbh(String arg) {
		return (List<Hygly>) ht.find("from Hygly where yhbh = "+arg+"");
	}

	@Override
	public List<Hygly> findByShdz(Dd dd) {
		return (List<Hygly>) ht.find("from Hygly where szsf = ? and szcs = ? and szx = ?",dd.getDdsf(),dd.getDdcs(),dd.getDdx());
	}

	@Override
	public List<Hygly> yhFindAllGly(String arg) {
		return (List<Hygly>) ht.find("from Hygly where yhbh = "+arg+" and yhbh!=glybh");
	}

	@Override
	public Hygly getById(Integer id) {
		return ht.get(Hygly.class, id);
	}
	
	
	
	
	
}
