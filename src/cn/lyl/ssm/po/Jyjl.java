package cn.lyl.ssm.po;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * <p>Title:Jyjl</p>
 * <p>Description: 平台账户的交易记录</p>
 * @author 李银龙
 *		2017年7月20日
 *		下午7:36:17
 */
@Component(value="jyjl")
@Scope(value="prototype")
public class Jyjl {
	private Integer id;//序号
	private Integer yhbh;//用户编号
	private String jysj;//交易时间
	private Integer jylx;//交易类型 1：物流币充值；2：物流币提现；3:营业收入；4：缴纳保证金；5：解冻保证金，6：支付运费
	private Integer jyje;//交易金额
	private Integer jyzt;//交易状态   1：申请已发起；2：交易成功；3：交易失败
	private String jyrxm;//交易人姓名（此字段仅在用户申请充值物流币时使用）
	private String jyrid;//交易人身份证号（此字段仅在用户申请充值物流币时使用）
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
	public Integer getYhbh() {
		return yhbh;
	}
	public void setYhbh(Integer yhbh) {
		this.yhbh = yhbh;
	}
	public String getJysj() {
		return jysj;
	}
	public void setJysj(String jysj) {
		this.jysj = jysj;
	}
	public Integer getJylx() {
		return jylx;
	}
	public void setJylx(Integer jylx) {
		this.jylx = jylx;
	}
	public Integer getJyje() {
		return jyje;
	}
	public void setJyje(Integer jyje) {
		this.jyje = jyje;
	}
	public Integer getJyzt() {
		return jyzt;
	}
	public void setJyzt(Integer jyzt) {
		this.jyzt = jyzt;
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
	public String getJyrxm() {
		return jyrxm;
	}
	public void setJyrxm(String jyrxm) {
		this.jyrxm = jyrxm;
	}
	public String getJyrid() {
		return jyrid;
	}
	public void setJyrid(String jyrid) {
		this.jyrid = jyrid;
	}


}
