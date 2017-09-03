package cn.lyl.ssm.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.lyl.ssm.daoImpl.JyjlDaoImpl;
import cn.lyl.ssm.po.Jyjl;
import cn.lyl.ssm.utils.AssembleJyjl;
import cn.lyl.ssm.vo.JyjlVo;

@Transactional
@Service(value="jyjlServc")
public class JyjlServc extends CommonSevc<Jyjl, JyjlDaoImpl> {

	private List<JyjlVo> listvo = new ArrayList<JyjlVo>();
	@Autowired
	private AssembleJyjl assembleJyjl;
	
	@Override
	public void save(Jyjl arg) {
		daoImpl.save(arg);
	}

	@Override
	public Jyjl find(String arg) throws Exception {
		//
		return null;
	}

	@Override
	public List<Jyjl> findAll(String arg) {
		//
		return null;
	}

	@Override
	public void delete(Jyjl arg) {
		//	
	}
	
	public List<JyjlVo> cysFindAll(String arg){
		this.listvo.clear();
		this.listvo = assembleJyjl.getJyjyVo(daoImpl.cysFindAll(arg));
		return this.listvo;
	}
	
	public List<JyjlVo> FindJnjl(String yhbh){
		this.listvo.clear();
		this.listvo = assembleJyjl.getJyjyVo(daoImpl.FindJnjl(yhbh));
		return this.listvo;
	}
	
	public List<JyjlVo> FindJdjl(String yhbh){
		this.listvo.clear();
		this.listvo = assembleJyjl.getJyjyVo(daoImpl.FindJdjl(yhbh));
		return this.listvo;
	}
	
	public List<JyjlVo> FindCzjl(String yhbh){
		this.listvo.clear();
		this.listvo = assembleJyjl.getJyjyVo(daoImpl.FindCzjl(yhbh));
		return this.listvo;
	}
	
	public List<JyjlVo> FindTxjl(String yhbh){
		this.listvo.clear();
		this.listvo = assembleJyjl.getJyjyVo(daoImpl.FindTxjl(yhbh));
		return this.listvo;
	}
	
}
