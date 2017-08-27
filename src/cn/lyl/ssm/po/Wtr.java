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
	private String yhbz;//用户备注
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
	public String getYhbz() {
		return yhbz;
	}
	public void setYhbz(String yhbz) {
		this.yhbz = yhbz;
	}
	public String getYhyx() {
		return yhyx;
	}
	public void setYhyx(String yhyx) {
		this.yhyx = yhyx;
	}

}
