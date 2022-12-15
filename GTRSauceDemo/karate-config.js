function fn() {
	var env = karate.env; // get system property 'karate.env'
	var config = {
		env: env,
		
	};	
		karate.configure('retry', { count: 10, interval: 5000 });
		config.URL = 'https://www.saucedemo.com/';
		
		return config;
}