package myProjectPhase1;
import java.util.*;
public class Driver {
	// student : Muhammad Shadeed , id:1242602

	public static void main(String[] args) {
		 ArrayList<Patient> patients = new ArrayList<>();
		ArrayList<Clinic> clinics = new ArrayList<>();
	
	int input=0;
	Scanner sc=new Scanner(System.in);
	while(input!=6) {
		System.out.println("1-New blood test visit");
		System.out.println("2-New alcochol test visit");
		System.out.println("3-New incident visit");
		System.out.println("4-New immunization visit");
		System.out.println("5-print patient visit information");
		System.out.println("6-exit");
		input=sc.nextInt();
		sc.nextLine();
		switch(input){
			case 1:
				newBloodTest(patients,clinics,sc);
			break;
			case 2:
				newAlcocholTest(patients,clinics,sc);
			break;
			case 3:
				newIncidentVisit(patients,clinics,sc);
			break;
			case 4:
				newImmunizationVisit(patients,clinics,sc);
			break;
			case 5:
				PrintPatientData(patients,clinics,sc);
			break;
			case 6:
				System.out.println("Existing.......");
				System.out.println("exited ");
			break;
			default:
				System.out.println(" enter a number from 1-6");
				break;
				// read the comments in the "newBloodTest" method very important!!!!
				
		}		
		
	}
sc.close();
	
	
	}
	public static void newBloodTest(ArrayList<Patient> p,ArrayList<Clinic>c,Scanner sca) {
 System.out.println("enter the patient id");//checking if the patients exists already or not
 int checker= sca.nextInt();
 sca.nextLine();
     int position= findPatientIndex(p, checker);
   Patient currentpatient;
 if (position != -1) { //if patient with the same id exists no need to make new patient
  currentpatient= p.get(position);
 System.out.println("patient exists visit will be added to him");
	 } else {//if no patient with the same id exists creating new patient
	  System.out.println("new patient  add his details");
  System.out.println("enter id:");
	   int id=sca.nextInt();
	   System.out.println("enter first name:");
		  String fn=sca.next();
		        System.out.println("enter last name:");
		           String ln=sca.next();    
		           System.out.println("enter date of birth:");
		           String dt=sca.next();//date of birth is a string , write the date like this (dd/mm/yy) no spaces
		           System.out.println("enter city:");
		            String ct=sca.next();
		            System.out.println("enter gender:");
		            String gnd=sca.next();
		            System.out.println("does the patient have insurance? true/false");
		            boolean hsinsure=sca.nextBoolean();//enter true or false
		            sca.nextLine();
		            currentpatient= new Patient(id,fn,ln,dt,ct,gnd,hsinsure);
		            p.add( currentpatient);
		        }

		        System.out.println("enter the clinic id");//checking if the clinic exits or not
		        int clinhecker = sca.nextInt();
		        sca.nextLine();
		        int cposition = findClinicIndex(c, clinhecker);
		        Clinic currentclinic;
		        if (cposition != -1) {
		            currentclinic = c.get(cposition);
		            System.out.println("clinic exists");
		        } else {
		            System.out.println("enter clinic data ");//enter as given on the constructor of clinic
		            System.out.println("enter clinic name:");
		            String cname = sca.next();
		            System.out.println("enter clinic location:");
		            String cloc = sca.next();
		            System.out.println("enter clinic phone:");
		            int phone = sca.nextInt();
		            System.out.println("enter clinic id again:");
		            int cid2 = sca.nextInt();
		            currentclinic=new Clinic(cname,cloc,phone,cid2);
		            sca.nextLine();
		            c.add(currentclinic);
		        }

		        System.out.println("add visit details");//check bloodtest constructor
		        BloodTest bt;
		        System.out.println("enter visit id:");
		        int idbt=sca.nextInt();
		        sca.nextLine();
		        System.out.println("enter diagnosis:");
		        String dignss=sca.nextLine();
		        System.out.println("enter symptoms:");
		        String sympts=sca.nextLine();
		        System.out.println("enter RBC:");
		        double rbd=sca.nextDouble();
		        System.out.println("enter WBC:");
		        double wbc=sca.nextDouble();
		        System.out.println("enter PLT:");
		        double plt=sca.nextDouble();
		        sca.nextLine();

		        bt=new BloodTest(idbt,dignss,sympts,currentclinic,rbd,wbc,plt);
		        currentpatient.setVisits(bt);
		        currentclinic.setVisits(bt);
		}


	public static void newAlcocholTest(ArrayList<Patient> p,ArrayList<Clinic> c,Scanner sca) {

        System.out.println("enter the patient id");
        int checker= sca.nextInt();
        sca.nextLine();
        int position= findPatientIndex(p, checker);
        Patient currentpatient;
        if (position != -1) { 
             currentpatient= p.get(position);
            System.out.println("patient exists visit will be added to him");
        } else {
            System.out.println("new patient add his details");
            System.out.println("enter id:");
            int id=sca.nextInt();
            System.out.println("enter first name:");
            String fn=sca.next();
            System.out.println("enter last name:");
            String ln=sca.next();    
            System.out.println("enter date of birth:");
            String dt=sca.next();
            System.out.println("enter city:");
            String ct=sca.next();
            System.out.println("enter gender:");
            String gnd=sca.next();
            System.out.println("has insurance? true/false");
            boolean hsinsure=sca.nextBoolean();
            sca.nextLine();
            currentpatient= new Patient(id,fn,ln,dt,ct,gnd,hsinsure);
            p.add( currentpatient);
        }

        System.out.println("enter the clinic id");
        int clinhecker = sca.nextInt();
        sca.nextLine();
        int cposition = findClinicIndex(c, clinhecker);
        Clinic currentclinic;
        if (cposition != -1) {
            currentclinic = c.get(cposition);
            System.out.println("clinic exists");
        } else {
            System.out.println("enter clinic data");
            System.out.println("enter clinic name:");
            String cname = sca.next();
            System.out.println("enter clinic location:");
            String cloc = sca.next();
            System.out.println("enter clinic phone:");
            int phone = sca.nextInt();
            System.out.println("enter clinic id again:");
            int cid2 = sca.nextInt();
            currentclinic=new Clinic(cname,cloc,phone,cid2);
            sca.nextLine();
            c.add(currentclinic);
        }

        System.out.println("add visit details");//check AlcocholTest constructor
        AlcocholTest bt;
        System.out.println("enter visit id:");
        int idbt=sca.nextInt();
        sca.nextLine();
        System.out.println("enter diagnosis:");
        String dignss=sca.nextLine();
        System.out.println("enter symptoms:");
        String sympts=sca.nextLine();
        System.out.println("enter blood alcohol concentration:");
        double bac=sca.nextDouble();
        System.out.println("enter test result true=is POSITIVE /false=not NEGATIVE:");
        boolean testre=sca.nextBoolean();
        sca.nextLine();
        bt=new AlcocholTest(idbt,dignss,sympts,currentclinic,bac,testre);
        currentpatient.setVisits(bt);
        currentclinic.setVisits(bt);
}


	public static void newIncidentVisit(ArrayList<Patient>p,ArrayList<Clinic>c,Scanner sca) {

        System.out.println("enter the patient id");
        int checker= sca.nextInt();
        sca.nextLine();
        int position= findPatientIndex(p, checker);
        Patient currentpatient;
        if (position != -1) { 
             currentpatient= p.get(position);
            System.out.println("patient exists visit will be added to him");
        } else {
            System.out.println("new patient, add his details");
            System.out.println("enter id:");
            int id=sca.nextInt();
            System.out.println("enter first name:");
            String fn=sca.next();
            System.out.println("enter last name:");
            String ln=sca.next();    
            System.out.println("enter date of birth:");
            String dt=sca.next();
            System.out.println("enter city:");
            String ct=sca.next();
            System.out.println("enter gender:");
            String gnd=sca.next();
            System.out.println("has insurance? true/false");
            boolean hsinsure=sca.nextBoolean();
            sca.nextLine();
            currentpatient= new Patient(id,fn,ln,dt,ct,gnd,hsinsure);
            p.add( currentpatient);
        }

        System.out.println("enter the clinic id");
        int clinhecker = sca.nextInt();
        sca.nextLine();
        int cposition = findClinicIndex(c, clinhecker);
        Clinic currentclinic;
        if (cposition != -1) {
            currentclinic = c.get(cposition);
            System.out.println("clinic exists");
        } else {
            System.out.println("enter clinic data");
            System.out.println("enter clinic name:");
            String cname = sca.next();
            System.out.println("enter clinic location:");
            String cloc = sca.next();
            System.out.println("enter clinic phone:");
            int phone = sca.nextInt();
            System.out.println("enter clinic id again:");
            int cid2 = sca.nextInt();
            currentclinic=new Clinic(cname,cloc,phone,cid2);
            sca.nextLine();
            c.add(currentclinic);
        }

        System.out.println("add visit details");//check Incident constructor
        Incident bt;
        System.out.println("enter visit id:");
        int idbt=sca.nextInt();
        sca.nextLine();
        System.out.println("enter diagnosis:");
        String dignss=sca.nextLine();
        System.out.println("enter symptoms:");
        String sympts=sca.nextLine();
        System.out.println("enter severity level *low/meiduim/high*:");
        String severity=sca.nextLine();
        System.out.println("enter injured body part:");
        String bodpar=sca.nextLine();
        bt=new Incident(idbt,dignss,sympts,currentclinic,severity,bodpar);
        currentpatient.setVisits(bt);
        currentclinic.setVisits(bt);
}


	
	public static void newImmunizationVisit(ArrayList<Patient>p,ArrayList<Clinic>c,Scanner sca) {

        System.out.println("enter the patient id");
        int checker= sca.nextInt();
        sca.nextLine();
        int position= findPatientIndex(p, checker);
        Patient currentpatient;
        if (position != -1) { 
             currentpatient= p.get(position);
            System.out.println("patient exists visit will be added to him");
        } else {
            System.out.println("new patient add his details");
            System.out.println("enter id:");
            int id=sca.nextInt();
            System.out.println("enter first name:");
            String fn=sca.next();
            System.out.println("enter last name:");
            String ln=sca.next();    
            System.out.println("enter date of birth:");
            String dt=sca.next();
            System.out.println("enter city:");
            String ct=sca.next();
            System.out.println("enter gender:");
            String gnd=sca.next();
            System.out.println("has insurance? true/false");
            boolean hsinsure=sca.nextBoolean();
            sca.nextLine();
            currentpatient= new Patient(id,fn,ln,dt,ct,gnd,hsinsure);
            p.add( currentpatient);
        }

        System.out.println("enter the clinic id");
        int clinhecker = sca.nextInt();
        sca.nextLine();
        int cposition = findClinicIndex(c, clinhecker);
        Clinic currentclinic;
        if (cposition != -1) {
            currentclinic = c.get(cposition);
            System.out.println("clinic exists");
        } else {
            System.out.println("enter clinic data");
            System.out.println("enter clinic name:");
            String cname = sca.next();
            System.out.println("enter clinic location:");
            String cloc = sca.next();
            System.out.println("enter clinic phone:");
            int phone = sca.nextInt();
            System.out.println("enter clinic id again:");
            int cid2 = sca.nextInt();
            currentclinic=new Clinic(cname,cloc,phone,cid2);
            sca.nextLine();
            c.add(currentclinic);
        }

        System.out.println("add visit details");//check Immunization constructor
        Immunization bt;
        System.out.println("enter visit id:");
        int idbt=sca.nextInt();
        sca.nextLine();
        System.out.println("enter diagnosis:");
        String dignss=sca.nextLine();
        System.out.println("enter symptoms:");
        String sympts=sca.nextLine();
        System.out.println("enter vaccine name:");
        String vacc=sca.nextLine();
        System.out.println("enter vaccine dose:");
        double dose=sca.nextDouble();
        sca.nextLine();
        bt=new Immunization(idbt,dignss,sympts,currentclinic,vacc,dose);
        currentpatient.setVisits(bt);
        currentclinic.setVisits(bt);
}


   public static int findPatientIndex(ArrayList<Patient> p, int id) {
	    for (int i = 0; i < p.size(); i++) {
	        if (p.get(i).getId() == id) {
	            return i;//returns the position of the patient if exists in the array list
	        }
	    }
	    return -1; //when no paitent with the same id was found
	}

	public static int findClinicIndex(ArrayList<Clinic> c, int clinicid) {
	    for (int i = 0; i < c.size(); i++) {
	        if (c.get(i).getClinicid() == clinicid) {
	            return i;//returns the position of the clinic in the arraylist
	        }
	    }
	    return -1; // when no clinic is found with the same id
	}

   public static void PrintPatientData(ArrayList<Patient> p,ArrayList<Clinic>c,Scanner sca) {
		System.out.println("enter the patient's id");
		int inputid=sca.nextInt();	   
		sca.nextLine();
		int position =findPatientIndex(p,inputid);
		if(position !=-1) {
			System.out.println("patient  exists, printing the data :");
			
			p.get(position).printData();
		}
		else {
			System.out.println(" patient isnt found, try again make sure to enter the right id");
		}
	}

}
