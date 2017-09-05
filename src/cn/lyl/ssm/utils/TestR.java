package cn.lyl.ssm.utils;

public class TestR {

	public static void main(String[] args) {
		String start = "2017-2-27";//28
		String time = "5";
		
		String[] startary = start.split("-"); 
		int year = Integer.parseInt(startary[0]);
		int month = Integer.parseInt(startary[1]);
		int day = Integer.parseInt(startary[2]);
		int added = Integer.parseInt(time);
		
		int february = getFebruaryDays(year);
				
		int[] monthdays = {0,31,february,31,30,31,30,31,31,30,31,30,12};
		
		if((day+added)>monthdays[month]) {
			if(month==12) {
				day = day+added-monthdays[month]; 
				month = 1;
			}else {
				day = day+added-monthdays[month]; 
				month = month+1;
			}			
			
		}else {
			day = day+added;
		}
		
		
		System.out.println(year+"-"+month+"-"+day);
	}
		public static int getFebruaryDays(int year) {
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
