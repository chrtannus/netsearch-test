package org.cytoscape.netsearchtest.internal.task;

import org.cytoscape.work.Tunable;

/**
 * Testing the use of Tunables for the Network Search's extra options.
 */
public class TunableOptionsTaskFactory extends AbstractNetSearchTestTaskFactory {

	@Tunable(description = "Test String:")
	public String testString;
	
	@Tunable(description = "Test Integer:")
	public int testInt = 100;
	
	@Tunable(description = "Test Float:")
	public float testFloat = 10.5f;
	
	@Tunable(description = "Test Boolean:")
	public boolean testBoolean = true;
	
	public TunableOptionsTaskFactory() {
		super(
				"netsearchtest.test-a",
				"A. Tunable Options",
				"The seearch options are auto-generated from Tunables"
		);
	}
}
