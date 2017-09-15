package cn.lyl.ssm.utils;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value="getQxmc")
@Scope(value="prototype")
public class GetQxmc {
	public String G(String arg) {
		if(arg.equals("inline-block")) {
			return "有";
		}else {
			return "无";
		}
	}
}
