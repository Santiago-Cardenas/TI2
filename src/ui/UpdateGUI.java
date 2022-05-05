package ui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

import java.io.IOException;

public class UpdateGUI {


    @FXML
    private Pane mainPane;

    @FXML
    private TextField nameTxtUpdate;

    @FXML
    private TextField surnameTxtUpdate;

    @FXML
    private RadioButton maleRBUpdate;

    @FXML
    private ToggleGroup GenderUpdate;

    @FXML
    private RadioButton femaleRBUpdate;

    @FXML
    private DatePicker bdPickerUpdate;

    @FXML
    private TextField heightTxtUpdate;

    @FXML
    private TextField nationalityTxtUpdate;


    //Attributes
    private Stage searchStage;

    private MainControllerGUI mainControllerGUI;


    public UpdateGUI(MainControllerGUI mainControllerGUI){
        setSearchStage(new Stage());
        mainPane = new Pane();
        this.mainControllerGUI = mainControllerGUI;
    }

    public void setSearchStage(Stage searchStage) {
        this.searchStage = searchStage;
    }

    @FXML
    void goBackUpdate(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("SearchWindow.fxml"));
        fxmlLoader.setController(mainControllerGUI.getSearchGUI());
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);
        mainControllerGUI.getMainStage().setScene(scene);
        mainControllerGUI.getMainStage().setTitle("Search");
        mainControllerGUI.getMainStage().show();
    }

    @FXML
    void updatePerson(ActionEvent event) {

    }
}
