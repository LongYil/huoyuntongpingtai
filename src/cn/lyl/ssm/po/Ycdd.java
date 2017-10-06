package cn.lyl.ssm.po;

import org.springframework.stereotype.Component;

/**
 * <p>Title:Ycdd</p>
 * <p>Description: 异常订单</p>
 * @author 李银龙
 *		2017年10月4日
 *		下午10:05:32
 */
@Component(value="ycdd")
public class Ycdd {
	private Integer id;
	private Integer ddbh;//订单编号
	private String sqly;//申请理由
	private Float sqje;//申请赔偿金额
	private Float sjje;//实际赔偿金额
	private String xxyy;//详细原因
	private String fqsj;//发起时间
	private String clsj;//处理时间
	private Integer ddzt;//处理状态  1:未处理   2：已处理
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getDdbh() {
		return ddbh;
	}
	public void setDdbh(Integer ddbh) {
		this.ddbh = ddbh;
	}
	public String getSqly() {
		return sqly;
	}
	public void setSqly(String sqly) {
		this.sqly = sqly;
	}
	public Float getSqje() {
		return sqje;
	}
	public void setSqje(Float sqje) {
		this.sqje = sqje;
	}
	public Float getSjje() {
		return sjje;
	}
	public void setSjje(Float sjje) {
		this.sjje = sjje;
	}
	public String getXxyy() {
		return xxyy;
	}
	public void setXxyy(String xxyy) {
		this.xxyy = xxyy;
	}
	public String getFqsj() {
		return fqsj;
	}
	public void setFqsj(String fqsj) {
		this.fqsj = fqsj;
	}
	public Integer getDdzt() {
		return ddzt;
	}
	public void setDdzt(Integer ddzt) {
		this.ddzt = ddzt;
	}
	public String getClsj() {
		return clsj;
	}
	public void setClsj(String clsj) {
		this.clsj = clsj;
	}
	
}
