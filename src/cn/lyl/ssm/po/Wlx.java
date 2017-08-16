package cn.lyl.ssm.po;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * <p>Title:Wlx</p>
 * <p>Description: 物流线路</p>
 * @author 李银龙
 *		2017年7月20日
 *		下午8:06:47
 */
@Component(value="wlx")
@Scope(value="prototype")
public class Wlx {
	private Integer id;//序号
	private Integer cysbh;//承运商编号
	private Integer yhbh;//用户编号
	private String cfsf;//出发省份
	private String cfcs;//出发城市
	private String cfx;//出发县
	private String ddsf;//到达省份
	private String ddcs;//到达城市
	private String ddx;//到达县
	private Float zhjg;//重货价格
	private String zhdw;//重货单位
	private Float qhjg;//轻货价格
	private String qhdw;//轻货单位
	private String yssx;//运输时效
	private String fcpl;//发车频率
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
	public String getCfsf() {
		return cfsf;
	}
	public void setCfsf(String cfsf) {
		this.cfsf = cfsf;
	}
	public String getCfcs() {
		return cfcs;
	}
	public void setCfcs(String cfcs) {
		this.cfcs = cfcs;
	}
	public String getCfx() {
		return cfx;
	}
	public void setCfx(String cfx) {
		this.cfx = cfx;
	}
	public String getDdsf() {
		return ddsf;
	}
	public void setDdsf(String ddsf) {
		this.ddsf = ddsf;
	}
	public String getDdcs() {
		return ddcs;
	}
	public void setDdcs(String ddcs) {
		this.ddcs = ddcs;
	}
	public String getDdx() {
		return ddx;
	}
	public void setDdx(String ddx) {
		this.ddx = ddx;
	}
	public Float getZhjg() {
		return zhjg;
	}
	public void setZhjg(Float zhjg) {
		this.zhjg = zhjg;
	}
	public String getZhdw() {
		return zhdw;
	}
	public void setZhdw(String zhdw) {
		this.zhdw = zhdw;
	}
	public Float getQhjg() {
		return qhjg;
	}
	public void setQhjg(Float qhjg) {
		this.qhjg = qhjg;
	}
	public String getQhdw() {
		return qhdw;
	}
	public void setQhdw(String qhdw) {
		this.qhdw = qhdw;
	}
	public String getYssx() {
		return yssx;
	}
	public void setYssx(String yssx) {
		this.yssx = yssx;
	}
	public String getFcpl() {
		return fcpl;
	}
	public void setFcpl(String fcpl) {
		this.fcpl = fcpl;
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

}
