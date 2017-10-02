package cn.lyl.ssm.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import cn.lyl.ssm.dao.YscdDao;
import cn.lyl.ssm.po.Cysgly;
import cn.lyl.ssm.po.Wlx;
import cn.lyl.ssm.po.Yscd;
import cn.lyl.ssm.service.impl.CysglyServc;
import cn.lyl.ssm.service.impl.WlxServc;
import cn.lyl.ssm.vo.YscdVo;

@Component(value="yscdDaoImpl")
@Scope(value="prototype")
public class YscdDaoImpl extends CommonDaoImpl<Yscd> implements YscdDao{
	@Autowired
	private WlxServc wlxServc;
	@Autowired
	private CysglyServc cysglyServc;
	
	private List<Wlx> listWlx = new ArrayList<Wlx>();
	private List<YscdVo> listvo = new ArrayList<YscdVo>();
	private List<Yscd> templistcd = new ArrayList<Yscd>();
	private List<Yscd> listcd = new ArrayList<Yscd>();
	
	@Autowired
	private Yscd yscd;
	@Autowired
	private Cysgly cysgly;
	
	private Wlx wlx;
	private YscdVo yscdVo;
	@Override
	public void save(Yscd entity) {
		ht.save(entity);		
	}

	@Override
	public void update(Yscd entity) {
		ht.update(entity);		
	}

	@Override
	public void delete(Yscd entity) {
		ht.delete(entity);		
	}

	@Override
	public Yscd find(String arg) throws Exception {
		return (Yscd) getEntity.getEntity("Yscd","cdbh",arg,Yscd.class);
	}

	@Override
	public List<Yscd> cysFindAll(String arg) {
		return (List<Yscd>) ht.find("from Yscd where fpzt = 0 and yhbh = "+arg+"");
	}

	@Override
	public List<Yscd> cysFindByGlyid(String arg) {
		return (List<Yscd>) ht.find("from Yscd where cysbh = "+arg+"");
	}

	@Override
	public void jbyhAddCdToGly(List<Yscd> listcd, String arg2) {
		for (Yscd yscd : listcd) {
			yscd.setFpzt(1);
			yscd.setCysbh(Integer.parseInt(arg2));
			ht.update(yscd);
		}
		listWlx = wlxServc.findByYscdId(listcd);
		for(int i=0;i<listWlx.size();i++){
			wlx = new Wlx();
			wlx = listWlx.get(i);
			wlx.setCysbh(Integer.parseInt(arg2));
			wlxServc.update(wlx);
		}
	}

	@Override
	public List<Yscd> jbyhFindAll(String arg) {
		return (List<Yscd>) ht.find("from Yscd where yhbh = "+arg+"");
	}

	@Override
	public List<YscdVo> findYscdByCysgly(List<Cysgly> list) throws Exception {
		templistcd.clear();
		listvo.clear();
		listcd.clear();
		
		for(int i=0;i<list.size();i++) {
			templistcd.clear();
			templistcd = (List<Yscd>) ht.find("from Yscd where cysbh = "+list.get(i).getCysbh()+"");
			if(templistcd.size()>0){
				listcd.addAll(templistcd);	
			}else {
				;
			}
		}
		for(int i=0;i<listcd.size();i++) {
			yscdVo = new YscdVo();
			yscd = listcd.get(i);
			cysgly = cysglyServc.findByGlyid(String.valueOf(yscd.getCysbh()));
			yscdVo.setYscd(yscd);
			yscdVo.setGsmc(cysgly.getGsmc());
			yscdVo.setGsdz(cysgly.getSzsf()+"-"+cysgly.getSzcs()+"-"+cysgly.getSzx());
			yscdVo.setLxdh(cysgly.getLxdh());
			listvo.add(yscdVo);
		}
		return listvo;
	}

	@Override
	public List<Yscd> cysglyFindAll(String arg) {
		return (List<Yscd>) ht.find("from Yscd where cysbh = "+arg+"");
	}
	
	
	
	
	
	
}
