package cn.lyl.ssm.utils;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * <p>Title:GetRealColumnName</p>
 * <p>Description:根据指定编码返回用户在数据库中的字段名称 </p>
 * @author 李银龙
 *		2017年8月31日
 *		上午11:40:12
 */
@Component(value="getRealColumnName")
@Scope(value="prototype")
public class GetRealColumnName {
	
	public String getColumnName(String arg){
		
		switch(arg){
		case "1"://委托人
			return "wtrbh";
		case "2"://发货代理点
			return "fhdld";
		case "3"://收货代理点
			return "shdld";
		case "4"://承运商
			return "cys";
		default:
			return "";
		}
	}
}
