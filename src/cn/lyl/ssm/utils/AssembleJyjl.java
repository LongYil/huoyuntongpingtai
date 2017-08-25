package cn.lyl.ssm.utils;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import cn.lyl.ssm.po.Jyjl;
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
	private JyjlVo jyjlvo;
	@Autowired
	private Jyjl jyjl;
	
	public List<JyjlVo> getJyjyVo(List<Jyjl> listjyjl){
		for(int i=0;i<listjyjl.size();i++){
			jyjl = listjyjl.get(i);
			jyjlvo = new JyjlVo();

			jyjlvo.setId(i);
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
}
