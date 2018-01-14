package org.frc496.widget;

import java.util.List;

import edu.wpi.first.shuffleboard.api.data.IncompatibleSourceException;
import edu.wpi.first.shuffleboard.api.sources.DataSource;
import edu.wpi.first.shuffleboard.api.widget.AnnotatedWidget;
import edu.wpi.first.shuffleboard.api.widget.Description;
import edu.wpi.first.shuffleboard.api.widget.ParametrizedController;
import javafx.beans.property.Property;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.layout.Pane;

@Description(name = "MyWidget", dataTypes = String.class)
@ParametrizedController("MyWidget.fxml")

public class MyWidget implements AnnotatedWidget {

	@FXML
	private Pane root;

	@Override
	public Pane getView() {
		
		return root;
	}

	@Override
	public List<? extends Property<?>> getProperties() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Property<String> titleProperty() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addSource(DataSource source) throws IncompatibleSourceException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ObservableList<DataSource> getSources() {
		// TODO Auto-generated method stub
		return null;
	}

}
