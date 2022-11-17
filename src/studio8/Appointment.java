package studio8;

import java.util.Objects;



public class Appointment {

	private Date date;
	private Time time;
	
	
	public Appointment(Date date, Time time) {
		
		this.date = date;
		this.time = time;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Appointment a1 = new Appointment(new Date(2,2,2003, false), new Time(2,4,true));
		System.out.println(a1);
		Appointment a2 = new Appointment(new Date(2,2,2003, true), new Time(2,4,false));
		System.out.println(a1.equals(a2));
	}


	@Override
	public String toString() {
		return "Appointment [date=" + date + ", time=" + time + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(date, time);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Appointment other = (Appointment) obj;
		return Objects.equals(date, other.date) && Objects.equals(time, other.time);
	}

}
