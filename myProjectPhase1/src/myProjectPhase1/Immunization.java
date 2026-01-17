package myProjectPhase1;

public class Immunization extends Visit {
	private String vaccinename;
	private double dose;
		public Immunization( int visitid, String diagnosis, String symptoms, Clinic clinic,String vaccinename,double dose) {
			super(visitid, diagnosis, symptoms, clinic);
			this.vaccinename=vaccinename;
			this.dose=dose;
		}
		public String getVaccinename() {
			return vaccinename;
		}
		public double getDose() {
			return dose;
		}
	@Override
	public void generateReport() {
		System.out.println("immunization visit:");
		System.out.println("vaccine name:"+vaccinename);
		
			System.out.println("dose="+dose);
		
		super.generateReport();
		System.out.println("-------------------------------------------------------------");
	}
	
}
