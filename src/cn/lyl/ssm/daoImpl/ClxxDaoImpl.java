package cn.lyl.ssm.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cn.lyl.ssm.dao.ClxxDao;
import cn.lyl.ssm.po.Clxx;

/**
 * <p>Title:ClxxDaoImpl</p>
 * <p>Description:车辆信息dao实现类 </p>
 * @author 李银龙
 *		2017年8月15日
 *		下午5:47:55
 */
@Component(value="clxxDaoImpl")
public class ClxxDaoImpl extends CommonDaoImpl<Clxx> implements ClxxDao {
	
	private List<Clxx> list = new ArrayList<Clxx>();
	@Autowired
	private Clxx clxx;
	@Override
	public void save(Clxx entity) {
		ht.save(entity);		
	}

	@Override
	public void update(Clxx entity) {
		//
		
	}

	@Override
	public void delete(Clxx entity) {
		//
		
	}

	@Override
	public Clxx find(String arg) {
		list = (List<Clxx>) ht.find("from Clxx where yhbh = "+arg+"");
		if(list!=null&&list.size()!=0){
			return list.get(0);
		}else{
			return clxx;
		}
	}

}
