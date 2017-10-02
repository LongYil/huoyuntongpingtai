package cn.lyl.ssm.po;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * <p>Title:Yhzh</p>
 * <p>Description: 用户账号实体类</p>
 * @author 李银龙
 *		2017年8月15日
 *		下午10:30:01
 */
@Component(value="yhzh")
@Scope(value="prototype")
public class Yhzh {
	private Integer id;//序号
	private Integer yhbh;//用户编号
	private String ckrxm;//持卡人姓名
	private String yhlx;//银行类型
	private String yhzh;//银行账号
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
	public String getCkrxm() {
		return ckrxm;
	}
	public void setCkrxm(String ckrxm) {
		this.ckrxm = ckrxm;
	}
	public String getYhlx() {
		return yhlx;
	}
	public void setYhlx(String yhlx) {
		this.yhlx = yhlx;
	}
	public String getYhzh() {
		return yhzh;
	}
	public void setYhzh(String yhzh) {
		this.yhzh = yhzh;
	}

}
