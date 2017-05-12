package org.cytoscape.netsearchtest.internal.task;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import org.cytoscape.work.Tunable;
import org.cytoscape.work.swing.util.UserAction;
import org.cytoscape.work.util.BoundedFloat;
import org.cytoscape.work.util.ListMultipleSelection;
import org.cytoscape.work.util.ListSingleSelection;

/**
 * Testing the use of Tunables for the Network Search's extra options.
 */
public class TunableOptionsTaskFactory extends AbstractNetSearchTestTaskFactory implements ActionListener {

	@Tunable(description = "Test String:")
	public String testString;
	
	@Tunable(description = "Test Integer:")
	public int testInt = 100;
	
	@Tunable(description = "Test Float:")
	public float testFloat = 10.5f;
	
	@Tunable(description = "Test Boolean:")
	public boolean testBoolean = true;
	
	@Tunable(description = "Test Slider:", params = "slider=true")
	public BoundedFloat testBoundedFloat = new BoundedFloat(0.0f, 5.0f, 10.0f, false, false);
	
	@Tunable(description = "Test Combo:")
	public ListSingleSelection<String> testList1 = new ListSingleSelection<>("value 1", "value 2", "value 3");
	
	@Tunable(description = "Test List:")
	public ListMultipleSelection<String> testList2 = new ListMultipleSelection<>("value A", "value B", "value C");
	
	@Tunable(description="Test File:")
	public File file;
	
	@Tunable(description="Test UserAction")
	public UserAction testUserAction = new UserAction(this);
	
	public TunableOptionsTaskFactory() {
		super(
				"netsearchtest.test-a",
				"A. Tunable Options",
				"The seearch options are auto-generated from Tunables"
		);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Test UserAction clicked!");
	}
}
