package projectPhase2;
import java.io.*;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.geometry.*;
public class JavaFxForm extends Application {
	public static void main(String[] args) {
		launch(args);
		}
	@Override
	public void start(Stage primaryStage) {
		BorderPane p= new BorderPane();
		Label l1=new Label("Data saving system ");
		Label l2=new Label("Paitent data :");
		Label l3 = new Label("NOTE:Date should follow the format DD/MM/YYYY");
		
		
		Font f1= Font.font("Arial",FontWeight.BOLD,FontPosture.ITALIC,20);
		Font f2= Font.font("Arial",FontWeight.BOLD,15);
		Font f3= Font.font("Arial",15);
		Label lc= new Label("Clnic data:");
		Label lic=new Label("Incident data:");
		lic.setFont(f2);
		 lc.setFont(f2);
		l1.setFont(f1);
		l2.setFont(f2);
		
		
		
		Button b1= new Button("save");
		RadioButton b2= new RadioButton("male");
		RadioButton b3= new RadioButton("female");
		b2.setSelected(true);
		ToggleGroup tg = new ToggleGroup();
		b2.setToggleGroup(tg);
		b3.setToggleGroup(tg);
		CheckBox cb = new CheckBox("has insurance?");
		Button but= new Button("clear");
		
		DataEntery hb1= new DataEntery("patient id");
		hb1.getLabel().setFont(f3);
		DataEntery hb2= new DataEntery("patient first name");
		hb2.getLabel().setFont(f3);
		DataEntery hb3= new DataEntery("patient last name");
		hb3.getLabel().setFont(f3);
		DataEntery hb4= new DataEntery("patient Date of birth");
		hb4.getLabel().setFont(f3);
		DataEntery hb5 = new DataEntery("city");
		hb5.getLabel().setFont(f3);
		
		HBox hb = new HBox();
		hb.getChildren().addAll(l2,lc,lic);
		hb.setSpacing(300);
		VBox vb1= new VBox(60);
		vb1.setSpacing(20);
		vb1.getChildren().addAll(l1,hb);
		VBox vb2= new VBox(40);
		HBox vb3= new HBox(20);
		vb3.getChildren().addAll(b1,but);
		vb2.setSpacing(10);
		vb2.getChildren().addAll(hb1,hb2,hb3,hb4,hb5,b2,b3,cb,l3,vb3);
		p.setPadding(new Insets(10,150,10,150));
		
		
		p.setTop(vb1);
		p.setLeft(vb2);
		
		 
		 
		 DataEntery c1 = new DataEntery("Clinic name");
		 c1.getLabel().setFont(f3);
		 DataEntery c2 = new DataEntery("Clinic location");
		 DataEntery c3 = new DataEntery("Clinic phone");
		 DataEntery c4 = new DataEntery("Clinic id");
		 c2.getLabel().setFont(f3);
		 c3.getLabel().setFont(f3);
		 c4.getLabel().setFont(f3);
		VBox vb6= new VBox();
		vb6.getChildren().addAll(c1,c2,c3,c4);
		p.setCenter(vb6);
		DataEntery i1= new DataEntery("Visit id");
		DataEntery i2= new DataEntery("diagnosis");
		DataEntery i3= new DataEntery("symptoms");
		DataEntery i4= new DataEntery("severity");
		DataEntery i5= new DataEntery("body part");
		i1.getLabel().setFont(f3);
		i2.getLabel().setFont(f3);
		i3.getLabel().setFont(f3);
		i4.getLabel().setFont(f3);
		i5.getLabel().setFont(f3);
		
		i2.getTextField().setPrefWidth(400);
		i3.getTextField().setPrefWidth(400);
		i4.getTextField().setPrefWidth(400);
		VBox vb7= new VBox();
		vb7.getChildren().addAll(i1,i2,i3,i4,i5);
		p.setRight(vb7);
		
		b1.setOnAction(e->{
		     try {
		        if (hb1.getTextField().getText().isBlank() ||
		            hb2.getTextField().getText().isBlank() ||
		            hb3.getTextField().getText().isBlank() ||
		            hb4.getTextField().getText().isBlank() || 
		            hb5.getTextField().getText().isBlank()||c1.getTextField().getText().isBlank() 
		        	||c2.getTextField().getText().isBlank()||c3.getTextField().getText().isBlank()
		        	||c4.getTextField().getText().isBlank()||i1.getTextField().getText().isBlank()
		        	||i2.getTextField().getText().isBlank()||i3.getTextField().getText().isBlank()
		        	||i4.getTextField().getText().isBlank()||i5.getTextField().getText().isBlank()
		        	
) {
		            throw new IllegalArgumentException("All fields must be filled");
		        }

		        int id = Integer.parseInt(hb1.getTextField().getText());
		        String s1 = hb2.getTextField().getText();
		        String s2 = hb3.getTextField().getText();
		        String s3 = hb4.getTextField().getText();
		        String s5 = hb5.getTextField().getText();
		        
		        String s6= c1.getTextField().getText();
		        String s7= c2.getTextField().getText();
		        
		        String s8=i2.getTextField().getText();
		        String s9=i3.getTextField().getText();
		        String s10=i4.getTextField().getText();
		        String s11=i5.getTextField().getText();
		        
		        
		        int idc = Integer.parseInt(c4.getTextField().getText());
		        int cphone = Integer.parseInt(c3.getTextField().getText());
		        
		        int incid=Integer.parseInt(i1.getTextField().getText());
		        
		        if (s1.matches(".*\\d.*")) {
		            throw new IllegalArgumentException("First name must not contain numbers");
		        }
		        if (s2.matches(".*\\d.*")) {
		            throw new IllegalArgumentException("Last name must not contain numbers");
		        }
		        if (s6.matches(".*\\d.*")) {
		            throw new IllegalArgumentException("clinic must not contain numbers");
		        }
		        if (s11.matches(".*\\d.*")) {
		            throw new IllegalArgumentException("Body part should be only a name with no numbers");
		        }
		        String[] dateParts = s3.split("/");
		        if (dateParts.length != 3) {
		            throw new IllegalArgumentException("Date must be in DD/MM/YYYY format");
		        }
		        Integer.parseInt(dateParts[0]);
		        Integer.parseInt(dateParts[1]);
		        Integer.parseInt(dateParts[2]);
		        Alert ok = new Alert(Alert.AlertType.INFORMATION);
		        ok.setTitle("Success");
		        ok.setHeaderText("All Good");
		        ok.setContentText("Everything is SAVED no errors.");
		        ok.show();
		        String s4="male";
		        if(b3.isSelected()) {
		            s4="female";
		        }
		        boolean hasInsure=false;
		        if(cb.isSelected()) {
		            hasInsure= true;
		        }
		        Patient pe= new Patient(id,s1,s2,s3,s5,s4,hasInsure);
		        Clinic c= new Clinic (s6,s7,cphone,idc);
		        Incident inc= new Incident(incid,s8,s9,c,s10,s11);
		        System.out.println(pe.toString());//prints the data u entered so i could make sure all data are correct
		       System.out.println(c.toString());
		       inc.generateReport();
		       pe.setVisits(inc);
		       try {
		       FileManager.savePatientVisit(pe);
		       }
		       catch(IOException er) {
		    	   Alert errr= new Alert(Alert.AlertType.ERROR);
		    	   errr.setTitle("oops");
		    	   errr.setHeaderText("something went wrong");
		    	   errr.setContentText("file doesnt exists");
		    	   errr.show();
		       }

		    } catch (NumberFormatException ex) {
		        Alert error = new Alert(Alert.AlertType.ERROR);
		        error.setTitle("Error");
		        error.setHeaderText("Wrong Type");
		        error.setContentText("ID's,date and phone values must be integers *not long type of data*");
		        error.show();
		    } catch (IllegalArgumentException ex) {
		        Alert error = new Alert(Alert.AlertType.ERROR);
		        error.setTitle("Error");
		        error.setHeaderText("Invalid Data");
		        error.setContentText(ex.getMessage());
		        error.show();
		    }
		});
     but.setOnAction(e->{
     hb1.getTextField().clear();
     hb2.getTextField().clear();
     hb3.getTextField().clear();
     hb4.getTextField().clear();
     hb5.getTextField().clear();
     cb.setSelected(false);
     c1.getTextField().clear();
     c2.getTextField().clear();
     c3.getTextField().clear();
     c4.getTextField().clear();
     i1.getTextField().clear();
     i2.getTextField().clear();
     i3.getTextField().clear();
     i4.getTextField().clear();
     i5.getTextField().clear();
     Alert done= new Alert(Alert.AlertType.INFORMATION);
     done.setTitle("Success");
     done.setHeaderText("all clear");
     done.setContentText("all text feilds are empty");
     done.show();
     });

	
		
		
		Scene scene = new Scene(p,1500,600);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	}

