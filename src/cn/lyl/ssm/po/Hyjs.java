package cn.lyl.ssm.po;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * <p>Title:HyJs</p>
 * <p>Description:货运代理点角色 </p>
 * @author 李银龙
 *		2017年9月14日
 *		下午9:32:15
 */
@Component(value="hyjs")
@Scope(value="prototype")
public class Hyjs {
	private Integer id;
	private Integer yhbh;//货运代理点用户编号
	private String jsmc;//角色名称
	private String zhgl;//帐号管理
	private String zhxx;//账户信息
	private String sycys;//所有承运商
	private String sycd;//所有车队
	private String syxl;//所有线路
	private String bzj;//保证金
	private String wlb;//物流币
	private String jsgl;//角色管理
	private String xtrz;//系统日志
	
	
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
	public String getJsmc() {
		return jsmc;
	}
	public void setJsmc(String jsmc) {
		this.jsmc = jsmc;
	}
	public String getZhgl() {
		return zhgl;
	}
	public void setZhgl(String zhgl) {
		this.zhgl = zhgl;
	}
	public String getZhxx() {
		return zhxx;
	}
	public void setZhxx(String zhxx) {
		this.zhxx = zhxx;
	}
	public String getSycys() {
		return sycys;
	}
	public void setSycys(String sycys) {
		this.sycys = sycys;
	}
	public String getSycd() {
		return sycd;
	}
	public void setSycd(String sycd) {
		this.sycd = sycd;
	}
	public String getSyxl() {
		return syxl;
	}
	public void setSyxl(String syxl) {
		this.syxl = syxl;
	}
	public String getBzj() {
		return bzj;
	}
	public void setBzj(String bzj) {
		this.bzj = bzj;
	}
	public String getWlb() {
		return wlb;
	}
	public void setWlb(String wlb) {
		this.wlb = wlb;
	}
	public String getJsgl() {
		return jsgl;
	}
	public void setJsgl(String jsgl) {
		this.jsgl = jsgl;
	}
	public String getXtrz() {
		return xtrz;
	}
	public void setXtrz(String xtrz) {
		this.xtrz = xtrz;
	}
	

	
}
