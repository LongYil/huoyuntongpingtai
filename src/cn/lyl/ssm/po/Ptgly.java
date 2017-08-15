package cn.lyl.ssm.po;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * <p>Title:Ptgly</p>
 * <p>Description: 平台管理员</p>
 * @author 李银龙
 *		2017年7月20日
 *		下午6:14:53
 */
@Component(value="ptgly")
@Scope(value="prototype")
public class Ptgly {
	private Integer id;//序号
	private Integer glybh;//管理员编号
	private String glylx;//管理员类型
	private Integer glyjs;//管理员角色
	private Integer kz1;
	private Integer kz2;
	private String kz3;
	private String kz4;
	private String kz5;
	
	//在平台管理员里面表示所属的平台运营方，一个平台管理员只能属于一个平台运营方
	private Ptyyf ptyyf;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getGlybh() {
		return glybh;
	}
	public void setGlybh(Integer glybh) {
		this.glybh = glybh;
	}
	public String getGlylx() {
		return glylx;
	}
	public void setGlylx(String glylx) {
		this.glylx = glylx;
	}
	public Integer getGlyjs() {
		return glyjs;
	}
	public void setGlyjs(Integer glyjs) {
		this.glyjs = glyjs;
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
	public Ptyyf getPtyyf() {
		return ptyyf;
	}
	public void setPtyyf(Ptyyf ptyyf) {
		this.ptyyf = ptyyf;
	}


}
