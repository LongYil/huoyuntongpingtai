package cn.lyl.ssm.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Component;

@Component(value="getDateAndTime")
public class GetDateAndTime {
	public String getNowDate(){
		Date date = new Date();
		DateFormat dateFormat = new SimpleDateFormat("YYYY年MM月dd日 HH时mm分ss秒");
		return dateFormat.format(date);
	}
}
