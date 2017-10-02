package cn.lyl.ssm.po;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * <p>Title:Cys</p>
 * <p>Description: 承运商</p>
 * @author 李银龙
 *		2017年7月20日
 *		下午7:57:32
*/
@Component(value="cys")
@Scope(value="prototype")
public class Cys {
	private Integer id;//序号
	private Integer yhbh;//用户编号
	private Integer dlbh;//所属代理点编号
	private Integer hylx;//会员类型：区分个人和运输车队  1：个人承运商，2：运输车队承运商(总)，3：运输车队承运商（分）
	private String gsmc;//公司 名称
	private String lxdh;//联系电话
	private String szsf;//所在省份
	private String szcs;//所在城市
	private String szx;//所在县
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
	public Integer getDlbh() {
		return dlbh;
	}
	public void setDlbh(Integer dlbh) {
		this.dlbh = dlbh;
	}
	public Integer getHylx() {
		return hylx;
	}
	public void setHylx(Integer hylx) {
		this.hylx = hylx;
	}
	public String getGsmc() {
		return gsmc;
	}
	public void setGsmc(String gsmc) {
		this.gsmc = gsmc;
	}
	public String getLxdh() {
		return lxdh;
	}
	public void setLxdh(String lxdh) {
		this.lxdh = lxdh;
	}
	public String getSzsf() {
		return szsf;
	}
	public void setSzsf(String szsf) {
		this.szsf = szsf;
	}
	public String getSzcs() {
		return szcs;
	}
	public void setSzcs(String szcs) {
		this.szcs = szcs;
	}
	public String getSzx() {
		return szx;
	}
	public void setSzx(String szx) {
		this.szx = szx;
	}
	
}
