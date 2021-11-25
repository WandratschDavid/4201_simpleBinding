package viewcontroller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.AutomatedText;

import java.io.IOException;

/**
 * @author David Wandratsch
 * @version 1.0, 25.11.2021, class SimpleBindingC
 * @link https://github.com/WandratschDavid/4201_simpleBinding
 */
public class SimpleBindingC
{
    @FXML
    private Label textLabel;

    @FXML
    private TextField textField;

    private final AutomatedText automatedText = new AutomatedText();

    public static void show(Stage stage)
    {
        try
        {
            FXMLLoader loader = new FXMLLoader(SimpleBindingC.class.getResource("SimpleBindingV.fxml"));
            Parent root = (Parent) loader.load();

            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.setTitle("4201_simpleBinding");
            stage.show();
        }
        catch (IOException ex)
        {
            System.err.printf("Error using %s!", "SimpleBindingV.fxml");
            ex.printStackTrace();
            System.exit(1);
        }
    }

    @FXML
    public void initialize()
    {
        textLabel.textProperty().bind(automatedText.textProperty());
        automatedText.textProperty().bind(textField.textProperty());
        textField.setText("Hello World!");
    }
}