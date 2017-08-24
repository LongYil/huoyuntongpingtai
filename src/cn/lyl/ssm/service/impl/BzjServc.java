package cn.lyl.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.lyl.ssm.daoImpl.BzjDaoImpl;
import cn.lyl.ssm.po.Bzj;
import cn.lyl.ssm.po.Jnjl;
import cn.lyl.ssm.po.Ptzh;
import cn.lyl.ssm.utils.GetDateAndTime;
import cn.lyl.ssm.utils.GetEntity;

@Transactional
@Service(value="bzjServc")
public class BzjServc extends CommonSevc<Bzj, BzjDaoImpl> {
	
	@Autowired	
	private PtzhServc ptzhServc;
	@Autowired
	private JnjlServc jnjlServc;
	@Autowired
	private Jnjl jnjl;
	@Autowired
	private Ptzh ptzh;
	@Autowired
	private Bzj bzj;
	@Autowired
	private GetEntity getEntity;
	@Autowired
	private GetDateAndTime getDateAndTime;
	@Override
	public void save(Bzj arg) {
		daoImpl.save(arg);		
	}
	
	public boolean checkAndSave(String arg,String yhbh) throws Exception{
		ptzh = ptzhServc.find(yhbh);
		bzj = this.find(yhbh);
		int num = Integer.parseInt(arg);
		if(ptzh.getZhye()>num){
			ptzh.setZhye(ptzh.getZhye()-num);
			bzj.setBzjje(bzj.getBzjje()+num);
			daoImpl.save(bzj);
			
			jnjl.setJyje(num);
			jnjl.setJysj(getDateAndTime.getNowDate());
			jnjl.setJyzt("缴纳保证金");
			jnjl.setYhbh(Integer.parseInt(yhbh));
			jnjlServc.save(jnjl);
			return true;
		}else{
			return false;
		}
	}
	
	@Override
	public Bzj find(String arg) throws Exception {
		return (Bzj) getEntity.getEntity("Bzj", "yhbh", arg, Bzj.class);
	}

	@Override
	public List<Bzj> findAll(String arg) {
		
		return null;
	}

	@Override
	public void delete(Bzj arg) {
		//
		
	}

}
