package projectPhase2;

public class Incident extends Visit {
	@Override
	public String toString() {
		return super.toString()+"severity=" + severity + ", bodypart=" + bodypart ;
	}
	private String severity;
	private String bodypart;

	public Incident( int visitid, String diagnosis, String symptoms, Clinic clinic,String severity,String bodypart) {
		super( visitid, diagnosis, symptoms, clinic);
		this.severity=severity;
		this.bodypart=bodypart;
	}

	public String getSeverity() {
		return severity;
	}

	public String getBodypart() {
		return bodypart;
	}
	@Override
	public void generateReport() {
		System.out.println("incident visit ");
		System.out.println("bodypart injured:"+bodypart+" severity:"+severity);
		super.generateReport();
		System.out.println("-------------------------------------------------------------");
	}

}
