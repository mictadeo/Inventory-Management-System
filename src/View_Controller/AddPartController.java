
package View_Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

public class AddPartController implements Initializable {

    @FXML private Label companyMachineLabel;
    @FXML private TextField companyMachineTextField;
    @FXML private RadioButton inHouseRadioButton;
    @FXML private RadioButton outSourcedRadioButton;
    private ToggleGroup radioButtonToggleGroup;
    
    public void radioButtonChanged()
    {
        if (this.radioButtonToggleGroup.getSelectedToggle().equals(this.inHouseRadioButton))
        {
            companyMachineLabel.setText("Machine ID");
        companyMachineTextField.setPromptText("Machine ID");
        
        } else {
            
            companyMachineLabel.setText("Company Name");
        companyMachineTextField.setPromptText("Company Name");
        
        }
        
    }
    
    public void cancelButtonPushed(ActionEvent event) throws IOException
    {
        Parent addViewParent = FXMLLoader.load(getClass().getResource("Main.fxml"));
        Scene mainPartScene = new Scene (addViewParent);
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(mainPartScene);
        window.show();
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        radioButtonToggleGroup = new ToggleGroup();
        this.outSourcedRadioButton.setToggleGroup(radioButtonToggleGroup);
        this.inHouseRadioButton.setToggleGroup(radioButtonToggleGroup);
        
    }    
    
}
