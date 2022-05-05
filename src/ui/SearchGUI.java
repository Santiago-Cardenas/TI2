package ui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class SearchGUI {

    @FXML
    private Pane mainPane;

    @FXML
    private TextField nameTxtSearch;

    @FXML
    private Button searchByName;

    @FXML
    private Button goBackSearch;

    @FXML
    private Button searchBySurname;

    @FXML
    private Button searchByFullName;

    @FXML
    private Button searchByCode;

    @FXML
    private ListView<?> searchResults;

    //Attributes
    private Stage searchStage;

    private MainControllerGUI mainControllerGUI;


    public SearchGUI(MainControllerGUI mainControllerGUI){
        setSearchStage(new Stage());
        mainPane = new Pane();
        this.mainControllerGUI = mainControllerGUI;
    }

    public void setSearchStage(Stage searchStage) {
        this.searchStage = searchStage;
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

    @FXML
    void deleteBt(ActionEvent event) {

    }

    @FXML
    void goToUpdate(ActionEvent event) {

    }
}
