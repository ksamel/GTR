package utility;

import java.io.File;
import java.util.Calendar;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.epam.reportportal.service.ReportPortal;

public class Utils {
private static final Logger log = LoggerFactory.getLogger(Utils.class);

	public static void myImage(String fileName) {
		File file = new File(System.getProperty("user.dir") + "/target/" + fileName);
		boolean emitLogResult = ReportPortal.emitLog("attached screenshot - ReportPortal.emitLog", "INFO",
				Calendar.getInstance().getTime(), file);
		log.info("screenshot via ReportPortal.emitLog: {}", emitLogResult);

	}
}