package cn.lyl.ssm.vo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import cn.lyl.ssm.po.Cysqx;

@Component(value="cysjsVo")
@Scope(value="prototype")
public class CysjsVo {
	private String jsmc;
	private Integer id;
	private Cysqx cysqx;
	
	public String getJsmc() {
		return jsmc;
	}
	public void setJsmc(String jsmc) {
		this.jsmc = jsmc;
	}
	public Cysqx getCysqx() {
		return cysqx;
	}
	public void setCysqx(Cysqx cysqx) {
		this.cysqx = cysqx;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
}
