package cn.lyl.ssm.vo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * <p>Title:Ysdw</p>
 * <p>Description:运输单位po类 </p>
 * @author 李银龙
 *		2017年8月30日
 *		下午4:44:13
 */
@Component(value="ysdw")
@Scope(value="prototype")
public class Ysdw {
	private Integer id;
	private String fhdldmc;//发货代理点名称
	private String fhdh;//发货代理点电话
	private String fhdz;//发货代理点地址
	private Integer fhdldbh;//发货代理点编号
	
	private String cysmc;//承运商公司名称
	private String cysdh;//承运商电话
	private String cysdz;//承运商地址
	private Integer cysbh;//承运商编号
	private String cyscd;//承运商车队编号
	private String cyscddh;//承运商车队电话
	
	private Float yjfy;//预计费用
	private Integer yssx;//运输时效
	
	private Float dlfhfy;//代理发货费用
	private Float dlshfy;//代理收货费用
	private Float ysfy;//运输费用
	
	private Float dsdlf;//代收货款代理费
	private Float thfy;//发货代理点 提货费用
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFhdldmc() {
		return fhdldmc;
	}
	public void setFhdldmc(String fhdldmc) {
		this.fhdldmc = fhdldmc;
	}
	public String getFhdh() {
		return fhdh;
	}
	public void setFhdh(String fhdh) {
		this.fhdh = fhdh;
	}
	public String getFhdz() {
		return fhdz;
	}
	public void setFhdz(String fhdz) {
		this.fhdz = fhdz;
	}
	public Integer getFhdldbh() {
		return fhdldbh;
	}
	public void setFhdldbh(Integer fhdldbh) {
		this.fhdldbh = fhdldbh;
	}
	public String getCysmc() {
		return cysmc;
	}
	public void setCysmc(String cysmc) {
		this.cysmc = cysmc;
	}
	public String getCysdh() {
		return cysdh;
	}
	public void setCysdh(String cysdh) {
		this.cysdh = cysdh;
	}
	public String getCysdz() {
		return cysdz;
	}
	public void setCysdz(String cysdz) {
		this.cysdz = cysdz;
	}
	public Integer getCysbh() {
		return cysbh;
	}
	public void setCysbh(Integer cysbh) {
		this.cysbh = cysbh;
	}
	public String getCyscd() {
		return cyscd;
	}
	public void setCyscd(String cyscd) {
		this.cyscd = cyscd;
	}
	public String getCyscddh() {
		return cyscddh;
	}
	public void setCyscddh(String cyscddh) {
		this.cyscddh = cyscddh;
	}
	public Float getYjfy() {
		return yjfy;
	}
	public void setYjfy(Float yjfy) {
		this.yjfy = yjfy;
	}
	public Integer getYssx() {
		return yssx;
	}
	public void setYssx(Integer yssx) {
		this.yssx = yssx;
	}
	public Float getDlfhfy() {
		return dlfhfy;
	}
	public void setDlfhfy(Float dlfhfy) {
		this.dlfhfy = dlfhfy;
	}
	public Float getDlshfy() {
		return dlshfy;
	}
	public void setDlshfy(Float dlshfy) {
		this.dlshfy = dlshfy;
	}
	public Float getYsfy() {
		return ysfy;
	}
	public void setYsfy(Float ysfy) {
		this.ysfy = ysfy;
	}
	public Float getDsdlf() {
		return dsdlf;
	}
	public void setDsdlf(Float dsdlf) {
		this.dsdlf = dsdlf;
	}
	public Float getThfy() {
		return thfy;
	}
	public void setThfy(Float thfy) {
		this.thfy = thfy;
	}
	
}
