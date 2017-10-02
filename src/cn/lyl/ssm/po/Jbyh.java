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

	
}
