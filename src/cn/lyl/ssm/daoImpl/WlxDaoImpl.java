package cn.lyl.ssm.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cn.lyl.ssm.dao.WlxDao;
import cn.lyl.ssm.po.Wlx;
import cn.lyl.ssm.po.Yscd;
import cn.lyl.ssm.vo.WlxVo;

@Component(value="wlxDaoImpl")
public class WlxDaoImpl extends CommonDaoImpl<Wlx> implements WlxDao {
	
	private List<Wlx> listwlx = new ArrayList<Wlx>();
	private List<WlxVo> listwlxvo = new ArrayList<WlxVo>();
	private WlxVo wlxvo;
	@Autowired
	private Yscd yscd;
	@Override
	public void save(Wlx entity) {
		ht.save(entity);		
	}

	@Override
	public void update(Wlx entity) {
		//
		
	}

	@Override
	public void delete(Wlx entity) {
		//
		
	}

	@Override
	public Wlx find(String arg) {
		//
		return null;
	}

	@Override
	public List<Wlx> findAll(String arg) {
		return (List<Wlx>) ht.find("from Wlx where yhbh = "+arg+"");
	}

	@Override
	public List<Wlx> findByCysid(String arg) {
		return (List<Wlx>) ht.find("from Wlx where cysbh = "+arg+"");
	}

	@Override
	public List<WlxVo> findByCysYhid(String arg) {
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
	
	
}
