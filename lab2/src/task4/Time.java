package task4;

public class Time implements Comparable{
	int hour;
	int minute;
	int second;
	
	public Time(int hour, int minute, int second) {
		this.hour = checkhour(hour);
		this.minute = checkmin(minute);
		this.second = checksec(second);
	}
	
	public int checkhour(int hour) {
		if(hour < 0) {System.out.println("Error 1"); return 0;}
		else if(hour>24) {return hour - 24;}
		return hour;
	}
	public int checkmin(int min) {
		if(min < 0) {System.out.println("Error 2"); return 0;}
		else if(min>60) {
			hour = hour +1; min = min - 60;
			}
		return min;
	}
	public int checksec(int sec) {
		if(sec < 0) {System.out.println("Error 3"); return 0;}
		else if(sec > 60) {
			minute = minute + 1; sec = sec - 60;
		}
		return sec;
	}
		
	
	public String toUniversal(){
		if(hour<10) {
			if(minute < 10 && second > 9) {
				return "0" + hour + ":" + "0" + minute + ":" + second; 
			}
			if(minute > 9 && second < 10) {
				return "0" + hour + ":" + minute + ":"  + "0" + second; 
			}
			if(minute < 10 && second < 10) {
				return "0" + hour + ":" + "0" + minute + ":" + "0" + second; 
			} return "0" + hour + ":" + minute + ":" + second;
		}
		else {
			if(minute < 10 && second > 9) {
				return hour + ":" + "0" + minute + ":" + second; 
			}
			if(minute > 9 && second < 10) {
				return hour + ":" + minute + ":"  + "0" + second; 
			}
			if(minute < 10 && second < 10) {
				return hour + ":" + "0" + minute + ":" + "0" + second; 
			}	return hour + ":" + minute + ":" + second;
		}
	}
	public String toStandard(){
		if(hour == 24) {
			if(minute < 10 && second > 9) {
				return "00" + ":" + "0" + minute + ":" + second + " AM"; 
			}
			if(minute > 9 && second < 10) {
				return "00" + ":" + minute + ":"  + "0" + second + " AM"; 
			}
			if(minute < 10 && second < 10) {
				return "00" + ":" + "0" + minute + ":" + "0" + second + " AM"; 
			}
			return "00" + ":" + minute + ":" + second + " AM";
		}
		else if(hour>=22) {
		if(minute < 10 && second > 9) {
			return hour-12 + ":" + "0" + minute + ":" + second + " PM"; 
		}
		else if(minute > 9 && second < 10) {
			return hour-12 + ":" + minute + ":"  + "0" + second + " PM"; 
		}
		else if(minute < 10 && second < 10) {
			return hour-12 + ":" + "0" + minute + ":" + "0" + second + " PM"; 
		}
		return hour-12 + ":" + minute + ":" + second + " PM";
	}
		else if(hour>12 && hour<22) {
			if(minute < 10 && second > 9) {
				return "0" + (hour-12) + ":" + "0" + minute + ":" + second + " PM"; 
			}
			else if(minute > 9 && second < 10) {
				return "0" + (hour-12) + ":" + minute + ":"  + "0" + second + " PM"; 
			}
			else if(minute < 10 && second < 10) {
				return "0" + (hour-12) + ":" + "0" + minute + ":" + "0" + second + " PM"; 
			}
			return "0" + (hour-12) + ":" + minute + ":" + second + " PM";
		}else if(hour<=12 && hour!=0) {
		if(hour < 10) {
			if(minute < 10 && second > 9) {
			return "0" + hour + ":" + "0" + minute + ":" + second + " AM"; 
			}
			else if(minute > 9 && second < 10) {
			return "0" + hour + ":" + minute + ":"  + "0" + second + " AM"; 
			}
			else if(minute < 10 && second < 10) {
			return "0" + hour + ":" + "0" + minute + ":" + "0" + second + " AM"; 
			} return "0" + hour + ":" + minute + ":" + second + " AM";
		}else if(hour > 10) {
			if(minute < 10 && second > 9) {
			return hour + ":" + "0" + minute + ":" + second + " AM"; 
			}
			else if(minute > 9 && second < 10) {
			return hour + ":" + minute + ":"  + "0" + second + " AM"; 
			}
			else if(minute < 10 && second < 10) {
			return hour + ":" + "0" + minute + ":" + "0" + second + " AM"; 
			} 
			return hour + ":" + minute + ":" + second + " AM";
		}
	}else if(hour == 0) {
		if(minute < 10 && second > 9) {
			return "0" + hour + ":" + "0" + minute + ":" + second + " AM"; 
		}
		else if(minute > 9 && second < 10) {
			return "0" + hour + ":" + minute + ":"  + "0" + second + " AM"; 
		}
		else if(minute < 10 && second < 10) {
			return "0" + hour + ":" + "0" + minute + ":" + "0" + second + " AM"; 
		}
		return "0" + hour + ":" + minute + ":" + second + " AM";
	} return "Error";
}
	public void add(Time t2) {
		this.hour = checkhour(hour + t2.hour);
		this.minute = checkmin(minute + t2.minute);
		this.second = checksec(second + t2.second);
	}

	@Override
	public int compareTo(Object obj) {
		Time tmp = (Time)obj;
		if(this.hour > tmp.hour ||(this.hour == tmp.hour && this.minute > tmp.minute) 
				|| (this.hour == tmp.hour && this.minute == tmp.minute && this.second > tmp.second)) return 1;
		else if(this.hour == tmp.hour && this.minute == tmp.minute && this.second == tmp.second) return 0;
		else return -1;
	}
}
