package cn.lyl.ssm.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cn.lyl.ssm.dao.HyglyDao;
import cn.lyl.ssm.po.Hygly;

@Component(value="hyglyDaoImpl")
public class HyglyDaoImpl extends CommonDaoImpl<Hygly> implements HyglyDao {

	private List<Hygly> list = new ArrayList<Hygly>();
	
	@Autowired
	private Hygly hygly;
	
	@Override
	public void save(Hygly entity) {
		ht.save(entity);		
	}

	@Override
	public void update(Hygly entity) {
		//
		
	}

	@Override
	public void delete(Hygly entity) {
		//
		
	}

	@Override
	public Hygly find(String arg) {
		list = (List<Hygly>) ht.find("from Hygly where yhbh = "+arg+"");
		if(list!=null&&list.size()>0){
			return list.get(0);
		}else{
			return hygly;
		}
	}

}
