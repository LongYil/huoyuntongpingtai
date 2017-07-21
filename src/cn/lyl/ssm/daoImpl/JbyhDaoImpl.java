package cn.lyl.ssm.daoImpl;

import org.springframework.stereotype.Component;

import cn.lyl.ssm.dao.JbyhDao;
import cn.lyl.ssm.po.Jbyh;


/**
 * <p>Title:JbyhImpl</p>
 * <p>Description: 基本用户Impl</p>
 * @author 李银龙
 *		2017年7月21日
 *		上午9:18:41
 */
@Component(value="jbyhImpl")
public class JbyhDaoImpl extends CommonDaoImpl<Jbyh> implements JbyhDao {

	@Override
	public void save(Jbyh entity) {
		ht.save(entity);
		
	}

	@Override
	public void update(Jbyh entity) {
		//
		
	}

	@Override
	public void delete(Jbyh entity) {
		//
		
	}

	@Override
	public Jbyh find(String arg) {
		//
		return ht.get(Jbyh.class, Integer.parseInt(arg));
	}

}
