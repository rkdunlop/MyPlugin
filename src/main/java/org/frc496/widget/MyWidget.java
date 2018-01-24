package org.frc496.widget;


import edu.wpi.first.shuffleboard.api.widget.Description;
import edu.wpi.first.shuffleboard.api.widget.ParametrizedController;
import edu.wpi.first.shuffleboard.api.widget.SimpleAnnotatedWidget;
import javafx.fxml.FXML;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;

@Description(name = "MyWidget", dataTypes = String.class)
@ParametrizedController("MyWidget.fxml")

public class MyWidget extends SimpleAnnotatedWidget<Object> {

  private String gameData;
  @FXML
  private Pane root;
  
  @FXML
  private Rectangle switchLeft;
  private Rectangle switchRight;

  @FXML
  private void initialize() {
	    dataProperty().addListener((__, prev, cur) -> {
	        if (cur != null) {
	        	if(cur instanceof String) {
	        		gameData = cur.toString();
	        		
	        		if(gameData.charAt(0)=='L') {
	        			switchLeft.setFill(Color.RED);
	        			switchRight.setFill(Color.BLUE);
	        		}
	        	}
	        }
	      });
  }

  @Override
  public Pane getView() {

    return root;
  }

}
