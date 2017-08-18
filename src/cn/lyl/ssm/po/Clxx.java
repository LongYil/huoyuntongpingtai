package cn.lyl.ssm.po;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * <p>Title:Clxx</p>
 * <p>Description:车辆信息 </p>
 * @author 李银龙
 *		2017年8月15日
 *		下午4:46:10
 */
@Component(value="clxx")
@Scope(value="prototype")
public class Clxx {
	private Integer id;//序号
	private Integer cysbh;//承运商编号
	private Integer yhbh;//用户编号(承运商管理员编号)
	private Integer cdbh;//车队编号
	private String cph;//车牌号
	private String cllx;//车辆类型
	private Float clcd;//车辆长度
	private Float clkd;//车辆宽度
	private Float cltj;//车辆体积
	private String sclxr;//随车联系人
	private String sclxdh;//随车联系电话
	private String clpp;//车辆品牌
	private Integer kz1;
	private Integer kz2;
	private String kz3;
	private String kz4;
	private String kz5;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	public String getCph() {
		return cph;
	}
	public void setCph(String cph) {
		this.cph = cph;
	}
	public String getCllx() {
		return cllx;
	}
	public void setCllx(String cllx) {
		this.cllx = cllx;
	}
	public Float getClcd() {
		return clcd;
	}
	public void setClcd(Float clcd) {
		this.clcd = clcd;
	}
	public Float getClkd() {
		return clkd;
	}
	public void setClkd(Float clkd) {
		this.clkd = clkd;
	}
	public Float getCltj() {
		return cltj;
	}
	public void setCltj(Float cltj) {
		this.cltj = cltj;
	}
	public String getSclxr() {
		return sclxr;
	}
	public void setSclxr(String sclxr) {
		this.sclxr = sclxr;
	}
	public String getSclxdh() {
		return sclxdh;
	}
	public void setSclxdh(String sclxdh) {
		this.sclxdh = sclxdh;
	}
	public String getClpp() {
		return clpp;
	}
	public void setClpp(String clpp) {
		this.clpp = clpp;
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
	public Integer getCdbh() {
		return cdbh;
	}
	public void setCdbh(Integer cdbh) {
		this.cdbh = cdbh;
	}
	

}
