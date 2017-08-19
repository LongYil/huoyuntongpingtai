package cn.lyl.ssm.utils;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Component;

import cn.lyl.ssm.po.Yhzh;

/**
 * <p>Title:GetEntity</p>
 * <p>Description:根据非主键获取实体的工具类，参数为表名、用户编号 </p>
 * @author 李银龙
 *		2017年8月19日
 *		下午3:50:34
 */
@Component(value="getEntity")
@Scope(value="prototype")
public class GetEntity {
	@Autowired
	public HibernateTemplate ht;
	private List<Object> list = new ArrayList<Object>();
	private Object t ;
	
	public Object getEntity(String table,String arg,Class type) throws Exception{
		t = type.newInstance();
		list = (List<Object>) ht.find("from "+table+" where yhbh = "+arg+"");
		if(list!=null&&list.size()>0){
			return list.get(0);
		}else{
			return t;
		}
	}
}
