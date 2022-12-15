function fnScreenshot() {
	karate.log('After Scenario called in Capture Screenshot function ');
	var info = karate.info;
	karate.log('---------Karate Info Message-----------'+karate.info)
		if (info.errorMessage) {
		karate.log('-------Error Message in Screenshot function------'+info.errorMessage)	
		var bytes = driver.screenshot();
		var fileName = info.scenarioName + '.jpg';
		var file = karate.write(bytes, fileName);
		utils.myImage(fileName)
	}
}