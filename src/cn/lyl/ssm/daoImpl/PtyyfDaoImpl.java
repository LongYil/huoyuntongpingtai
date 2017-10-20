package cn.lyl.ssm.daoImpl;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import cn.lyl.ssm.dao.PtyyfDao;
import cn.lyl.ssm.po.Ptyyf;

@Component(value="ptyyfDaoImpl")
@Scope(value="prototype")
public class PtyyfDaoImpl extends CommonDaoImpl<Ptyyf> implements PtyyfDao {

	@Override
	public Ptyyf find(String arg) {
		//
		return null;
	}



}
