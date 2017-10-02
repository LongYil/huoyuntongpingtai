package cn.lyl.ssm.po;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * <p>Title:Cysgly</p>
 * <p>Description: 承运商管理员</p>
 * @author 李银龙
 *		2017年7月20日
 *		下午8:00:56
 */
@Component(value="cysgly")
@Scope(value="prototype")
public class Cysgly {
	private Integer id;//序号
	private Integer jsbh;//角色编号
	private Integer yhbh;//用户编号
	private Integer dlbh;//所属代理点编号   默认值为0，表示没有所属的代理点
	private Integer cysbh;//承运商编号
	private Integer hylx;//承运商会员类型，1：个人承运商，2：运输车队承运商(总)，3：运输车队承运商（分）
	private String gsmc;//公司名称
	private String yhyx;//用户邮箱
	private String lxdh;//联系电话
	private String szsf;//所在省份
	private String szcs;//所在城市
	private String szx;//所在县
	private String szjdh;//所在街道号
	private String xxdz;//用户备注
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
	public Integer getYhbh() {
		return yhbh;
	}
	public void setYhbh(Integer yhbh) {
		this.yhbh = yhbh;
	}
	public Integer getDlbh() {
		return dlbh;
	}
	public void setDlbh(Integer dlbh) {
		this.dlbh = dlbh;
	}
	public Integer getCysbh() {
		return cysbh;
	}
	public void setCysbh(Integer cysbh) {
		this.cysbh = cysbh;
	}
	public Integer getHylx() {
		return hylx;
	}
	public void setHylx(Integer hylx) {
		this.hylx = hylx;
	}
	public String getGsmc() {
		return gsmc;
	}
	public void setGsmc(String gsmc) {
		this.gsmc = gsmc;
	}
	public String getYhyx() {
		return yhyx;
	}
	public void setYhyx(String yhyx) {
		this.yhyx = yhyx;
	}
	public String getLxdh() {
		return lxdh;
	}
	public void setLxdh(String lxdh) {
		this.lxdh = lxdh;
	}
	public String getSzsf() {
		return szsf;
	}
	public void setSzsf(String szsf) {
		this.szsf = szsf;
	}
	public String getSzcs() {
		return szcs;
	}
	public void setSzcs(String szcs) {
		this.szcs = szcs;
	}
	public String getSzx() {
		return szx;
	}
	public void setSzx(String szx) {
		this.szx = szx;
	}
	public String getSzjdh() {
		return szjdh;
	}
	public void setSzjdh(String szjdh) {
		this.szjdh = szjdh;
	}
	public String getXxdz() {
		return xxdz;
	}
	public void setXxdz(String xxdz) {
		this.xxdz = xxdz;
	}

	
}
