package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

public class Date {

	private int month;
	private int day;
	private int year;
	private boolean isHoliday;


	public static void main(String[] args) {
		Date test = new Date(2,11,2004,false);
		System.out.println(test);
		Date test2 = new Date(11,12,2003,true);
		System.out.println(test2); 	
		Date test3 = new Date(4,28,2004,false);
		System.out.println(test3);
		Date test4 = new Date(10,8,2001,true);
		System.out.println(test4); 	
		Date test5 = new Date(12,25,2022,false);
		System.out.println(test5); 	
		
		LinkedList<Date> list = new LinkedList<Date>();
		list.add(test5);
		list.add(test4);
		list.add(test3);
		list.add(test2);
		list.add(test);
		list.add(test3);
		System.out.println(list);
		
		HashSet<Date> set = new HashSet<Date>();	
		set.add(test3);
		set.add(test2);
		set.add(test);
		set.add(test3);
		System.out.println(set);
	}

	/**
	 * 
	 * @param month of the year
	 * @param day of they year
	 * @param year what year it is
	 * @param isHoliday is it a holiday
	 */
	public Date(int month, int day, int year, boolean isHoliday) {

		this.month = month;
		this.day = day;
		this.year = year;
		this.isHoliday = isHoliday;
	}

	@Override
	public String toString() {
		return "Date [month=" + month + ", day=" + day + ", year=" + year + ", isHoliday=" + isHoliday + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(day, month, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return day == other.day && month == other.month && year == other.year;
	}

}
