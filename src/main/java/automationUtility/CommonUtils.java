package automationUtility;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CommonUtils {


    private static Logger LOGGER = LoggerFactory.getLogger(CommonUtils.class);



    public static String printLogs(String name){

        String actName = name + "'s logs";
        LOGGER.info(name + "'s " + " logs");

        return actName;
    }

}
