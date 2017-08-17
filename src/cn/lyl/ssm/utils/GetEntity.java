package cn.lyl.ssm.utils;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Component;

@Component(value="getEntity")
@Scope(value="prototype")
public class GetEntity {
	@Autowired
	public HibernateTemplate ht;
	private List<Object> list = new ArrayList<Object>();
	private Object t = new Object();
	
	public Object getEntity(String table,String arg){
		list = (List<Object>) ht.find("from "+table+" where yhbh = "+arg+"");
		if(list!=null&&list.size()>0){
			return list.get(0);
		}else{
			return t;
		}
	}
}
