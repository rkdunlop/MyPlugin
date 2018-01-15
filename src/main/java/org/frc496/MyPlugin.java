package org.frc496;

import java.util.List;

import org.frc496.widget.MyPlugin.MyWidget;

import com.google.common.collect.ImmutableList;

import edu.wpi.first.shuffleboard.api.plugin.Description;
import edu.wpi.first.shuffleboard.api.plugin.Plugin;
import edu.wpi.first.shuffleboard.api.widget.ComponentType;
import edu.wpi.first.shuffleboard.api.widget.WidgetType;


@Description(group = "org.frc496", name = "MyPlugin", version = "1.0.0", summary = "MyFirst Plugin")


public class MyPlugin extends Plugin {

	
	@Override
	public List<ComponentType> getComponents() {
		return ImmutableList.of(WidgetType.forAnnotatedWidget(MyWidget.class));

	}

}
