package Utils;

import org.apache.log4j.*;

public class Log {

    public static Logger log=Logger.getLogger(Log.class.getName());

    //when the test starts, I should print the logs
    //when the test starts, I should print the logs
    //If I want to print any message in between, I should print the logs

    public static void startTestCase(String testCaseName){
        log.info("******************************");
        log.info("******************************");
        log.info("************"+testCaseName+"**************");
        //when the test starts, I should print the logs
    }

    public static void endTestCase(String testCaseName){
        log.info("######################################");
        log.info("######################################");
        log.info("##############"+testCaseName+"########################");
        //when the test starts, I should print the logs
    }

    public static void info(String message){
        log.info(message);
        //If I want to print any message in between, I should print the logs
    }

    public static void warning(String warning){
        log.info(warning);
        //If I want to print any message in between, I should print the logs
    }
}

    //================================ MAVEN LIFECYCLE ==============================================

    //MAVEN LIFE CYCLE: This consist of several phase
    //clean: Removes all the files generated by the previous build
    //validate (mostly used by developers): Checks the project is correct and the necessary information is available
    //compile: compile source of the project
    //test: it runs the tests for the project
    //package: it packages the compiled code into a distributable format, such as JAR or WAR files
    //verify: it runs and checks on results of integration tests to ensure quality criteria is met
    //install: it installs the packages into local repository
    //site (mostly used by developers): generates documentation for the project
    //deploy: it copies the final package to remote repository for sharing with other developers or projects