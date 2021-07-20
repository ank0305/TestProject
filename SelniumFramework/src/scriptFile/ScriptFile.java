package scriptFile;

import org.testng.annotations.Test;

import utilities.FunctionalComponents;

public class ScriptFile extends FunctionalComponents {
	
	
	@Test
	public void loginNew() {
		
		FunctionalComponents launch = new FunctionalComponents();
		FunctionalComponents close = new FunctionalComponents();
		
		launch.launchApplication();
		//close.closeApplication();
		
		
		
		
	}

}
