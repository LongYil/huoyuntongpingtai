package cn.lyl.ssm.po;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * <p>Title:Yscd</p>
 * <p>Description:运输车队 </p>
 * @author 李银龙
 *		2017年8月18日
 *		下午10:08:21
 */
@Component(value="yscd")
@Scope(value="prototype")
public class Yscd {
	private Integer cdbh;//车队编号
	private Integer cysbh;//承运商管理员编号
	private Integer yhbh;//承运商用户编号
	private Integer fpzt;//分配状态
	private String cdmc;//车队名称
	private String cdlxr;//车队联系人
	private String cdlxdh;//车队联系电话
	private Integer kz1;
	private Integer kz2;
	private String kz3;
	private String kz4;
	private String kz5;
	
	public Integer getCdbh() {
		return cdbh;
	}
	public void setCdbh(Integer cdbh) {
		this.cdbh = cdbh;
	}
	public Integer getCysbh() {
		return cysbh;
	}
	public void setCysbh(Integer cysbh) {
		this.cysbh = cysbh;
	}
	public Integer getYhbh() {
		return yhbh;
	}
	public void setYhbh(Integer yhbh) {
		this.yhbh = yhbh;
	}
	public String getCdmc() {
		return cdmc;
	}
	public void setCdmc(String cdmc) {
		this.cdmc = cdmc;
	}
	public String getCdlxr() {
		return cdlxr;
	}
	public void setCdlxr(String cdlxr) {
		this.cdlxr = cdlxr;
	}
	public String getCdlxdh() {
		return cdlxdh;
	}
	public void setCdlxdh(String cdlxdh) {
		this.cdlxdh = cdlxdh;
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
	public Integer getFpzt() {
		return fpzt;
	}
	public void setFpzt(Integer fpzt) {
		this.fpzt = fpzt;
	}
	
	
}
