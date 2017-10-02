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

}
