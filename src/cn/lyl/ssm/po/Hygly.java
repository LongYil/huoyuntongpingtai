package cn.lyl.ssm.po;

/**
 * <p>Title:Hygly</p>
 * <p>Description: 货运代理点管理员</p>
 * @author 李银龙
 *		2017年7月20日
 *		下午7:50:53
 */
public class Hygly {
	private Integer id;
	private Integer yhbh;
	private Integer glybh;
	private String gsmc;
	private String lxdh;
	private String szsf;
	private String szcs;
	private String szx;
	private String szjdh;
	private Integer kz1;
	private Integer kz2;
	private String kz3;
	private String kz4;
	private String kz5;
	//在货运管理员里面表示所属货运代理点，一个管理员只能属于一个代理点
	private Hydld hydld;
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
	public Integer getGlybh() {
		return glybh;
	}
	public void setGlybh(Integer glybh) {
		this.glybh = glybh;
	}
	public String getGsmc() {
		return gsmc;
	}
	public void setGsmc(String gsmc) {
		this.gsmc = gsmc;
	}
	public String getLxdh() {
		return lxdh;
	}
	public void setLxdh(String lxdh) {
		this.lxdh = lxdh;
	}
	public String getSzsf() {
		return szsf;
	}
	public void setSzsf(String szsf) {
		this.szsf = szsf;
	}
	public String getSzcs() {
		return szcs;
	}
	public void setSzcs(String szcs) {
		this.szcs = szcs;
	}
	public String getSzx() {
		return szx;
	}
	public void setSzx(String szx) {
		this.szx = szx;
	}
	public String getSzjdh() {
		return szjdh;
	}
	public void setSzjdh(String szjdh) {
		this.szjdh = szjdh;
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
	public Hydld getHydld() {
		return hydld;
	}
	public void setHydld(Hydld hydld) {
		this.hydld = hydld;
	}
	
	
}
