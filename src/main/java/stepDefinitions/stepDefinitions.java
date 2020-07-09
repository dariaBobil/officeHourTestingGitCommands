package stepDefinitions;

import automationUtility.CommonUtils;
import cucumber.api.java.en.Given;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static automationUtility.CommonUtils.printLogs;

public class stepDefinitions {

    private static Logger LOGGER = LoggerFactory.getLogger(CommonUtils.class);

    @Given("Participants are adding logs")
    public void participantsAreAddingLogs() {

        System.out.println(printLogs("Daria"));
        System.out.println(printLogs("Nurjana"));

        //please add copy of above line with your name below
    }
}
