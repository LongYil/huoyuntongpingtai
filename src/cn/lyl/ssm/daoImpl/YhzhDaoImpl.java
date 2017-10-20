package cn.lyl.ssm.daoImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import cn.lyl.ssm.dao.YhzhDao;
import cn.lyl.ssm.po.Yhzh;

@Component(value="yhzhDaoImpl")
@Scope(value="prototype")
public class YhzhDaoImpl extends CommonDaoImpl<Yhzh> implements YhzhDao {
	@Autowired
	private Yhzh yhzh;

	@Override
	public Yhzh find(String arg) throws Exception {
		return (Yhzh) getEntity.getEntity("Yhzh","yhbh",arg,Yhzh.class);
	}

}
