package scenarios;

import java.io.IOException;

import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.epam.reportportal.junit5.ReportPortalExtension;
import com.intuit.karate.junit5.Karate;

import utility.HookFactory;
import utility.Utils;

@ExtendWith(ReportPortalExtension.class)
public class TestRunner {

	private static final Logger LOGGER = LoggerFactory.getLogger(Utils.class);
	
    @Karate.Test
    Karate storeWindowMS() throws IOException, InterruptedException {    	
    	LOGGER.info("+------------------------------------+");
    	LOGGER.info("| Starting Functional Test Execution |");
    	LOGGER.info("+------------------------------------+");    
        System.err.println("----------------Inside SQL--------------");
        return Karate.run().hook((new HookFactory()).create()).relativeTo(getClass());
    }
    
   // mvn test -Dkarate.options="classpath:scenarios/saucelabs.feature" -Dtest=TestRunner
    
    
}
