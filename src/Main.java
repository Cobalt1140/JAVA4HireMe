import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
 
public class Main extends Application {
    Label label = new Label("Time: 0 seconds");
    
    @Override
    public void start(Stage primaryStage) {
        VBox vbox = new VBox();
        vbox.getChildren().add(label);
        vbox.setAlignment(Pos.CENTER);
        

        Scene scene = new Scene(vbox, 300, 250);

        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }

}