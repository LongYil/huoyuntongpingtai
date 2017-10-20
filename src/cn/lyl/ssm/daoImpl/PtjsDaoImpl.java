package cn.lyl.ssm.daoImpl;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import cn.lyl.ssm.dao.PtjsDao;
import cn.lyl.ssm.po.Ptjs;

@Component(value="ptjsDaoImpl")
@Scope(value="prototype")
public class PtjsDaoImpl extends CommonDaoImpl<Ptjs> implements PtjsDao {

	@Override
	public Ptjs find(String arg) throws Exception {
		return (Ptjs) getEntity.getEntity("Ptjs", "id", arg, Ptjs.class);
	}

	@Override
	public List<Ptjs> findAll(String arg) {
		return (List<Ptjs>) ht.find("from Ptjs");
	}
	
}
