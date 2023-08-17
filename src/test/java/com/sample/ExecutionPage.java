package com.sample;

import org.junit.Test;

public class ExecutionPage extends EquipmentExe{
	
	@Test
	public void testBobCat () {
		popUpExe();
		equipmentExe();
		skidsteerloaderExe();
		SkidSteerLoaderFeatures.skidSteerLoaderfeatures_locators();
		equipmentExe();
		compactTrackLoadersExe();
		CompactTrackLoadersFeatures.compactTractLoaderfeaturesLocators();
		equipmentExe();
		backhoeLoadersExe();
		BackHoeLoadersFeatures.BackHoeLoadersfeaturesLocators();
	
	}

}
