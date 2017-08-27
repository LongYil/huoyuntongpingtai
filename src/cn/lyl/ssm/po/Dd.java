package cn.lyl.ssm.po;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * <p>Title:Dd</p>
 * <p>Description: 订单</p>
 * @author 李银龙
 *		2017年7月20日
 *		下午8:11:41
 */
@Component(value="dd")
@Scope(value="prototype")
public class Dd {
	private Integer id;//序号
	private Integer wtrbh;//委托人编号
	private Integer fhdld;//发货代理点编号
	private Integer shdld;//收获代理点把编号
	private Integer cys;//承运商
	private String hwmc;//货物名称
	private String hwlx;//货物类型
	private String cfsf;//出发省份
	private String cfcs;//出发城市
	private String cfx;//出发县
	private String cfjd;//出发街道
	private String ddsf;//到达省份
	private String ddcs;//到达城市
	private String ddx;//到达县
	private String ddjd;//到达街道
	private Integer zjs;//总件数
	private String zzl;//总重量
	private String ztj;//总体积
	private Integer yjyf;//预计运费
	private Integer sfyf;//实付运费
	private String fhrxm;//发货人姓名
	private String fhrdh;//发货人电话
	private String shrxm;//收货人姓名
	private String shrdh;//收货人电话
	private String dshk;//是否代收货款（1：是；2：否）
	private String ddzt;//订单状态
	private String bxfy;//保险费用
	private String smth;//是否上门提货
	private String ysfs;//运输方式
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
	public Integer getWtrbh() {
		return wtrbh;
	}
	public void setWtrbh(Integer wtrbh) {
		this.wtrbh = wtrbh;
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
	public Integer getCys() {
		return cys;
	}
	public void setCys(Integer cys) {
		this.cys = cys;
	}
	public String getHwmc() {
		return hwmc;
	}
	public void setHwmc(String hwmc) {
		this.hwmc = hwmc;
	}
	public String getHwlx() {
		return hwlx;
	}
	public void setHwlx(String hwlx) {
		this.hwlx = hwlx;
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
	public String getCfjd() {
		return cfjd;
	}
	public void setCfjd(String cfjd) {
		this.cfjd = cfjd;
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
	public String getDdjd() {
		return ddjd;
	}
	public void setDdjd(String ddjd) {
		this.ddjd = ddjd;
	}
	public Integer getZjs() {
		return zjs;
	}
	public void setZjs(Integer zjs) {
		this.zjs = zjs;
	}
	public String getZzl() {
		return zzl;
	}
	public void setZzl(String zzl) {
		this.zzl = zzl;
	}
	public String getZtj() {
		return ztj;
	}
	public void setZtj(String ztj) {
		this.ztj = ztj;
	}
	public Integer getYjyf() {
		return yjyf;
	}
	public void setYjyf(Integer yjyf) {
		this.yjyf = yjyf;
	}
	public Integer getSfyf() {
		return sfyf;
	}
	public void setSfyf(Integer sfyf) {
		this.sfyf = sfyf;
	}
	public String getFhrxm() {
		return fhrxm;
	}
	public void setFhrxm(String fhrxm) {
		this.fhrxm = fhrxm;
	}
	public String getFhrdh() {
		return fhrdh;
	}
	public void setFhrdh(String fhrdh) {
		this.fhrdh = fhrdh;
	}
	public String getShrxm() {
		return shrxm;
	}
	public void setShrxm(String shrxm) {
		this.shrxm = shrxm;
	}
	public String getShrdh() {
		return shrdh;
	}
	public void setShrdh(String shrdh) {
		this.shrdh = shrdh;
	}
	public String getDshk() {
		return dshk;
	}
	public void setDshk(String dshk) {
		this.dshk = dshk;
	}
	public String getDdzt() {
		return ddzt;
	}
	public void setDdzt(String ddzt) {
		this.ddzt = ddzt;
	}
	public String getBxfy() {
		return bxfy;
	}
	public void setBxfy(String bxfy) {
		this.bxfy = bxfy;
	}
	public String getSmth() {
		return smth;
	}
	public void setSmth(String smth) {
		this.smth = smth;
	}
	public String getYsfs() {
		return ysfs;
	}
	public void setYsfs(String ysfs) {
		this.ysfs = ysfs;
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
