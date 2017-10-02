package cn.lyl.ssm.po;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * <p>Title:Ptgly</p>
 * <p>Description: 平台管理员</p>
 * @author 李银龙
 *		2017年7月20日
 *		下午6:14:53
 */
@Component(value="ptgly")
@Scope(value="prototype")
public class Ptgly {
	private Integer id;//序号
	private Integer yhbh;//用户编号
	private Integer glybh;//管理员编号
	private Integer glylx;//管理员类型 1：超级管理员  2：管理员
	private String gsmc;//公司名称
	private String gssf;//公司省份
	private String gscs;//公司城市
	private String gsx;//公司县
	private String xxdz;//详细地址
	private String yhyx;//用户邮箱
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
	public String getGssf() {
		return gssf;
	}
	public void setGssf(String gssf) {
		this.gssf = gssf;
	}
	public String getGscs() {
		return gscs;
	}
	public void setGscs(String gscs) {
		this.gscs = gscs;
	}
	public String getGsx() {
		return gsx;
	}
	public void setGsx(String gsx) {
		this.gsx = gsx;
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

}
