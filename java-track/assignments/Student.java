
public class Student {

		private String FirstName;
		private String LastName;
		private Integer StudentID;
		private Integer Credits;
		private Double GPA;
		private Double QualScore;
		
		public Student(String FirstName, String LastName,  Integer StudentID) {
			this.FirstName = FirstName;
			this.LastName = LastName;
			this.StudentID = StudentID;
			this.Credits = 0;
			this.GPA = 0.0;
			this.QualScore = 0.0;
		}
		
		public Student(String FirstName, String LastName,  Integer StudentID, Integer Credits, Double GPA) {
			this.FirstName = FirstName;
			this.LastName = LastName;
			this.StudentID = StudentID;
			this.Credits = Credits;
			this.GPA = GPA;
			this.QualScore = 0.0;
		}				
		public String getFirstName() {
			return FirstName;
		}
		public void setFirstName(String firstName) {
			FirstName = firstName;
		}
		public String getLastName() {
			return LastName;
		}
		public void setLastName(String LastName) {
			this.LastName = LastName;
		}		
		public String getName() {
			return this.FirstName + " " + this.LastName;
		}		
		public Integer getStudentID() {
			return StudentID;
		}
		public void setStudentID(Integer StudentID) {
			this.StudentID = StudentID;
		}
		public Integer getCredits() {
			return Credits;
		}
		public void setCredits(Integer Credits) {
			this.Credits = Credits;
		}
		public Double getGPA() {
			return GPA;
		}
		public void setGPA(Double GPA) {
			this.GPA = GPA;
		}

		
		public String getClassStanding() {
			if (this.Credits <= 29) {
				return "Freshman";
			}
			else if (this.Credits < 60) {
				return "Sophomore";							
			}
			else if (this.Credits < 90) {
				return "Junior";				
			}
			else {
				return "Senior";
			}
			
		}
		
		public void submitGrade(double grade, int Credits) {
			this.QualScore += Credits * grade;
			int newCredits = this.Credits + Credits;
			setCredits(newCredits);						
			this.GPA = this.QualScore / (double)this.Credits;
			this.GPA = this.GPA * 1000;
			this.GPA = (double)Math.round(this.GPA);
			this.GPA = this.GPA/1000;
						
			setGPA(GPA); 
		}
		
		public double computeTuition() {
			int newCredits = Credits;
			if (newCredits %15 == 0) {
				newCredits -= 1;
			}			
			double tuition =(1+ Math.floor(newCredits / 15)) * 20000;
			return tuition;
		}
		public Student createLegacy(Student b) {
			double legacyGPA = (getGPA() + b.getGPA() / 2);
			int legacyID = getStudentID() + b.getStudentID();
			int legacyCredits;
			
			if (getCredits() > b.getCredits()) {
				legacyCredits = getCredits() ;
			}
			else {
				legacyCredits = b.getCredits();
			}
			
			
		
			return new Student (getName(), b.getName(), legacyID, legacyCredits, legacyGPA);
		}
		
		public String toString() {
			return this.FirstName + this.LastName + this.StudentID;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
