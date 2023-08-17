package com.sample;

import org.openqa.selenium.WebElement;

public class EquipmentExe extends EquipmentLocators{

public static void popUpExe() {
		BaseClass.click(EquipmentLocators.popUpLocator());
	}

public static void equipmentExe() {
	BaseClass.click(EquipmentLocators.equipmentLocator());
}

public static void skidsteerloaderExe() {
	BaseClass.click(EquipmentLocators.skidsteerloadersLocator());	
}

public static void compactTrackLoadersExe() {
	BaseClass.click(EquipmentLocators.compactTrackLoadersLocators());
}

public static void backhoeLoadersExe() {
	BaseClass.click(EquipmentLocators.backhoeLoadersLocators());
}

}
