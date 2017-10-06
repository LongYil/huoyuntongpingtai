package cn.lyl.ssm.utils;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import cn.lyl.ssm.po.Bzj;
import cn.lyl.ssm.po.Dd;
import cn.lyl.ssm.po.Jbyh;
import cn.lyl.ssm.po.Jyjl;
import cn.lyl.ssm.service.impl.BzjServc;
import cn.lyl.ssm.service.impl.DdServc;
import cn.lyl.ssm.service.impl.JbyhServc;
import cn.lyl.ssm.vo.JyjlVo;

/**
 * <p>Title:AssembleJyjl</p>
 * <p>Description: 重新封装交易记录</p>
 * @author 李银龙
 *		2017年8月25日
 *		下午10:14:04
 */
@Component(value="assembleJyjl")
@Scope(value="prototype")
public class AssembleJyjl {
	private List<JyjlVo> listvo = new ArrayList<JyjlVo>();
	private List<Dd> listdd = new ArrayList<Dd>();
	private JyjlVo jyjlvo;
	@Autowired
	private Jyjl jyjl;
	@Autowired
	private DdServc ddServc;
	@Autowired
	private Jbyh jbyh;
	@Autowired
	private Bzj bzj;
	@Autowired
	private BzjServc bzjServc;
	@Autowired
	private JbyhServc jbyhServc;
	
	public List<JyjlVo> getJyjyVo(List<Jyjl> listjyjl){
		listvo.clear();
		for(int i=0;i<listjyjl.size();i++){
			jyjl = listjyjl.get(i);
			
			jyjlvo.setId(i);
			jyjlvo.setJysj(jyjl.getJysj());
			
			jyjlvo.setJyje(String.valueOf(jyjl.getJyje()));
			jyjlvo.setJyrxm(jyjl.getJyrxm());
			jyjlvo.setJyrid(jyjl.getJyrid());

			int jylx = jyjl.getJylx();
			int jyzt = jyjl.getJyzt();
			switch(jylx){
			case 1:
				jyjlvo.setJylx("充值物流币");
				break;
			case 2:
				jyjlvo.setJylx("提现物流币");
				break;
			case 3:
				jyjlvo.setJylx("营业收入");
				break;
			case 4:
				jyjlvo.setJylx("缴纳保证金");
				break;
			case 5:
				jyjlvo.setJylx("解冻保证金");
				break;
			case 6:
				jyjlvo.setJylx("支付运费");
				break;
			case 7:
				jyjlvo.setJylx("货款赔偿");
				break;
			case 8:
				jyjlvo.setJylx("赔偿货款");
				break;
			}

			switch(jyzt){
			case 1:
				jyjlvo.setJyzt("申请已发起");
				break;
			case 2:
				jyjlvo.setJyzt("交易成功");
				break;
			case 3:
				jyjlvo.setJyzt("交易失败");
			}
			listvo.add(jyjlvo);
		}

		return listvo;
	}
	
	public List<JyjlVo> getJdsq(List<Jyjl> list) throws Exception{
		for(int i=0;i<list.size();i++) {			
			jyjlvo = new JyjlVo();
			jyjl = list.get(i);
			bzj = bzjServc.find(String.valueOf(jyjl.getYhbh()));
			jbyh = jbyhServc.find(String.valueOf(jyjl.getYhbh()));
			jyjlvo.setJyjl(jyjl);
			jyjlvo.setJbyh(jbyh);
			
			boolean temp = ddServc.ptFindAllWwcDd(String.valueOf(jyjl.getYhbh()));
			if(temp) {
				jyjlvo.setZzjydd("无");
			}else {
				jyjlvo.setZzjydd("有");
			}
			listvo.add(jyjlvo);
		}
		return listvo;
	}
}
