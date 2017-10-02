package cn.lyl.ssm.po;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * <p>Title:Lxr</p>
 * <p>Description: 联系人</p>
 * @author 李银龙
 *		2017年7月20日
 *		下午6:56:16
 */
@Component(value="lxr")
@Scope(value="prototype")
public class Lxr {
	private Integer id;//序号
	private Integer yhbh;//用户编号
	private String lxrxm;//联系人姓名
	private String lxrdh;//联系人电话
	private String lxrdz;//联系人地址
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
	public String getLxrxm() {
		return lxrxm;
	}
	public void setLxrxm(String lxrxm) {
		this.lxrxm = lxrxm;
	}
	public String getLxrdh() {
		return lxrdh;
	}
	public void setLxrdh(String lxrdh) {
		this.lxrdh = lxrdh;
	}
	public String getLxrdz() {
		return lxrdz;
	}
	public void setLxrdz(String lxrdz) {
		this.lxrdz = lxrdz;
	}

	
}
