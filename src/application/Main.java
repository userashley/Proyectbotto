package application;
	
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Slider;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Label botton = new Label("Button: ");
	        Button button = new Button("Button");
	        Label check = new Label("CheckBox:");
	        CheckBox checkBox = new CheckBox("CheckBox");
	        Label hyper = new Label("Hyperlink:");
	        Hyperlink hyperlink = new Hyperlink("Hiperlink");
	        Label Toggle = new Label("ToggleButton:");
	        ToggleButton toggleButton = new ToggleButton("ToggleButton");
	        Label Radio = new Label("RadioButton:");
	        RadioButton radioButton = new RadioButton("RadioButton");
	        Label label = new Label("Label");
	        Label label1 = new Label("Label :");
	        Label Text = new Label("TextField:");
	        TextField textField = new TextField("Some text...");
	        Label Password = new Label("PasswordField:");
	        PasswordField passwordField = new PasswordField();
	        Label text = new Label("TextArea:");
	        TextArea textArea = new TextArea("This is very long text that will wrap to\nseveral lines.");
	        Label progress = new Label("ProgressIndicator:");
	        ProgressIndicator ProgressIndicator = new ProgressIndicator(0.49);
	        Label Progress = new Label("ProgressBar:");
	        ProgressBar progressBar = new ProgressBar(0.67);
	        Label Slider = new Label("ProgressBar:");
	        Slider slider = new Slider(0, 100, 50);

	        // Agrupar RadioButtons
	        ToggleGroup radioButtonGroup = new ToggleGroup();
	        radioButton.setToggleGroup(radioButtonGroup);

	        // VBox para organizar los elementos
	        GridPane gridPane = new GridPane();
	        gridPane.setHgap(10);
	        gridPane.setVgap(10);
	        gridPane.setAlignment(Pos.TOP_LEFT);

	        // Add Controls to GridPane
	        gridPane.add(botton, 0, 0);
	        gridPane.add(button, 1, 0);
	        gridPane.add(check, 0, 1);
	        gridPane.add(checkBox, 1, 1);
	        gridPane.add(hyper, 0, 2);
	        gridPane.add(hyperlink, 1, 2);
	        gridPane.add(Toggle, 0, 3);
	        gridPane.add(toggleButton, 1, 3);
	        gridPane.add(Radio, 0, 4);
	        gridPane.add(radioButton, 1, 4);
	        gridPane.add(label1, 0, 5);
	        gridPane.add(label, 1, 5);
	        gridPane.add(Text, 0, 6);
	        gridPane.add(textField, 1, 6);
	        gridPane.add(Password, 0, 7);
	        gridPane.add(passwordField, 1, 7);
	        gridPane.add(text, 0, 8);
	        gridPane.add(textArea, 1, 8);
	        gridPane.add(progress, 0, 9);
	        gridPane.add(ProgressIndicator, 1, 9);
	        gridPane.add(Progress, 0, 10);
	        gridPane.add(progressBar, 1, 10);
	        gridPane.add(Slider, 0, 11);
	        gridPane.add(slider, 1, 11);
	        
	        
	        
			
			Scene scene = new Scene(gridPane,600,600);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
