package cn.lyl.ssm.daoImpl;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import cn.lyl.ssm.dao.CysDao;
import cn.lyl.ssm.po.Cys;

@Component(value="cysDaoImpl")
@Scope(value="prototype")
public class CysDaoImpl extends CommonDaoImpl<Cys> implements CysDao {

	@Override
	public Cys find(String arg) {
		//
		return null;
	}

}
