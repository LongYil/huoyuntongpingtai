package cn.lyl.ssm.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cn.lyl.ssm.dao.YhzhDao;
import cn.lyl.ssm.po.Yhzh;

@Component(value="yhzhDaoImpl")
public class YhzhDaoImpl extends CommonDaoImpl<Yhzh> implements YhzhDao {
	@Autowired
	private Yhzh yhzh;
	private List<Yhzh> list = new ArrayList<Yhzh>();
	@Override
	public void save(Yhzh entity) {
		ht.saveOrUpdate(entity);		
	}

	@Override
	public void update(Yhzh entity) {
		ht.update(entity);
	}

	@Override
	public void delete(Yhzh entity) {
		
	}

	@Override
	public Yhzh find(String arg) {
		list = (List<Yhzh>) ht.find("from Yhzh where yhbh = "+Integer.parseInt(arg)+"");
		if(list==null||list.size()==0){
			return yhzh;
		}else{
			return list.get(0);
		}
	}

}
