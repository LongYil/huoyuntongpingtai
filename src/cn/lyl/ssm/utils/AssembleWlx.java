package cn.lyl.ssm.utils;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.lyl.ssm.po.Cysgly;
import cn.lyl.ssm.po.Wlx;
import cn.lyl.ssm.po.Yscd;
import cn.lyl.ssm.service.impl.CysglyServc;
import cn.lyl.ssm.service.impl.YscdServc;
import cn.lyl.ssm.vo.WlxVo;

/**
 * <p>Title:AssembleWlx</p>
 * <p>Description: 拼装物流线vo类</p>
 * @author 李银龙
 *		2017年8月20日
 *		下午9:59:10
 */
@Transactional
@Service(value="assembleWlx")
public class AssembleWlx {
	@Autowired
	private CysglyServc cysglyServc;
	@Autowired
	private YscdServc yscdServc;

	private List<WlxVo> listvo = new ArrayList<WlxVo>();
	
	private Yscd yscd;
	private Cysgly cysgly;
	private WlxVo wlxVo;
	
	public List<WlxVo> getWlxVo(List<Wlx> arg) throws Exception{
		listvo.clear();
		for(int i=0;i<arg.size();i++){
			yscd = new Yscd();
			wlxVo = new WlxVo();
			cysgly = new Cysgly();
			yscd = yscdServc.find(String.valueOf(arg.get(i).getCdbh()));
			cysgly = cysglyServc.findByGlyid(String.valueOf(arg.get(i).getCysbh()));
			wlxVo.setWlx(arg.get(i));
			wlxVo.setCddh(yscd.getCdlxdh());
			wlxVo.setCdmc(yscd.getCdmc());
			wlxVo.setGsmc(cysgly.getGsmc());
			wlxVo.setGsdh(cysgly.getLxdh());;
			listvo.add(wlxVo);
		}
		return listvo;
	}
}
