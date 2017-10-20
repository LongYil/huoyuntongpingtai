package cn.lyl.ssm.po;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * <p>Title:Pj</p>
 * <p>Description: 评价实体</p>
 * @author 李银龙
 *		2017年10月19日
 *		下午9:35:11
 */
@Component(value="pj")
@Scope(value="prototype")
public class Pj {
	private Integer id;//序号
	private Integer dd;//订单编号
	private Integer wtr;//委托人
	private Integer cys;//承运商编号
	private Integer fhdld;//发货代理点编号
	private Integer shdld;//收货代理点编号
	private String pjsj;//评价时间
	private Integer cysPja;//承运商评价种类
	private String cysPjb;//承运商评价
	private Integer fhdldPja;//发货代理点评价种类
	private String fhdldPjb;//发货代理点评价
	private Integer shdldPja;//收货代理点评价
	private String shdldPjb;//收货代理点评价
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getDd() {
		return dd;
	}
	public void setDd(Integer dd) {
		this.dd = dd;
	}
	public Integer getWtr() {
		return wtr;
	}
	public void setWtr(Integer wtr) {
		this.wtr = wtr;
	}
	public Integer getCys() {
		return cys;
	}
	public void setCys(Integer cys) {
		this.cys = cys;
	}
	public Integer getFhdld() {
		return fhdld;
	}
	public void setFhdld(Integer fhdld) {
		this.fhdld = fhdld;
	}
	public Integer getShdld() {
		return shdld;
	}
	public void setShdld(Integer shdld) {
		this.shdld = shdld;
	}
	public String getPjsj() {
		return pjsj;
	}
	public void setPjsj(String pjsj) {
		this.pjsj = pjsj;
	}
	public Integer getCysPja() {
		return cysPja;
	}
	public void setCysPja(Integer cysPja) {
		this.cysPja = cysPja;
	}
	public String getCysPjb() {
		return cysPjb;
	}
	public void setCysPjb(String cysPjb) {
		this.cysPjb = cysPjb;
	}
	public Integer getFhdldPja() {
		return fhdldPja;
	}
	public void setFhdldPja(Integer fhdldPja) {
		this.fhdldPja = fhdldPja;
	}
	public String getFhdldPjb() {
		return fhdldPjb;
	}
	public void setFhdldPjb(String fhdldPjb) {
		this.fhdldPjb = fhdldPjb;
	}
	public Integer getShdldPja() {
		return shdldPja;
	}
	public void setShdldPja(Integer shdldPja) {
		this.shdldPja = shdldPja;
	}
	public String getShdldPjb() {
		return shdldPjb;
	}
	public void setShdldPjb(String shdldPjb) {
		this.shdldPjb = shdldPjb;
	}
	
}
