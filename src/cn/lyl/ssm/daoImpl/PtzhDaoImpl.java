package cn.lyl.ssm.daoImpl;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import cn.lyl.ssm.dao.PtzhDao;
import cn.lyl.ssm.po.Ptzh;

@Component(value="ptzhDaoImpl")
@Scope(value="prototype")
public class PtzhDaoImpl extends CommonDaoImpl<Ptzh> implements PtzhDao {

	@Override
	public Ptzh find(String arg) throws Exception {
		return (Ptzh) getEntity.getEntity("Ptzh", "yhbh", arg, Ptzh.class);
	}

}
