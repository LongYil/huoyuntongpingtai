package cn.lyl.ssm.po;

import java.util.HashSet;
import java.util.Set;

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
	private String hylx;//会员类型
	private String gsmc;//公司 名称
	private String lxdh;//联系电话
	private String szsf;//所在省份
	private String szcs;//所在城市
	private String szx;//所在县
	private String szjdh;//所在街道号
	private Integer kz1;
	private Integer kz2;
	private String kz3;
	private String kz4;
	private String kz5;
	//在承运商里面表示所拥有的管理员，一个承运商拥有多个管理员
	private Set<Cysgly> setCysgly = new HashSet<Cysgly>();
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
	public String getHylx() {
		return hylx;
	}
	public void setHylx(String hylx) {
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
	public String getSzjdh() {
		return szjdh;
	}
	public void setSzjdh(String szjdh) {
		this.szjdh = szjdh;
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
	public Set<Cysgly> getSetCysgly() {
		return setCysgly;
	}
	public void setSetCysgly(Set<Cysgly> setCysgly) {
		this.setCysgly = setCysgly;
	}

}
