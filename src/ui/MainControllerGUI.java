package ui;

import javafx.embed.swing.JFXPanel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class MainControllerGUI {
    //Attributes

    private AddGUI addModule;

    public GenerateGUI generateGUI;

    public SearchGUI searchGUI;

    public UpdateGUI updateGUI;

    @FXML
    private Pane mainPane;

    private Stage mainStage;

    public MainControllerGUI() {
        searchGUI= new SearchGUI(this);
       generateGUI = new GenerateGUI(this);
       updateGUI = new UpdateGUI(this);
        addModule = new AddGUI(this);
        mainStage = new Stage();
    }

    public  void startMain( Pane mainPane ) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("MainWindow.fxml"));
        fxmlLoader.setController(this);
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);
        mainStage.setScene(scene);
        mainStage.setTitle("Main");
        mainStage.show();
    }

    @FXML
    void toGenerateWindow(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("GenerateWindow.fxml"));
        fxmlLoader.setController(generateGUI);
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);
        mainStage.setScene(scene);
        mainStage.setTitle("Generate");
        mainStage.show();
    }

    @FXML
    void toAddWindow(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("AddWindow.fxml"));
        fxmlLoader.setController(addModule);
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);
        mainStage.setScene(scene);
        mainStage.setTitle("Add");
        mainStage.show();
    }


    @FXML
    void toSearchWindow(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("SearchWindow.fxml"));
        fxmlLoader.setController(searchGUI);
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);
        mainStage.setScene(scene);
        mainStage.setTitle("Search");
        mainStage.show();
    }

    public Stage getMainStage()
    {
        return mainStage;
    }

    public UpdateGUI getUpdateGUI() {
        return updateGUI;
    }

    public SearchGUI getSearchGUI() {
        return searchGUI;
    }
}
