package myProjectPhase1;
import java.util.*;
public class Clinic {
	private String clinicname;
	private int clinicid;
	private String location;
	private int phone;//not applicable with international numbers
	protected ArrayList<Visit> visits;
	
	public Clinic(String clinicname,String location,int phone,int clinicid) {
		this.clinicname=clinicname;
		this.location=location;
		this.phone=phone;
		this.clinicid=clinicid;
		this.visits=new ArrayList<>();
	}
	public String getClinicname() {
		return clinicname;
	}
	public void setClinicname(String clinicname) {
		this.clinicname = clinicname;
	}
	public int getClinicid() {
		return clinicid;
	}
	public void setClinicid(int clinicid) {
		this.clinicid = clinicid;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public ArrayList<Visit> getVisits() {
		return visits;
	}
	public void setVisits(Visit visits) {
		this.visits.add(visits);
	}
	
	@Override
	public String toString() {
		return "Name:"+ clinicname +",id:"+clinicid+ ",location: "+location+",phone:"+phone;
	}

}
