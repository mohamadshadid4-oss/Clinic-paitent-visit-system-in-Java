package myProjectPhase1;
import java.util.*;
public class Patient extends Person{
private String dateofbirth; //had to make it a string cuz i have no idea how to enter date using scanners
private String city;
private String gender;
private boolean hasinsurance;
protected ArrayList<Visit> visits;
public Patient(int id,String firstname,String lastname,String dateofbirth,String city,String gender,boolean hasinsurance) {
	super(id,firstname,lastname);
	
	this.dateofbirth=dateofbirth;
	this.city=city;
	this.gender=gender;
	this.hasinsurance=hasinsurance;
	this.visits=new ArrayList<>();
}


public String getDateofbirth() {
	return dateofbirth;
}

public String getCity() {
	return city;
}

public String getGender() {
	return gender;
}

public boolean isHasinsurance() {
	return hasinsurance;
}

public ArrayList<Visit> getVisits() {
	return visits;
}
public void setVisits( Visit visits) {
	this.visits.add(visits);
}
@Override
public String toString() {
	return super.toString()+" name:"+this.getFirstname()+" "+this.getLastname()+" ,Dateofbirth:"+dateofbirth+" ,city:"+city+" ,gender:"+gender+" ,hasinsurance?? "+hasinsurance;
}
public void printData() {
	System.out.println(this.toString());
for(int i=0;i<visits.size();i++) {
 visits.get(i).generateReport();
}
}
}
