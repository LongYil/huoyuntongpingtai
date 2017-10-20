package cn.lyl.ssm.daoImpl;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import cn.lyl.ssm.dao.PtglyDao;
import cn.lyl.ssm.po.Ptgly;

@Component(value="ptglyDaoImpl")
@Scope(value="prototype")
public class PtglyDaoImpl extends CommonDaoImpl<Ptgly> implements PtglyDao {

	@Override
	public Ptgly find(String arg) throws Exception {
		return (Ptgly) getEntity.getEntity("Ptgly", "glybh", arg, Ptgly.class);
	}
	
	

	@Override
	public List<Ptgly> findAll(String arg) {
		return (List<Ptgly>) ht.find("from Ptgly where yhbh = "+arg+" and yhbh!=glybh");
	}

	@Override
	public Ptgly findById(String arg) {
		return ht.get(Ptgly.class,Integer.parseInt(arg));
	}
	
	
}
