package cn.lyl.ssm.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.lyl.ssm.daoImpl.HyjsDaoImpl;
import cn.lyl.ssm.po.Hyjs;
import cn.lyl.ssm.utils.GetQxmc;

@Transactional
@Service(value="hyjsServc")
public class HyjsServc extends CommonSevc<Hyjs, HyjsDaoImpl> {
	
	@Autowired
	private Hyjs hyjs;

	private Hyjs temphyjs;
	@Autowired
	private GetQxmc Q;
	private List<Hyjs> listjs = new ArrayList<Hyjs>();
	private List<Hyjs> tempslist = new ArrayList<Hyjs>();
	
	
	@Override
	public void save(Hyjs arg) {
		daoImpl.save(arg);
	}

	@Override
	public Hyjs find(String arg) throws Exception {
		return daoImpl.find(arg);
	}

	@Override
	public List<Hyjs> findAll(String arg) {
		listjs.clear();
		tempslist.clear();
		listjs = daoImpl.findAll(arg);
		
		for(int i=0;i<listjs.size();i++) {
			hyjs = listjs.get(i);
			temphyjs = new Hyjs();
			temphyjs.setId(hyjs.getId());
			temphyjs.setJsmc(hyjs.getJsmc());
			temphyjs.setBzj(Q.G(hyjs.getBzj()));
			temphyjs.setSycd(Q.G(hyjs.getSycd()));
			temphyjs.setSycys(Q.G(hyjs.getSycys()));
			temphyjs.setSyxl(Q.G(hyjs.getSyxl()));
			temphyjs.setWlb(Q.G(hyjs.getWlb()));
			temphyjs.setZhgl(Q.G(hyjs.getZhgl()));
			temphyjs.setZhxx(Q.G(hyjs.getZhxx()));
			temphyjs.setXtrz(Q.G(hyjs.getXtrz()));
			temphyjs.setJsgl(Q.G(hyjs.getJsgl()));
			tempslist.add(temphyjs);
		}
		
		return tempslist;
	}

	@Override
	public void delete(Hyjs arg) {
		daoImpl.delete(arg);
		
	}

}
