package cn.lyl.ssm.vo;

import cn.lyl.ssm.po.Ptgly;

public class PtglyVo {
	private Ptgly ptgly;//平台管理员实体
	
	private String yhm;//用户名
	private String yhxm;//用户姓名
	private String jsmc;//角色名称
	private String yhsj;//用户手机号
	
	public Ptgly getPtgly() {
		return ptgly;
	}
	public void setPtgly(Ptgly ptgly) {
		this.ptgly = ptgly;
	}
	public String getYhm() {
		return yhm;
	}
	public void setYhm(String yhm) {
		this.yhm = yhm;
	}
	public String getYhxm() {
		return yhxm;
	}
	public void setYhxm(String yhxm) {
		this.yhxm = yhxm;
	}
	public String getJsmc() {
		return jsmc;
	}
	public void setJsmc(String jsmc) {
		this.jsmc = jsmc;
	}
	public String getYhsj() {
		return yhsj;
	}
	public void setYhsj(String yhsj) {
		this.yhsj = yhsj;
	}
	
}
