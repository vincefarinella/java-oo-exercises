import java.util.ArrayList;

public class Course {

	private String Name;
	private Integer Credits;
	private Integer Seats;
	private String Roster;
	
	public Course(String Name, Integer Credits, Integer Seats, String Roster){
		this.Name = Name;
		this.Credits = Credits;
		this.Seats = Seats;
		this.Roster = Roster;								
	}
	public String getName() {
		return this.Name;
	}
	public void setName(String name) {
		this.Name = name;
	}
	public Integer getCredits() {
		return this.Credits;
	}
	public void setCredits(Integer credits) {
		this.Credits = credits;
	}
	public Integer getSeats() {
		return this.Seats;
	}
	public void setSeats(Integer seats) {
		this.Seats = seats;
	}
	public String getRoster() {
		return this.Roster;
	}
	public void setRoster(String roster) {
		this.Roster = roster;
	}

	
	
	public String addStudent(Student other) {
		
		ArrayList<Student> roster = new ArrayList<Student>();
		roster.add(other);
		
		return ArrayList;
	}
	
	public String generateRoster() {
		return Roster;
	}
	
	public int averageGPA() {
		return 0;//TODO put real answer here
	}
	
	public String ToString() {
		return this.Name + this.Credits;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
