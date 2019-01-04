package pom;

import lombok.Getter;
import util.ActionUtils;

import static util.ActionUtils.*;

import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
@Getter
public enum IrisCapturePage {
	LEFTEYE("#leftEye","")
	,RIGHTEYE("#rightEye",""),
	SCAN("#scan",""),
	NEXT("#next",""),
	PREVIOUS("#previous","");
	
private IrisCapturePage(String locator, String value) {
		this.locator = locator;
		this.value = value;
	}
private String locator;
private String value;

public static void captureIRIS() {
	clickOn(LEFTEYE.getLocator());
	clickOn(SCAN.getLocator());
	clickOn(ScanPage.SCANDOCUMENT.getLocator());
	Button okButton = ActionUtils.robot.lookup(ButtonType.OK.getText()).query();
	clickOn(okButton);
	clickOn(RIGHTEYE.getLocator());
	clickOn(SCAN.getLocator());
	clickOn(ScanPage.SCANDOCUMENT.getLocator());
	 okButton = ActionUtils.robot.lookup(ButtonType.OK.getText()).query();
	clickOn(okButton);
	
	for(int i=0;i<3;i++) {
		clickOn(RIGHTEYE.getLocator());
		clickOn(SCAN.getLocator());
		clickOn(ScanPage.SCANDOCUMENT.getLocator());
		 okButton = ActionUtils.robot.lookup(ButtonType.OK.getText()).query();
		clickOn(okButton);
	}
	clickOn(NEXT.getLocator());
}
}
