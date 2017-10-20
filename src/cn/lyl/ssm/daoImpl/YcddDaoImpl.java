package cn.lyl.ssm.daoImpl;

import org.springframework.stereotype.Component;

import cn.lyl.ssm.dao.YcddDao;
import cn.lyl.ssm.po.Ycdd;

@Component(value="ycddDaoImpl")
public class YcddDaoImpl extends CommonDaoImpl<Ycdd> implements YcddDao {

	@Override
	public Ycdd find(String arg) throws Exception {
		return (Ycdd) getEntity.getEntity("Ycdd", "ddbh",arg,Ycdd.class);
	}

	
}
