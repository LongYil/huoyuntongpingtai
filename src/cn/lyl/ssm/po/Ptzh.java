package cn.lyl.ssm.po;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * <p>Title:Ptzh</p>
 * <p>Description:平台账户 </p>
 * @author 李银龙
 *		2017年7月20日
 *		下午7:31:15
 */
@Component(value="ptzh")
@Scope(value="prototype")
public class Ptzh {
	private Integer id;//序号
	private Integer yhbh;//用户编号
	private Float zhye;//账户余额
	
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
	public Float getZhye() {
		return zhye;
	}
	public void setZhye(Float zhye) {
		this.zhye = zhye;
	}


}
