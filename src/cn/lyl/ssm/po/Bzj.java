package cn.lyl.ssm.po;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * <p>Title:Bzj</p>
 * <p>Description: 保证金</p>
 * @author 李银龙
 *		2017年7月20日
 *		下午7:40:28
 */
@Component(value="bzj")
@Scope(value="prototype")
public class Bzj {
	private Integer id;//序号
	private Integer yhbh;//用户编号
	private Integer bzjje;//保证金余额
	private Integer ysqje;//已申请解冻金额
	private Integer ksqje;//可申请解冻金额
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getYhbh() {
		return yhbh;
	}
	public void setYhbh(Integer yhbh) {
		this.yhbh = yhbh;
	}
	public Integer getBzjje() {
		return bzjje;
	}
	public void setBzjje(Integer bzjje) {
		this.bzjje = bzjje;
	}
	public Integer getYsqje() {
		return ysqje;
	}
	public void setYsqje(Integer ysqje) {
		this.ysqje = ysqje;
	}
	public Integer getKsqje() {
		return ksqje;
	}
	public void setKsqje(Integer ksqje) {
		this.ksqje = ksqje;
	}



}
