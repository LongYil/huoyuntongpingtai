package cn.lyl.ssm.po;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * <p>Title:Hygly</p>
 * <p>Description: 货运代理点管理员</p>
 * @author 李银龙
 *		2017年7月20日
 *		下午7:50:53
 */
@Component(value="hygly")
@Scope(value="prototype")
public class Hygly {
	private Integer id;//序号
	private Integer jsbh;//角色编号
	private Integer yhbh;//用户编号
	private Integer glybh;//管理员编号
	private Integer glylx;//管理员类型   1：总代理  2：分代理
	private String gsmc;//公司名称
	private String lxdh;//联系电话
	private String szsf;//所在省份
	private String szcs;//所在城市
	private String szx;//所在县
	private String xxdz;//详细地址
	private String yhyx;//用户邮箱
	private Integer kz1;
	private Integer kz2;
	private String kz3;
	private String kz4;
	private String kz5;
	
	
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
	public Integer getGlybh() {
		return glybh;
	}
	public void setGlybh(Integer glybh) {
		this.glybh = glybh;
	}
	public Integer getGlylx() {
		return glylx;
	}
	public void setGlylx(Integer glylx) {
		this.glylx = glylx;
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
	public String getXxdz() {
		return xxdz;
	}
	public void setXxdz(String xxdz) {
		this.xxdz = xxdz;
	}
	public String getYhyx() {
		return yhyx;
	}
	public void setYhyx(String yhyx) {
		this.yhyx = yhyx;
	}
	public Integer getKz1() {
		return kz1;
	}
	public void setKz1(Integer kz1) {
		this.kz1 = kz1;
	}
	public Integer getKz2() {
		return kz2;
	}
	public void setKz2(Integer kz2) {
		this.kz2 = kz2;
	}
	public String getKz3() {
		return kz3;
	}
	public void setKz3(String kz3) {
		this.kz3 = kz3;
	}
	public String getKz4() {
		return kz4;
	}
	public void setKz4(String kz4) {
		this.kz4 = kz4;
	}
	public String getKz5() {
		return kz5;
	}
	public void setKz5(String kz5) {
		this.kz5 = kz5;
	}
	
}
