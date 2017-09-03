package cn.lyl.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.lyl.ssm.daoImpl.PtzhDaoImpl;
import cn.lyl.ssm.po.Jyjl;
import cn.lyl.ssm.po.Ptzh;
import cn.lyl.ssm.utils.GetEntity;

@Transactional
@Service(value="ptzhServc")
public class PtzhServc extends CommonSevc<Ptzh, PtzhDaoImpl> {
	
	@Autowired
	private GetEntity getEntity;
	@Autowired
	private Ptzh ptzh;
	@Autowired
	private Jyjl jyjl;
	@Autowired
	private JyjlServc jyjlServc;
	
	@Override
	public void save(Ptzh arg) {
		daoImpl.save(arg);
	}

	@Override
	public Ptzh find(String arg) throws Exception {
		return (Ptzh) getEntity.getEntity("Ptzh", "yhbh", arg, Ptzh.class);
	}

	@Override
	public List<Ptzh> findAll(String arg) {
		//
		return null;
	}

	@Override
	public void delete(Ptzh arg) {
		//
	}
	
	public boolean tixian(String num,String yhbh) throws Exception{
		int tempnum = Integer.parseInt(num);
		ptzh = this.find(yhbh);
		if(ptzh.getZhye()>tempnum|ptzh.getZhye()==tempnum){
			ptzh.setZhye(ptzh.getZhye()-tempnum);
			jyjl.setYhbh(Integer.parseInt(yhbh));
			jyjl.setJysj(daoImpl.getDateAndTime.getNowDate());
			jyjl.setJyje(tempnum);
			jyjl.setJylx(2);
			jyjl.setJyzt(1);
			jyjl.setJyje(tempnum);
			
			jyjlServc.save(jyjl);
			daoImpl.save(ptzh);
			return true;
		}else{
			return false;
		}
	}

}
