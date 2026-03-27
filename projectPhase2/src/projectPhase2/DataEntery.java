package projectPhase2;

import javafx.scene.layout.HBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class DataEntery extends HBox {

private Label lb;
private TextField tf;
public DataEntery (String label) {
	lb=new Label(label);
	tf=new TextField("");
	this.getChildren().addAll(lb, tf);
	
}
public TextField getTextField() {
    return tf;
}
public Label getLabel() {
    return lb;
}
}
