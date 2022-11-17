package studio8;

import java.util.Objects;

public class Time {

	private int hour;
	private int min;
	private boolean H24;



	public static void main(String[] args) {
		Time test = new Time(0,24,true);
		System.out.println(test);
		Time test2 = new Time(10,10,false);
		System.out.println(test2); 	
		
		System.out.println(test.equals(test2));
	}
	/**
	 * 
	 * @param hour hour of time
	 * @param min minute of time 
	 * @param h24 if its a 24 clock or 12 hour clock
	 */
	public Time(int hour, int min, boolean h24) {
		this.hour = hour;
		this.min = min;
		H24 = h24;
	}

	@Override
	public String toString() {
		if(H24) {
			return hour + ":" + min;
		}
		else {
			if(hour > 12) {
				return hour - 12 + ":" + min + "pm";
			}
			else {
				return hour + ":" + min + "am";
			}
		}

	}
	@Override
	public int hashCode() {
		return Objects.hash(hour, min);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		return hour == other.hour && min == other.min;
	}


}