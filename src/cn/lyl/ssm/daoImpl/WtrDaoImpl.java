package cn.lyl.ssm.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import cn.lyl.ssm.dao.WtrDao;
import cn.lyl.ssm.po.Wtr;

@Component(value="wtrDaoImpl")
@Scope(value="prototype")
public class WtrDaoImpl extends CommonDaoImpl<Wtr> implements WtrDao {

	private List<Wtr> list = new ArrayList<Wtr>();
	@Autowired
	private Wtr wtr;

	@Override
	public Wtr find(String arg) {
		list.clear();
		list = (List<Wtr>) ht.find("from Wtr where yhbh="+arg+"");
		if(list!=null&&list.size()>0){
			return list.get(0);
		}else{
			return wtr;
		}
	}

	@Override
	public List<Wtr> findAll() {
		return (List<Wtr>) ht.find("from Wtr");
	}

}
