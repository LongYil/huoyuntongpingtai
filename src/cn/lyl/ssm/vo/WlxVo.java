package cn.lyl.ssm.vo;

import org.springframework.stereotype.Component;

import cn.lyl.ssm.po.Wlx;

@Component(value="wlxVo")
public class WlxVo{
	private Wlx wlx;
	
	private String cdmc;//车队名称
	private String cddh;//车队电话
	private String gsmc;//公司名称
	private String gsdh;//公司电话
	
	public String getCdmc() {
		return cdmc;
	}
	public void setCdmc(String cdmc) {
		this.cdmc = cdmc;
	}
	public Wlx getWlx() {
		return wlx;
	}
	public void setWlx(Wlx wlx) {
		this.wlx = wlx;
	}
	public String getGsmc() {
		return gsmc;
	}
	public void setGsmc(String gsmc) {
		this.gsmc = gsmc;
	}
	public String getGsdh() {
		return gsdh;
	}
	public void setGsdh(String gsdh) {
		this.gsdh = gsdh;
	}
	public String getCddh() {
		return cddh;
	}
	public void setCddh(String cddh) {
		this.cddh = cddh;
	}

	
}
