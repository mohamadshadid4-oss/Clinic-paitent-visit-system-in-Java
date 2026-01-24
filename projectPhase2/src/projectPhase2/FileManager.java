package projectPhase2;
import java.io.*;

public class FileManager {

    private static String fileName = "patients.txt";

    public static void savePatientVisit(Patient p) throws IOException {

        FileWriter fw = new FileWriter(fileName,true); 
        PrintWriter pw= new PrintWriter(fw);
      pw.println(p.toString()+" "+p.getVisits().get(0).toString()+" "+p.getVisits().get(0).getClinic().toString());
      pw.println("/"+"\n");
      pw.close();
    }
}
	


