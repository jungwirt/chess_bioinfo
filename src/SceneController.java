
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SceneController {

    @FXML
    private TextField txtfield;

    @FXML
    private Button submitBtn;

    @FXML
    private Label display;

    @FXML
    void onSubmitBtnClick(ActionEvent event) {
        display.setText(txtfield.getText());
    }

}
