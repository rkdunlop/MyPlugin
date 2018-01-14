package org.frc496.widget.MyPlugin;

import edu.wpi.first.shuffleboard.api.widget.Description;
import edu.wpi.first.shuffleboard.api.widget.ParametrizedController;
import edu.wpi.first.shuffleboard.api.widget.SimpleAnnotatedWidget;
import javafx.fxml.FXML;
import javafx.scene.layout.Pane;

@Description(name = "MyWidget", dataTypes = String.class)
@ParametrizedController("MyWidget.fxml")

public class MyWidget extends SimpleAnnotatedWidget<Object> {

	@FXML
	private Pane root;

	@FXML
	private void initialize() {
		
	}

	@Override
	public Pane getView() {

		return root;
	}

}
