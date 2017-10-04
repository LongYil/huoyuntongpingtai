package cn.lyl.ssm.po;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * <p>Title:Hydld</p>
 * <p>Description: 货运代理点</p>
 * @author 李银龙
 *		2017年7月20日
 *		下午7:48:17
 */
@Component(value="hydld")
@Scope(value="prototype")
public class Hydld {
	private Integer id;//序号
	private Integer yhbh;//用户编号
	private String gsmc;//公司名称
	private String szsf;//所在省份
	private String szcs;//所在城市
	private String szx;//所在县
	private String xxdz;//所在街道号
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
	public String getGsmc() {
		return gsmc;
	}
	public void setGsmc(String gsmc) {
		this.gsmc = gsmc;
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
}
