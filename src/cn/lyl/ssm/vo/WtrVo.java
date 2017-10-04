package cn.lyl.ssm.vo;

import org.springframework.stereotype.Component;

import cn.lyl.ssm.po.Wtr;

@Component(value="wtrVo")
public class WtrVo {
	private Wtr wtr;
	private String yhxm;//用户姓名
	private String lxdh;//联系电话
	
	public Wtr getWtr() {
		return wtr;
	}
	public void setWtr(Wtr wtr) {
		this.wtr = wtr;
	}
	public String getYhxm() {
		return yhxm;
	}
	public void setYhxm(String yhxm) {
		this.yhxm = yhxm;
	}
	public String getLxdh() {
		return lxdh;
	}
	public void setLxdh(String lxdh) {
		this.lxdh = lxdh;
	}
	
}
