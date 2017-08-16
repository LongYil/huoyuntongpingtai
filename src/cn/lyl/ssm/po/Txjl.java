package cn.lyl.ssm.po;

import java.util.Date;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * <p>Title:Txjl</p>
 * <p>Description: 保证金提现记录</p>
 * @author 李银龙
 *		2017年7月20日
 *		下午7:46:04
 */
@Component(value="txjl")
@Scope(value="prototype")
public class Txjl {
	private Integer id;//序号
	private Integer yhbh;//用户编号
	private Date fqsj;//提现发起时间
	private Integer txje;//提现金额
	private Integer txzt;//提现状态
	private Date tgsj;//提现通过时间
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
	public Date getFqsj() {
		return fqsj;
	}
	public void setFqsj(Date fqsj) {
		this.fqsj = fqsj;
	}
	public Integer getTxje() {
		return txje;
	}
	public void setTxje(Integer txje) {
		this.txje = txje;
	}
	public Integer getTxzt() {
		return txzt;
	}
	public void setTxzt(Integer txzt) {
		this.txzt = txzt;
	}
	public Date getTgsj() {
		return tgsj;
	}
	public void setTgsj(Date tgsj) {
		this.tgsj = tgsj;
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
