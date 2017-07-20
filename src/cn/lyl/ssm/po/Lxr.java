package cn.lyl.ssm.po;

/**
 * <p>Title:Lxr</p>
 * <p>Description: 联系人</p>
 * @author 李银龙
 *		2017年7月20日
 *		下午6:56:16
 */
public class Lxr {
	private Integer id;
	private String lxrxm;
	private String lxrdh;
	private String lxrdz;	
	private Integer kz1;
	private Integer kz2;
	private String kz3;
	private String kz4;
	private String kz5;
	//在联系人里面表示所属委托人，一个联系人只能属于一个委托人
	private Wtr wtr;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLxrxm() {
		return lxrxm;
	}
	public void setLxrxm(String lxrxm) {
		this.lxrxm = lxrxm;
	}
	public String getLxrdh() {
		return lxrdh;
	}
	public void setLxrdh(String lxrdh) {
		this.lxrdh = lxrdh;
	}
	public String getLxrdz() {
		return lxrdz;
	}
	public void setLxrdz(String lxrdz) {
		this.lxrdz = lxrdz;
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
	public Wtr getWtr() {
		return wtr;
	}
	public void setWtr(Wtr wtr) {
		this.wtr = wtr;
	}
	
	
}
