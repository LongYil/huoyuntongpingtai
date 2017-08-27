package cn.lyl.ssm.po;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * <p>Title:Jbyh</p>
 * <p>Description: 基本用户</p>
 * @author 李银龙
 *		2017年7月20日
 *		下午4:00:42
 */
@Component(value="jbyh")
@Scope(value="prototype")
public class Jbyh {
	private Integer yhbh;//用户编号
	private String yhm;//用户名
	private String yhxm;//用户真实姓名（不起任何作用）
	private String yhmm;//用户密码
	private Integer yhlx;//用户类型
	private String yhsj;//用户手机号
	private Integer kz1;
	private Integer kz2;
	private String kz3;
	private String kz4;
	private String kz5;
	
	public Integer getYhbh() {
		return yhbh;
	}
	public void setYhbh(Integer yhbh) {
		this.yhbh = yhbh;
	}
	public String getYhm() {
		return yhm;
	}
	public void setYhm(String yhm) {
		this.yhm = yhm;
	}
	public String getYhxm() {
		return yhxm;
	}
	public void setYhxm(String yhxm) {
		this.yhxm = yhxm;
	}
	public String getYhmm() {
		return yhmm;
	}
	public void setYhmm(String yhmm) {
		this.yhmm = yhmm;
	}
	public Integer getYhlx() {
		return yhlx;
	}
	public void setYhlx(Integer yhlx) {
		this.yhlx = yhlx;
	}
	public String getYhsj() {
		return yhsj;
	}
	public void setYhsj(String yhsj) {
		this.yhsj = yhsj;
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
