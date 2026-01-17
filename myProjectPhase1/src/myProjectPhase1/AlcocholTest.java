package myProjectPhase1;



public class AlcocholTest extends Visit {
	private double bac;//blood alcochol concetration 
	private boolean testresult;

	public AlcocholTest(int visitid, String diagnosis, String symptoms, Clinic clinic,double bac,boolean testresult) {
		super(visitid, diagnosis, symptoms, clinic);
		this.bac=bac;
		this.testresult=testresult;
	}

	public double getBac() {
		return bac;
	}

	public boolean isTestresult() {
		return testresult;
	}
@Override
public void generateReport() {
	System.out.println("Alcochol test results:");
	System.out.println("blood-alcochol concetration:"+bac);
	if(testresult) {
		System.out.println("test result:POSITIVE");//positive result means the person is drunk
	}
	else {
		System.out.println("test result:NEGATIVE");//negative result the person isnt drunk
	}
	super.generateReport();
	System.out.println("-------------------------------------------------------------");
}
}
