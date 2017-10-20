package cn.lyl.ssm.po;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * <p>Title:Ptjs</p>
 * <p>Description: 平台管理员角色</p>
 * @author 李银龙
 *		2017年10月20日
 *		下午3:23:26
 */
@Component(value="ptjs")
@Scope(value="prototype")
public class Ptjs {
	private Integer id;
	private String jsmc;//角色名称
	private String zhgl;//账号管理
	private String zhugl;//账户管理
	private String cys;//承运商
	private String hydld;//货运代理点
	private String wtr;//委托人
	private String ssdd;//申诉订单
	private String jdbzj;//解冻保证金
	private String czwlb;//充值物流币
	private String txwlb;//提现物流币
	private String jsgl;//角色管理
	

	public String getJsmc() {
		return jsmc;
	}
	public void setJsmc(String jsmc) {
		this.jsmc = jsmc;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getZhgl() {
		return zhgl;
	}
	public void setZhgl(String zhgl) {
		this.zhgl = zhgl;
	}
	public String getZhugl() {
		return zhugl;
	}
	public void setZhugl(String zhugl) {
		this.zhugl = zhugl;
	}
	public String getCys() {
		return cys;
	}
	public void setCys(String cys) {
		this.cys = cys;
	}
	public String getHydld() {
		return hydld;
	}
	public void setHydld(String hydld) {
		this.hydld = hydld;
	}
	public String getWtr() {
		return wtr;
	}
	public void setWtr(String wtr) {
		this.wtr = wtr;
	}
	public String getSsdd() {
		return ssdd;
	}
	public void setSsdd(String ssdd) {
		this.ssdd = ssdd;
	}
	public String getJdbzj() {
		return jdbzj;
	}
	public void setJdbzj(String jdbzj) {
		this.jdbzj = jdbzj;
	}
	public String getCzwlb() {
		return czwlb;
	}
	public void setCzwlb(String czwlb) {
		this.czwlb = czwlb;
	}
	public String getTxwlb() {
		return txwlb;
	}
	public void setTxwlb(String txwlb) {
		this.txwlb = txwlb;
	}
	public String getJsgl() {
		return jsgl;
	}
	public void setJsgl(String jsgl) {
		this.jsgl = jsgl;
	}
	
}
