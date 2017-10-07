package cn.lyl.ssm.po;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * <p>Title:Cysjs</p>
 * <p>Description:承运商角色 </p>
 * @author 李银龙
 *		2017年9月10日
 *		下午10:06:29
 */
@Component(value="cysjs")
@Scope(value="prototype")
public class Cysjs {
	private Integer id;//角色编号
	private Integer yhbh;//用户编号
	private String jsmc;//角色名称
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getJsmc() {
		return jsmc;
	}
	public void setJsmc(String jsmc) {
		this.jsmc = jsmc;
	}
	public Integer getYhbh() {
		return yhbh;
	}
	public void setYhbh(Integer yhbh) {
		this.yhbh = yhbh;
	}
		
}
