package cn.lyl.ssm.daoImpl;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import cn.lyl.ssm.dao.TxjlDao;
import cn.lyl.ssm.po.Txjl;

@Component(value="txjlDaoImpl")
@Scope(value="prototype")
public class TxjlDaoImpl extends CommonDaoImpl<Txjl> implements TxjlDao {

	@Override
	public Txjl find(String arg) {
		//
		return null;
	}

}
