package cn.lyl.ssm.daoImpl;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import cn.lyl.ssm.dao.JyjlDao;
import cn.lyl.ssm.po.Jyjl;


@Component(value="jyjlDaoImpl")
@Scope(value="prototype")
public class JyjlDaoImpl extends CommonDaoImpl<Jyjl> implements JyjlDao {

	@Override
	public void save(Jyjl entity) {
		ht.save(entity);
	}

	@Override
	public void update(Jyjl entity) {
		//

	}

	@Override
	public void delete(Jyjl entity) {
		//

	}

	@Override
	public Jyjl find(String arg) throws Exception {
		//
		return null;
	}

	@Override
	public List<Jyjl> cysFindAll(String arg) {
		return (List<Jyjl>) ht.find("from Jyjl where yhbh = "+arg+"");
	}

	@Override
	public List<Jyjl> FindJnjl(String arg) {
		return (List<Jyjl>) ht.find("from Jyjl where yhbh="+arg+" and jylx = 4");
	}

	@Override
	public List<Jyjl> FindJdjl(String arg) {
		return (List<Jyjl>) ht.find("from Jyjl where yhbh="+arg+" and jylx = 5");
	}

	@Override
	public List<Jyjl> FindCzjl(String arg) {
		return (List<Jyjl>) ht.find("from Jyjl where yhbh="+arg+" and jylx = 1");
	}

	@Override
	public List<Jyjl> FindTxjl(String arg) {
		return (List<Jyjl>) ht.find("from Jyjl where yhbh="+arg+" and jylx = 2");
	}

}
