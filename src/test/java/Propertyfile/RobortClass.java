package Propertyfile;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.testng.annotations.Test;

public class RobortClass {

	@Test
	public void robort() throws AWTException {
		 
		Robot rb = new Robot();
			rb.keyPress(KeyEvent.VK_ENTER);
			rb.keyRelease(KeyEvent.VK_ENTER);
	}
}
