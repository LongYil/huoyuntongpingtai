package cn.lyl.ssm.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.lyl.ssm.daoImpl.PtjsDaoImpl;
import cn.lyl.ssm.po.Hyjs;
import cn.lyl.ssm.po.Ptjs;
import cn.lyl.ssm.utils.GetQxmc;


@Transactional
@Service(value="ptjsServc")
public class PtjsServc extends CommonSevc<Ptjs, PtjsDaoImpl> {

	@Autowired
	private Ptjs ptjs;

	private Ptjs tempptjs;
	@Autowired
	private GetQxmc Q;
	private List<Ptjs> listjs = new ArrayList<Ptjs>();
	private List<Ptjs> tempslist = new ArrayList<Ptjs>();
	
	@Override
	public void save(Ptjs arg) {
		daoImpl.save(arg);		
	}

	public List<Ptjs> findAll(String arg){
		listjs.clear();
		tempslist.clear();
		listjs = daoImpl.findAll(arg);
		
		for(int i=0;i<listjs.size();i++) {
			ptjs = listjs.get(i);
			tempptjs = new Ptjs();
			tempptjs.setId(ptjs.getId());
			tempptjs.setJsmc(ptjs.getJsmc());
			
			tempptjs.setZhgl(Q.G(ptjs.getZhgl()));
			tempptjs.setZhugl(Q.G(ptjs.getZhugl()));
			tempptjs.setCys(Q.G(ptjs.getCys()));
			tempptjs.setCys(Q.G(ptjs.getCys()));
			tempptjs.setHydld(Q.G(ptjs.getHydld()));
			tempptjs.setWtr(Q.G(ptjs.getWtr()));
			tempptjs.setWtr(Q.G(ptjs.getWtr()));
			tempptjs.setSsdd(Q.G(ptjs.getSsdd()));
			tempptjs.setJdbzj(Q.G(ptjs.getJdbzj()));
			tempptjs.setCzwlb(Q.G(ptjs.getCzwlb()));
			tempptjs.setTxwlb(Q.G(ptjs.getTxwlb()));
			tempptjs.setJsgl(Q.G(ptjs.getJsgl()));
			
			tempslist.add(tempptjs);
		}
		
		return tempslist;
	}

	@Override
	public void delete(Ptjs arg) {
		
	}

	@Override
	public Ptjs find(String arg) throws Exception {
		return daoImpl.find(arg);
	}

}
