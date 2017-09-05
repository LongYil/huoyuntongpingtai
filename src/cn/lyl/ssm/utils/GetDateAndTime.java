package cn.lyl.ssm.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value="getDateAndTime")
@Scope(value="prototype")
public class GetDateAndTime {
	
	private Date date = new Date();
	private DateFormat dateFormat;

	public String getNowDate(){
		dateFormat = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
		return dateFormat.format(date);
	}
	public String getStandardDateAndTime() {
		dateFormat = new SimpleDateFormat("YYYY-MM-dd");
		return dateFormat.format(date);
	}
	
	public String getExpectTime(String start,String time) {
		String[] startary = start.split("-"); 
		int year = Integer.parseInt(startary[0]);
		int month = Integer.parseInt(startary[1]);
		int day = Integer.parseInt(startary[2]);
		int added = Integer.parseInt(time);
		
		int february = this.getFebruaryDays(year);
				
		int[] monthdays = {0,31,february,31,30,31,30,31,31,30,31,30,12};
		
		if((day+added)>monthdays[month]) {
			if(month==12) {
				year = year+1;
				day = day+added-monthdays[month]; 
				month = 1;
			}else {
				day = day+added-monthdays[month]; 
				month = month+1;
			}			
			
		}else {
			day = day+added;
		}
		
		
		return year+"-"+month+"-"+day;
	}
	
	public int getFebruaryDays(int year) {
		if(year%100==0) {
			if(year%400==0) {
				return 29;
			}else {
				return 28;
			}
		}else if(year%4==0){
			return 29;
		}else {
			return 28;
		}
	}
	
}
