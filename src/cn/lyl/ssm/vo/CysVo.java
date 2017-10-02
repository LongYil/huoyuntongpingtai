package cn.lyl.ssm.vo;

import org.springframework.stereotype.Component;

import cn.lyl.ssm.po.Cys;

@Component(value="cysVo")
public class CysVo {
	private Cys cys;
	
	private String lxr;//联系人姓名

	public Cys getCys() {
		return cys;
	}
	public void setCys(Cys cys) {
		this.cys = cys;
	}
	public String getLxr() {
		return lxr;
	}
	public void setLxr(String lxr) {
		this.lxr = lxr;
	}
	
	
}
