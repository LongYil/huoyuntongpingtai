package cn.lyl.ssm.vo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * <p>Title:JyjlVo</p>
 * <p>Description:交易记录vo类 </p>
 * @author 李银龙
 *		2017年8月25日
 *		下午10:16:06
 */
@Component(value="jyjlVo")
@Scope(value="jyjlVo")
public class JyjlVo {
	private Integer id;
	private String jysj;//交易时间
	private String jylx;//交易类型
	private String jyje;//交易金额
	private String jyzt;//交易状态
	private String jyrxm;//交易人姓名
	private String jyrid;//交易人身份证号
	public String getJysj() {
		return jysj;
	}
	public void setJysj(String jysj) {
		this.jysj = jysj;
	}
	public String getJylx() {
		return jylx;
	}
	public void setJylx(String jylx) {
		this.jylx = jylx;
	}
	public String getJyje() {
		return jyje;
	}
	public void setJyje(String jyje) {
		this.jyje = jyje;
	}
	public String getJyzt() {
		return jyzt;
	}
	public void setJyzt(String jyzt) {
		this.jyzt = jyzt;
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
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
}
