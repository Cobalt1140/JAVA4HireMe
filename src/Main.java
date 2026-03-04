import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
 
public class Main extends Application {
    String cssLayout = "-fx-border-color: beige;\n" +
                   "-fx-border-width: 5;\n";
    @Override
    public void start(Stage primaryStage) {
        
        VBox threePartMainBox = new VBox();

        
        HBox profilesPresentationHBox = new HBox();

        VBox profile1VBox = new VBox();
        profile1VBox.setStyle(cssLayout);
        Pane pfp1 = new Pane();
        pfp1.setStyle("-fx-background-color: blue;");
        pfp1.setPrefSize(200,200);
        profilesPresentationHBox.getChildren().add(profile1VBox);
        profile1VBox.getChildren().add(pfp1);
        Button recruitProfile1Btn = new Button("Retenir Alice");
        profile1VBox.getChildren().add(recruitProfile1Btn);

        VBox profile2VBox = new VBox();
        profile2VBox.setStyle(cssLayout);
        Pane pfp2 = new Pane();
        pfp2.setStyle("-fx-background-color: red;");
        pfp2.setPrefSize(200,200);
        profile2VBox.getChildren().add(pfp2);
        Button recruitProfile2Btn = new Button("Retenir Bob");
        profile2VBox.getChildren().add(recruitProfile2Btn);

        profilesPresentationHBox.getChildren().add(profile2VBox);

        ToggleGroup radioButtons = new ToggleGroup();
        RadioButton randomBtn = new RadioButton("Random");
        RadioButton localScoreBtn = new RadioButton("Local Score(+)");
        RadioButton skillScoreBtn = new RadioButton("Skill Score(-)");
        RadioButton anyBtn = new RadioButton("Any");
        Label workingRateLbl = new Label("Working Rate: xyz/s");
        VBox settingsVBox = new VBox(randomBtn,localScoreBtn,skillScoreBtn,anyBtn, workingRateLbl);
        profilesPresentationHBox.getChildren().add(settingsVBox);
        profilesPresentationHBox.setAlignment(Pos.CENTER);
        
        randomBtn.setToggleGroup(radioButtons);
        localScoreBtn.setToggleGroup(radioButtons);
        skillScoreBtn.setToggleGroup(radioButtons);
        anyBtn.setToggleGroup(radioButtons);


        VBox scoringVBox = new VBox();
        ScrollPane scrollPane = new ScrollPane();
        VBox resultHistoryVBox = new VBox();

        Pane result1ColorPane = new Pane();
        result1ColorPane.setStyle("-fx-background-color: blue;");
        result1ColorPane.setPrefSize(20,20);
        Label result1Label = new Label("Alice vs Bob:+32");
        HBox result1HBox = new HBox(result1ColorPane,result1Label);
        resultHistoryVBox.getChildren().add(result1HBox);

        Pane result2ColorPane = new Pane();
        result2ColorPane.setStyle("-fx-background-color: red;");
        result2ColorPane.setPrefSize(20,20);
        Label result2Label = new Label("Cesar vs Dave: +7");
        HBox result2HBox = new HBox(result2ColorPane,result2Label);
        resultHistoryVBox.getChildren().add(result2HBox);

        scrollPane.setContent(resultHistoryVBox);
        scoringVBox.getChildren().add(scrollPane);
        scoringVBox.setStyle(cssLayout);

        HBox submissionHBox = new HBox();
        Label currentScoreLabel = new Label("Current Score:");
        Label bonusScoreLabel = new Label("Bonus Score: ");
        Button submitSessionBtn = new Button("Submit Session");
        submissionHBox.getChildren().add(currentScoreLabel);
        submissionHBox.getChildren().add(bonusScoreLabel);
        submissionHBox.getChildren().add(submitSessionBtn);


        threePartMainBox.getChildren().add(profilesPresentationHBox);
        threePartMainBox.getChildren().add(scoringVBox);
        threePartMainBox.getChildren().add(submissionHBox);
        
        threePartMainBox.setAlignment(Pos.CENTER);
        

        Scene scene = new Scene(threePartMainBox, 800, 800);

        primaryStage.setTitle("HELB Hire Me");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }

}