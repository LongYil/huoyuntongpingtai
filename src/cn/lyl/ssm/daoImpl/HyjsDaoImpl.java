package cn.lyl.ssm.daoImpl;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import cn.lyl.ssm.dao.HyjsDao;
import cn.lyl.ssm.po.Hyjs;

@Component(value="hyjsDaoImpl")
@Scope(value="prototype")
public class HyjsDaoImpl extends CommonDaoImpl<Hyjs> implements HyjsDao {

	@Override
	public Hyjs find(String arg) throws Exception {
		return ht.get(Hyjs.class,Integer.parseInt(arg));
	}

	@Override
	public List<Hyjs> findAll(String arg) {
		return (List<Hyjs>) ht.find("from Hyjs where yhbh = "+arg+"");
	}

}
