package cn.lyl.ssm.vo;

import cn.lyl.ssm.po.Dd;
import cn.lyl.ssm.po.Ycdd;

public class DdVo {
	private Dd dd;
	private Ycdd ycdd;
	private String id;//订单id
	private String jyzt;//交易状态
	private String hwmc;//货物名称
	private String shdldmc;//收货代理点名称
	private String shdlddz;//收货代理点地址
	private String qt;//其他
	private String spjs;//商品件数
	private String zfy;//总费用
	private String ysfy;//运输费用

	
	
	public Ycdd getYcdd() {
		return ycdd;
	}
	public void setYcdd(Ycdd ycdd) {
		this.ycdd = ycdd;
	}
	public Dd getDd() {
		return dd;
	}
	public void setDd(Dd dd) {
		this.dd = dd;
	}
	public String getJyzt() {
		return jyzt;
	}
	public void setJyzt(String jyzt) {
		this.jyzt = jyzt;
	}
	public String getHwmc() {
		return hwmc;
	}
	public void setHwmc(String hwmc) {
		this.hwmc = hwmc;
	}
	public String getShdldmc() {
		return shdldmc;
	}
	public void setShdldmc(String shdldmc) {
		this.shdldmc = shdldmc;
	}
	public String getShdlddz() {
		return shdlddz;
	}
	public void setShdlddz(String shdlddz) {
		this.shdlddz = shdlddz;
	}
	public String getQt() {
		return qt;
	}
	public void setQt(String qt) {
		this.qt = qt;
	}
	public String getSpjs() {
		return spjs;
	}
	public void setSpjs(String spjs) {
		this.spjs = spjs;
	}
	public String getZfy() {
		return zfy;
	}
	public void setZfy(String zfy) {
		this.zfy = zfy;
	}
	public String getYsfy() {
		return ysfy;
	}
	public void setYsfy(String ysfy) {
		this.ysfy = ysfy;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
}
