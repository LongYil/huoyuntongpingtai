package cn.lyl.ssm.po;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * <p>Title:Cysqx</p>
 * <p>Description:承运商权限 </p>
 * @author 李银龙
 *		2017年9月10日
 *		下午10:10:32
 */
@Component(value="cysqx")
@Scope(value="prototype")
public class Cysqx {
	private Integer id;
	private Integer jsbh;//角色编号
	private String zhgl;//帐号管理
	private String szdld;//设置代理点
	private String cdgl;//车队管理
	private String jsgl;//角色管理
	private String xtrz;//系统日志
	private String wdxl;//我的线路
	private String wdcl;//我的车辆
	private String syxl;//所有线路
	private String sycl;//所有车辆
	private String szbdld;//设置本帐号代理点
	private String szsydld;//设置所有帐号代理点
	
	public String getZhgl() {
		return zhgl;
	}
	public void setZhgl(String zhgl) {
		this.zhgl = zhgl;
	}
	public String getSzdld() {
		return szdld;
	}
	public void setSzdld(String szdld) {
		this.szdld = szdld;
	}
	public String getCdgl() {
		return cdgl;
	}
	public void setCdgl(String cdgl) {
		this.cdgl = cdgl;
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
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getJsbh() {
		return jsbh;
	}
	public void setJsbh(Integer jsbh) {
		this.jsbh = jsbh;
	}
	public String getWdxl() {
		return wdxl;
	}
	public void setWdxl(String wdxl) {
		this.wdxl = wdxl;
	}
	public String getWdcl() {
		return wdcl;
	}
	public void setWdcl(String wdcl) {
		this.wdcl = wdcl;
	}
	public String getSyxl() {
		return syxl;
	}
	public void setSyxl(String syxl) {
		this.syxl = syxl;
	}
	public String getSycl() {
		return sycl;
	}
	public void setSycl(String sycl) {
		this.sycl = sycl;
	}
	public String getSzbdld() {
		return szbdld;
	}
	public void setSzbdld(String szbdld) {
		this.szbdld = szbdld;
	}
	public String getSzsydld() {
		return szsydld;
	}
	public void setSzsydld(String szsydld) {
		this.szsydld = szsydld;
	}

}
