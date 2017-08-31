package cn.lyl.ssm.vo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import cn.lyl.ssm.po.Yscd;

@Component(value="yscdVo")
@Scope(value="")
public class YscdVo {
	private Yscd yscd;
	private String gsmc;
	private String lxdh;
	public Yscd getYscd() {
		return yscd;
	}
	public void setYscd(Yscd yscd) {
		this.yscd = yscd;
	}
	public String getGsmc() {
		return gsmc;
	}
	public void setGsmc(String gsmc) {
		this.gsmc = gsmc;
	}
	public String getLxdh() {
		return lxdh;
	}
	public void setLxdh(String lxdh) {
		this.lxdh = lxdh;
	}
	
	
}
