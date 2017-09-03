package cn.lyl.ssm.vo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import cn.lyl.ssm.po.Yscd;

@Component(value="yscdVo")
@Scope(value="")
public class YscdVo {
	private Yscd yscd;
	
	private String gsmc;//公司名称
	private String lxdh;//公司电话
	private String gsdz;//公司地址
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
	public String getGsdz() {
		return gsdz;
	}
	public void setGsdz(String gsdz) {
		this.gsdz = gsdz;
	}
	
	
}
