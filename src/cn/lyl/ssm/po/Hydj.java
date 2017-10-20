package cn.lyl.ssm.po;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * <p>Title:Hydj</p>
 * <p>Description: 会员等级实体</p>
 * @author 李银龙
 *		2017年10月20日
 *		下午2:19:23
 */
@Component(value="hydj")
@Scope(value="prototype")
public class Hydj {
	private Integer id;
	private Integer yhbh;//用户编号
	private Integer jjje;//交易金额
	private String hydj;//会员等级   交易金额1000以下为青铜会员  1000-10000为白银会员 10000-50000为黄金会员 50000-100000为铂金会员  100000以上为钻石会员
	
	public Integer getYhbh() {
		return yhbh;
	}
	
	public void setYhbh(Integer yhbh) {
		this.yhbh = yhbh;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getJjje() {
		return jjje;
	}
	public void setJjje(Integer jjje) {
		this.jjje = jjje;
	}
	public String getHydj() {
		return hydj;
	}
	public void setHydj(String hydj) {
		this.hydj = hydj;
	}

}
