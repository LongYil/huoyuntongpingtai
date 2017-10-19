package cn.lyl.ssm.daoImpl;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import cn.lyl.ssm.dao.BzjDao;
import cn.lyl.ssm.po.Bzj;

@Component(value="bzjDaoImpl")
@Scope(value="prototype")
public class BzjDaoImpl extends CommonDaoImpl<Bzj> implements BzjDao {

	@Override
	public Bzj find(String arg){
		return null;
	}

}
