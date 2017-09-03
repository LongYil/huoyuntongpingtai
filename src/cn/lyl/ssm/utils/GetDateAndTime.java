package cn.lyl.ssm.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value="getDateAndTime")
@Scope(value="prototype")
public class GetDateAndTime {
	public String getNowDate(){
		Date date = new Date();
		DateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
		return dateFormat.format(date);
	}
}
