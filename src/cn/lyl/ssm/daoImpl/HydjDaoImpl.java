package cn.lyl.ssm.daoImpl;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import cn.lyl.ssm.dao.HydjDao;
import cn.lyl.ssm.po.Hydj;

@Component(value="hydjDaoImpl")
@Scope(value="prototype")
public class HydjDaoImpl extends CommonDaoImpl<Hydj> implements HydjDao {

	@Override
	public Hydj find(String arg) throws Exception {
		return (Hydj) getEntity.getEntity("Hydj", "yhbh", arg, Hydj.class);
	}
	
}
