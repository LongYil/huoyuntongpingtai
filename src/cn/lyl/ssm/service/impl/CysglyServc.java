package cn.lyl.ssm.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.lyl.ssm.daoImpl.CysglyDaoImpl;
import cn.lyl.ssm.po.Cysgly;
import cn.lyl.ssm.po.Hygly;

@Transactional
@Service(value="cysglyServc")
public class CysglyServc extends CommonSevc<Cysgly, CysglyDaoImpl> {
	
	private List<Cysgly> listgly = new ArrayList<Cysgly>();
	private List<Cysgly> templistgly = new ArrayList<Cysgly>();
	private Cysgly cysgly;
	@Autowired
	private HyglyServc hyglyServc;
	
	private List<Hygly> listhygly = new ArrayList<Hygly>();
	
	@Override
	public void save(Cysgly arg) {
		daoImpl.save(arg);		
	}

	@Override
	public Cysgly find(String arg) throws Exception{
		return daoImpl.find(arg);
	}

	@Override
	public List<Cysgly> findAll(String arg) {
		return daoImpl.findAll(arg);
	}

	@Override
	public void delete(Cysgly arg) {
		daoImpl.delete(arg);		
	}
	
	public void update(Cysgly arg){
		daoImpl.update(arg);
	}
	
	public void szsyCysGly(String id,String yhbh){
		listgly.clear();
		listgly = daoImpl.findAllByCysbh(yhbh);

		for(int i=0;i<listgly.size();i++){
			cysgly = new Cysgly();
			cysgly = listgly.get(i);
			cysgly.setDlbh(Integer.parseInt(id));
			this.update(cysgly);
		}
	}
	
	public Cysgly findByGlyid(String arg) throws Exception{
		return daoImpl.findByGlyid(arg);
	}
	
	public List<Cysgly> findByDlbh(String arg){
		return daoImpl.findByDlbh(arg);
	}
	
	public List<Cysgly> hyglyFindAllCys(String arg) throws Exception{//参数为货运代理点用户编号
		listgly.clear();
		listhygly.clear();
		templistgly.clear();
		
		listhygly = hyglyServc.findByYhbh(arg);
		for(int i=0;i<listhygly.size();i++){
			templistgly.clear();
			templistgly = this.findByDlbh(String.valueOf(listhygly.get(i).getGlybh()));
			if(templistgly!=null&templistgly.size()>0){
				listgly.addAll(templistgly);
			}else{
				;
			}
		}
		return listgly;
	}
	
	public List<Cysgly> findByHyglyid(String arg){
		return daoImpl.findByHyglyid(arg);	
	}
	
	
}
