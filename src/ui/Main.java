package ui;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application{

    private MainControllerGUI mainControllerGUI;

    @FXML
    private Pane mainPane = new Pane();


    public Main() {
        mainControllerGUI = new MainControllerGUI();
    }

    public static void main(String [] args) {
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        // TODO Auto-generated method stub
        /**
         FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("MainWindow.fxml"));
         mainControllerGUI = new MainControllerGUI();
         fxmlLoader.setController(mainControllerGUI);
         Parent root = fxmlLoader.load();
         Scene scene = new Scene(root);


         primaryStage.setScene(scene);
         primaryStage.setTitle("Main");
         //primaryStage.show();

         */
        mainControllerGUI.startMain(mainPane);
        //classroomgui.loadPane(mainPane);
    }

}
