package ui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class GenerateGUI {

    @FXML
    private Pane generatePane;

    //Attributes
    private Stage searchStage;

    private MainControllerGUI mainControllerGUI;


    public GenerateGUI(MainControllerGUI mainControllerGUI){
        setSearchStage(new Stage());
        generatePane = new Pane();
        this.mainControllerGUI = mainControllerGUI;
    }

    public void setSearchStage(Stage searchStage) {
        this.searchStage = searchStage;
    }

    @FXML
    void generatePeople(ActionEvent event) {

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
