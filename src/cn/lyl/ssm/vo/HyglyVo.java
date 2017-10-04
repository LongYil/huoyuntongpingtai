package cn.lyl.ssm.vo;

import cn.lyl.ssm.po.Hydld;
import cn.lyl.ssm.po.Hygly;

/**
 * <p>Title:HyglyVo</p>
 * <p>Description: 货运管理员Vo类</p>
 * @author 李银龙
 *		2017年9月1日
 *		下午9:06:50
 */
public class HyglyVo {
	private Hygly hygly;//货运代理点管理员
	private Hydld hydld;//货运代理点
	private String yhm;//用户名
	private String yhxm;//用户姓名
	private String jsmc;//角色名称
	private String lxdh;//联系电话
	
	public Hygly getHygly() {
		return hygly;
	}
	public void setHygly(Hygly hygly) {
		this.hygly = hygly;
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
	public String getJsmc() {
		return jsmc;
	}
	public void setJsmc(String jsmc) {
		this.jsmc = jsmc;
	}
	public Hydld getHydld() {
		return hydld;
	}
	public void setHydld(Hydld hydld) {
		this.hydld = hydld;
	}
	public String getLxdh() {
		return lxdh;
	}
	public void setLxdh(String lxdh) {
		this.lxdh = lxdh;
	}

}
