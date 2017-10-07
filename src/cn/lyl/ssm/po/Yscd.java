package cn.lyl.ssm.po;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * <p>Title:Yscd</p>
 * <p>Description:运输车队 </p>
 * @author 李银龙
 *		2017年8月18日
 *		下午10:08:21
 */
@Component(value="yscd")
@Scope(value="prototype")
public class Yscd {
	private Integer id;//序号
	private Integer cdbh;//车队编号
	private Integer cysbh;//承运商管理员编号
	private Integer yhbh;//承运商用户编号
	private Integer fpzt;//分配状态  0 表示未分配  1表示已分配
	private String cdmc;//车队名称
	private String cdlxr;//车队联系人
	private String cdlxdh;//车队联系电话
	

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getCdbh() {
		return cdbh;
	}
	public void setCdbh(Integer cdbh) {
		this.cdbh = cdbh;
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
	public Integer getFpzt() {
		return fpzt;
	}
	public void setFpzt(Integer fpzt) {
		this.fpzt = fpzt;
	}
	public String getCdmc() {
		return cdmc;
	}
	public void setCdmc(String cdmc) {
		this.cdmc = cdmc;
	}
	public String getCdlxr() {
		return cdlxr;
	}
	public void setCdlxr(String cdlxr) {
		this.cdlxr = cdlxr;
	}
	public String getCdlxdh() {
		return cdlxdh;
	}
	public void setCdlxdh(String cdlxdh) {
		this.cdlxdh = cdlxdh;
	}

	
}
