package projectPhase2;
import java.util.Date;


public abstract class Visit implements Reportable {
	@Override
	public String toString() {
		return "Visit [visitDate=" + visitDate + ", visitid=" + visitid + ", diagnosis=" + diagnosis + ", symptoms="
				+ symptoms + ", clinic=" + clinic + "]";
	}
	private Date visitDate;
	private int visitid;
	private	String diagnosis;
	private String symptoms;
    private Clinic clinic;
    public Visit(int visitid,String diagnosis,String symptoms,Clinic clinic) {
    	this.visitDate=new Date();
    	this.visitid=visitid;
    	this.diagnosis=diagnosis;
    	this.symptoms=symptoms;
    	this.clinic=clinic;
    }
    public int getVisitid() {
		return visitid;
	}
	public void setVisitid(int visitid) {
		this.visitid = visitid;
	}
	public Date getVisitDate() {
		return visitDate;
	}
	
	public String getDiagnosis() {
		return diagnosis;
	}
	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}
	public String getSymptoms() {
		return symptoms;
	}
	public void setSymptoms(String symptoms) {
		this.symptoms = symptoms;
	}
	public Clinic getClinic() {
		return clinic;
	}
	public void setClinic(Clinic clinic) {
		this.clinic = clinic;
	}
	@Override
	public void generateReport() {
		System.out.println("Visit number: "+visitid);
		System.out.println("Date: "+visitDate);
		System.out.println("diagnosis: "+diagnosis);
		System.out.println("symptoms: "+symptoms);
		System.out.println("clinic data: ");
        System.out.println(clinic.toString());
	}
	
}
