package ui;

import javafx.fxml.FXML;
import javafx.scene.control.Menu;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class GUIController {
    //Attributes

    private AddGUI addModule;

    public GenerateGUI generateGUI;

    public SearchGUI searchGUI;

    public UpdateGUI updateGUI;

    public String userLoggedIn;


    @FXML
    private Menu toGenerateWindow;

    @FXML
    private Menu toAddWindow;

    @FXML
    private Menu toSearchWindow;

    @FXML
    private Pane mainPane;

    private Stage mainStage;

    public GUIController()
    {

    }
}
