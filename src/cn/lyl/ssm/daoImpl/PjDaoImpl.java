package cn.lyl.ssm.daoImpl;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import cn.lyl.ssm.dao.PjDao;
import cn.lyl.ssm.po.Pj;

@Component(value="pjDaoImpl")
@Scope(value="prototype")
public class PjDaoImpl extends CommonDaoImpl<Pj> implements PjDao{

	@Override
	public Pj find(String arg) throws Exception {
		//
		return null;
	}

}
