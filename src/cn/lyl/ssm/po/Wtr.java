package cn.lyl.ssm.po;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * <p>Title:Wtr</p>
 * <p>Description: 委托人</p>
 * @author 李银龙
 *		2017年7月20日
 *		下午6:51:21
 */
@Component(value="wtr")
@Scope(value="prototype")
public class Wtr {
	private Integer id;//序号
	private Integer yhbh;//用户编号
	private String yhsf;//用户省份
	private String yhcs;//用户城市
	private String yhx;//用户县
	private String gsmc;//公司名称
	private String yhyx;//用户邮箱
	private String xxdz;//用户备注
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
	public String getYhsf() {
		return yhsf;
	}
	public void setYhsf(String yhsf) {
		this.yhsf = yhsf;
	}
	public String getYhcs() {
		return yhcs;
	}
	public void setYhcs(String yhcs) {
		this.yhcs = yhcs;
	}
	public String getYhx() {
		return yhx;
	}
	public void setYhx(String yhx) {
		this.yhx = yhx;
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
	public String getXxdz() {
		return xxdz;
	}
	public void setXxdz(String xxdz) {
		this.xxdz = xxdz;
	}


}
