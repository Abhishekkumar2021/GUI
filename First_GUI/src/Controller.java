import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.shape.Circle;

public class Controller {
    @FXML
    private Circle circle;
    private double x;
    private double y;
    
    public void up(ActionEvent event) {
        circle.setCenterY(y -= 10);
        System.out.println("Up");
    }

    public void down(ActionEvent event) {
        circle.setCenterY(y += 10);
        System.out.println("Down");
    }

    public void left(ActionEvent event) {
        circle.setCenterX(x -= 10);
        System.out.println("Left");
    }

    public void right(ActionEvent event) {
        circle.setCenterX(x += 10);
        System.out.println("Right");
    }

}
