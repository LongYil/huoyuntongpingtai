package cn.lyl.ssm.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import cn.lyl.ssm.dao.CysjsDao;
import cn.lyl.ssm.po.Cysjs;
import cn.lyl.ssm.po.Cysqx;
import cn.lyl.ssm.service.impl.CysqxServc;
import cn.lyl.ssm.utils.GetQxmc;
import cn.lyl.ssm.vo.CysjsVo;

@Component(value="cysjsDaoImpl")
@Scope(value="prototype")
public class CysjsDaoImpl extends CommonDaoImpl<Cysjs> implements CysjsDao{

	private List<CysjsVo> listvo = new ArrayList<CysjsVo>();
	private List<Cysjs> list = new ArrayList<Cysjs>();
	@Autowired
	private GetQxmc Q;
	@Autowired
	private Cysjs cysjs;
	@Autowired
	private CysqxServc cysqxServc;
	@Autowired
	private Cysqx cysqx;
	
	private CysjsVo cysjsVo;
	@Override
	public void save(Cysjs entity) {
		ht.saveOrUpdate(entity);		
	}

	@Override
	public void update(Cysjs entity) {
		//
		
	}

	@Override
	public void delete(Cysjs entity) {
		//
		
	}

	@Override
	public Cysjs find(String arg) throws Exception {
		return (Cysjs) getEntity.getEntity("Cysjs", "id", arg, Cysjs.class);
	}

	@Override
	public List<Cysjs> findByCysId(String arg) {
		return (List<Cysjs>) ht.find("from Cysjs where yhbh = "+arg+"");
	}

	@Override
	public List<CysjsVo> findAllCysjs(String arg) throws Exception {
		listvo.clear();
		list.clear();
		list = this.findByCysId(arg);
		for(int i=0;i<list.size();i++) {
			cysjsVo = new CysjsVo();
			cysjs = list.get(i);
			cysqx = cysqxServc.find(String.valueOf(cysjs.getId()));
			
			cysjsVo.setId(cysjs.getId());
			cysjsVo.setJsmc(cysjs.getJsmc());
			cysjsVo.setCysqx(new Cysqx());
			cysjsVo.getCysqx().setCdgl(Q.G(cysqx.getCdgl()));
			cysjsVo.getCysqx().setJsgl(Q.G(cysqx.getJsgl()));
			cysjsVo.getCysqx().setSzdld(Q.G(cysqx.getSzdld()));
			cysjsVo.getCysqx().setXtrz(Q.G(cysqx.getXtrz()));
			cysjsVo.getCysqx().setZhgl(Q.G(cysqx.getZhgl()));
			cysjsVo.getCysqx().setWdxl(Q.G(cysqx.getWdxl()));
			cysjsVo.getCysqx().setWdcl(Q.G(cysqx.getWdcl()));
			cysjsVo.getCysqx().setSyxl(Q.G(cysqx.getSyxl()));
			cysjsVo.getCysqx().setSycl(Q.G(cysqx.getSycl()));
			cysjsVo.getCysqx().setSzbdld(Q.G(cysqx.getSzbdld()));
			cysjsVo.getCysqx().setSzsydld(Q.G(cysqx.getSzsydld()));
			cysjsVo.getCysqx().setWdcd(Q.G(cysqx.getWdcd()));
			
			listvo.add(cysjsVo);
		}
		
		return listvo;
	}

}
