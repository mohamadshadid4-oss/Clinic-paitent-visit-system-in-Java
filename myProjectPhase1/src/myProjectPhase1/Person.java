package myProjectPhase1;

public abstract class Person {
	private int id;
	private String firstname;
	private String lastname;
		public Person(int id,String firstname,String lastname){
			
			this.id=id;
			this.firstname=firstname;
			this.lastname=lastname;	
		}
		public int getId() {
			return this.id;
		}
		
@Override
public String toString() {//returns only the id so i made getters to get the first name and last name
	return "id="+id;
}
public String getFirstname() {
	return firstname;
}
public String getLastname() {
	return lastname;
}
}
