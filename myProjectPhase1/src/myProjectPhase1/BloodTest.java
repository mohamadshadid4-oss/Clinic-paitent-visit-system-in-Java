package myProjectPhase1;
public class BloodTest extends Visit {
	private double rbc,wbc,plt;
	public BloodTest(int id,String dia,String symp,Clinic c,double rbc,double wbc,double plt){
		super(id,dia,symp,c);
		this.rbc=rbc;
		this.wbc=wbc;
		this.plt=plt;
	}
	public double getRbc() {
		return rbc;
	}
	
	public double getWbc() {
		return wbc;
	}
	
	public double getPlt() {
		return plt;
	}
	@Override
	public void generateReport() {
		System.out.println("Blood test data:");
		System.out.println("rbc="+rbc+" wbc="+wbc+" plt="+plt);
		super.generateReport();
		System.out.println("-------------------------------------------------------------");//a separator for printing ,it gives it a better shape for the output to look at
         
	}
	

}
