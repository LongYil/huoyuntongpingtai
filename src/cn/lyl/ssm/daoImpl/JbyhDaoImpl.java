package cn.lyl.ssm.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cn.lyl.ssm.dao.JbyhDao;
import cn.lyl.ssm.po.Cysgly;
import cn.lyl.ssm.po.Jbyh;
import cn.lyl.ssm.utils.GetEntity;


/**
 * <p>Title:JbyhImpl</p>
 * <p>Description: 基本用户Impl</p>
 * @author 李银龙
 *		2017年7月21日
 *		上午9:18:41
 */
@Component(value="jbyhImpl")
public class JbyhDaoImpl extends CommonDaoImpl<Jbyh> implements JbyhDao {

	private List<Jbyh> list = new ArrayList<Jbyh>();
	@Autowired
	private Jbyh jbyh;
	@Override
	public void save(Jbyh entity) {
		ht.save(entity);
		
	}

	@Override
	public void update(Jbyh entity) {
		ht.update(entity);		
	}

	@Override
	public void delete(Jbyh entity) {
		//
		
	}

	@Override
	public Jbyh find(String arg) {
		return ht.get(Jbyh.class, Integer.parseInt(arg));
	}

	@Override
	public int[] login(Jbyh jbyh) {

		list = (List<Jbyh>) ht.find("from Jbyh where yhsj = ? and yhmm = ?", jbyh.getYhsj(),jbyh.getYhmm());
		int[] info = new int[2] ;
		if(list.size()>0){
			info[0]=list.get(0).getYhlx();
			info[1]=list.get(0).getYhbh();
			return info;
		}else{
			return info;
		}
	}

	@Override
	public List<Jbyh> findAll(List<Cysgly> list) {
		this.list.clear();
		for (Cysgly cysgly : list) {
			jbyh = (Jbyh) ht.find("from Jbyh where yhbh = "+cysgly.getCysbh()+"").get(0);
			this.list.add(jbyh);
		}
		return this.list;
	}
	
}
