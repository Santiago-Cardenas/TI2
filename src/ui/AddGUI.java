package ui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class AddGUI {

    @FXML
    private Pane mainPane;

    @FXML
    private TextField nameTxt;

    @FXML
    private TextField surnameTxt;

    @FXML
    private RadioButton maleRB;

    @FXML
    private ToggleGroup Gender;

    @FXML
    private RadioButton femaleRB;

    @FXML
    private DatePicker bdPicker;

    @FXML
    private TextField heightTxt;

    @FXML
    private TextField nationalityTxt;

    //Attributes
    private Stage searchStage;

    private MainControllerGUI mainControllerGUI;


    public AddGUI(MainControllerGUI mainControllerGUI){
        setSearchStage(new Stage());
        mainPane = new Pane();
        this.mainControllerGUI = mainControllerGUI;
    }

    public void setSearchStage(Stage searchStage) {
        this.searchStage = searchStage;
    }

    @FXML
    void addPerson(ActionEvent event) {

    }

    @FXML
    void goBackMain(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("MainWindow.fxml"));
        fxmlLoader.setController(mainControllerGUI);
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);
        mainControllerGUI.getMainStage().setScene(scene);
        mainControllerGUI.getMainStage().setTitle("Main");
        mainControllerGUI.getMainStage().show();
    }
}
