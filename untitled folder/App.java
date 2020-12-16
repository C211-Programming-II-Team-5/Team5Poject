/*
*Programmer: Joy Love
*Team Project
*C211 Problem Solving and Programming II: JAVA Programming
*Fall 2020
*Due Date: 12/14/2020
*Date Completed: 12/15/2020
*
*/

package HolidayMaze;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;
    @Override
    
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("mainMenu"), 950, 600);
        stage.setScene(scene);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch(args);
    }

}