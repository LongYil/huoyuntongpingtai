package cn.lyl.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.lyl.ssm.daoImpl.BzjDaoImpl;
import cn.lyl.ssm.po.Bzj;
import cn.lyl.ssm.po.Jyjl;
import cn.lyl.ssm.po.Ptzh;
import cn.lyl.ssm.utils.GetDateAndTime;
import cn.lyl.ssm.utils.GetEntity;

@Transactional
@Service(value="bzjServc")
public class BzjServc extends CommonSevc<Bzj,BzjDaoImpl> {
	
	@Autowired	
	private PtzhServc ptzhServc;
	@Autowired
	private Jyjl jyjl;
	@Autowired
	private JyjlServc jyjlServc;
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
			bzj.setKsqje(bzj.getBzjje()-bzj.getYsqje());
			daoImpl.save(bzj);
			jyjl.setJyje(num);
			jyjl.setJysj(getDateAndTime.getNowDate());
			jyjl.setJyzt(2);
			jyjl.setJylx(4);
			jyjl.setYhbh(Integer.parseInt(yhbh));
			jyjlServc.save(jyjl);
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
		
	}
	
	public boolean cysFqjd(String num,String yhbh) throws Exception{
		bzj = this.find("yhbh");
		int tempnum = bzj.getYsqje()+Integer.parseInt(num);
		if(bzj.getBzjje()>tempnum|bzj.getBzjje()==tempnum){
			jyjl.setJyje(Integer.parseInt(num));
			jyjl.setJysj(getDateAndTime.getNowDate());
			jyjl.setJyzt(1);
			jyjl.setJylx(5);
			jyjl.setYhbh(Integer.parseInt(yhbh));
			bzj.setKsqje(bzj.getBzjje()-tempnum);
			bzj.setYsqje(tempnum);
			
			daoImpl.save(bzj);
			jyjlServc.save(jyjl);
			return true;
		}else{
			return false;
		}

	}

}
