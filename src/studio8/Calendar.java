package studio8;

import java.util.HashSet;

public class Calendar {

	
	private HashSet<Appointment> cal;
	
	public Calendar() {
		cal = new HashSet<Appointment>();
		
	}

	public void calendarAdd(Appointment app) {
		cal.add(app);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar classes = new Calendar();
		Appointment a1 = new Appointment(new Date(2,2,2003, false), new Time(2,4,true));	
		Appointment a2 = new Appointment(new Date(2,2,2003, true), new Time(2,4,false));
		classes.calendarAdd(a2);
		classes.calendarAdd(a1);
		
	
	}

}
