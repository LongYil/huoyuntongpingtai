package cn.lyl.ssm.daoImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import cn.lyl.ssm.dao.WlxDao;
import cn.lyl.ssm.po.Cysgly;
import cn.lyl.ssm.po.Dd;
import cn.lyl.ssm.po.Wlx;
import cn.lyl.ssm.po.Yscd;
import cn.lyl.ssm.vo.WlxVo;

@Component(value="wlxDaoImpl")
@Scope(value="prototype")
public class WlxDaoImpl extends CommonDaoImpl<Wlx> implements WlxDao {
	
	private List<Wlx> listwlx = new ArrayList<Wlx>();
	private List<Wlx> templistwlx = new ArrayList<Wlx>();
	private List<WlxVo> listwlxvo = new ArrayList<WlxVo>();
	private WlxVo wlxvo;
	
	@Autowired
	private Cysgly cysgly;
	@Autowired
	private Yscd yscd;

	@Override
	public Wlx find(String arg) {
		return ht.get(Wlx.class,Integer.parseInt(arg));
	}

	@Override
	public List<Wlx> findAll(String arg) {
		return (List<Wlx>) ht.find("from Wlx where yhbh = "+arg+"");
	}

	@Override
	public List<Wlx> findByCdid(String arg) {
		return (List<Wlx>) ht.find("from Wlx where cdbh = "+arg+"");
	}

	/////////////////////////////////
	@Override
	public List<WlxVo> findByCysYhid(String arg) {
		listwlx.clear();
		listwlxvo.clear();
		listwlx = (List<Wlx>) ht.find("from Wlx where yhbh ="+arg+"");
		for(int i=0;i<listwlx.size();i++){
			yscd = (Yscd) ht.find("from Yscd where cdbh = "+listwlx.get(i).getCdbh()+"").get(0);
			wlxvo = new WlxVo();
			wlxvo.setWlx(listwlx.get(i));
			wlxvo.setCdmc(yscd.getCdmc());
			listwlxvo.add(wlxvo);
		}
		return listwlxvo;
	}

	@Override
	public List<WlxVo> findByCysglyid(String arg) {
		listwlx.clear();
		listwlxvo.clear();
		listwlx = (List<Wlx>) ht.find("from Wlx where cysbh ="+arg+"");
		for(int i=0;i<listwlx.size();i++){
			yscd = (Yscd) ht.find("from Yscd where cdbh = "+listwlx.get(i).getCdbh()+"").get(0);
			wlxvo = new WlxVo();
			wlxvo.setWlx(listwlx.get(i));
			wlxvo.setCdmc(yscd.getCdmc());
			listwlxvo.add(wlxvo);
		}
		return listwlxvo;
	}
	@Override
	public List<Wlx> findBestWlx(Dd dd) {
		return  (List<Wlx>) ht.find("from Wlx where cfsf = ? and cfcs = ? and cfx = ? and ddsf = ? and ddcs = ? and ddx = ?",dd.getCfsf().trim(),dd.getCfcs().trim(),dd.getCfx().trim(),dd.getDdsf().trim(),dd.getDdcs().trim(),dd.getDdx().trim());
	}

	@Override
	public List<WlxVo> findByGlyid(List<Cysgly> listgly) {//根据承运商管理员id查找其所有线路
		listwlx.clear();
		templistwlx.clear();
		
		for(int i=0;i<listgly.size();i++) {
			templistwlx.clear();
			templistwlx = (List<Wlx>) ht.find("from Wlx where cysbh = "+listgly.get(i).getCysbh()+"");
			if(templistwlx.size()>0) {
				listwlx.addAll(templistwlx);
			}else {
				;
			}
		}

		for(int i=0;i<listwlx.size();i++){
			yscd = (Yscd) ht.find("from Yscd where cdbh = "+listwlx.get(i).getCdbh()+"").get(0);
			cysgly = (Cysgly) ht.find("from Cysgly where cysbh = "+listwlx.get(i).getCysbh()+"").get(0);
			wlxvo = new WlxVo();
			wlxvo.setWlx(listwlx.get(i));
			wlxvo.setCdmc(yscd.getCdmc());
			wlxvo.setCddh(yscd.getCdlxdh());
			wlxvo.setGsmc(cysgly.getGsmc());
			wlxvo.setGsdh(cysgly.getLxdh());
			listwlxvo.add(wlxvo);
		}
		return listwlxvo;
	}

	@Override
	public List<Wlx> findByCysid(String arg) {
		return (List<Wlx>) ht.find("from Wlx where cysbh = "+arg+"");
	}


	
	
	
	
	
	
	
	
	
	
	
}
