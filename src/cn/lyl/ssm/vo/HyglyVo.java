package cn.lyl.ssm.vo;

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
	private String yhm;//用户名
	private String yhxm;//用户姓名
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

}
