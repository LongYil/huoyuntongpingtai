package cn.lyl.ssm.po;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * <p>Title:Ptyyf</p>
 * <p>Description: 平台运营方</p>
 * @author 李银龙
 *		2017年7月20日
 *		下午6:12:19
 */
@Component(value="ptyyf")
@Scope(value="prototype")
public class Ptyyf {
	private Integer id;//序号
	private Integer yhbh;//用户编号
	private String gsmc;//公司名称
	private String gssf;//公司省份
	private String gscs;//公司城市
	private String gsx;//公司县
	private Integer kz1;
	private Integer kz2;
	private String kz3;
	private String kz4;
	private String kz5;
	//在平台运营方里面表示所拥有的平台管理员，一个平台运营方拥有多个管理员
	private Set<Ptgly> setPtgly = new HashSet<Ptgly>();
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
	public String getGsmc() {
		return gsmc;
	}
	public void setGsmc(String gsmc) {
		this.gsmc = gsmc;
	}
	public String getGssf() {
		return gssf;
	}
	public void setGssf(String gssf) {
		this.gssf = gssf;
	}
	public String getGscs() {
		return gscs;
	}
	public void setGscs(String gscs) {
		this.gscs = gscs;
	}
	public String getGsx() {
		return gsx;
	}
	public void setGsx(String gsx) {
		this.gsx = gsx;
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
	public Set<Ptgly> getSetPtgly() {
		return setPtgly;
	}
	public void setSetPtgly(Set<Ptgly> setPtgly) {
		this.setPtgly = setPtgly;
	}

}
