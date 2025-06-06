package frameworkIntro;

public class whyFramework {

	/*
	 * What is automation framework
	 * 	organizing  files used in automation testing in a structured manner, files like tc, pom, utility files, testData files, xml files,etc
	 * 
	 * why framework:
	 * 1->easy maintenance-> modify and add new tc to existing framework, group related files in packages like in testData package only contains test data, ss folder contains only ss, tx files contains only tc
	 * 2->readability and re usability->others should be able to read and understand the framework, avoid duplication and reuse for other projects[eg: utility, data providers can be used for other tc]
	 * 
	 * different types of frameworks:
	 * 1->built in framework
	 * eg:testNG, cucumber, jUnit, robot, etc
	 * 
	 * 2->customized framework[built in + additional features= customized framework]
	 * eg:dataDriven, keyWord driven, hybrid driven, etc
	 * 
	 * 
	 * ##different stages/phases in automation testing:
	 * 
	 * 1->analysing the application under test
	 * 		-->no of pages, 
	 * 		-->elements in each page[how to handle each element
	 * 		--> what to automate/ what we cant[just by seeing the application features and functionality]
	 * 		
	 * 
	 * 2->choose tc for automation[100 tc total then around 10 tc manually , rest we can automate, how to choose:]
	 * 		-->initial 3-4 build we have to do manual tc till the build is stable
	 * 		-->colours of page, font size of page, captcha, compare the images--> manually we have to perform, before starting automation, manual tc should be performed]
	 * 		-->categorize tc based on priority
	 * 
	 * 
	 		types of tc:[first 3-p1,p2,p3 we must automate] p4-> if time permits we can automate, else manual testing for these
	 		1-sanity-basic functionality tc--p1 priority[less is more]--> checks the functionality->sanity tc
	 		2-data driven tc/re-test for different data set--p2
	 		3-regression tc- retest the changed tc and the impacted tc--p3
	 		4-any other tc which are remaining--p4
	 
	 *3->Design and development of framework
	 *		design->folder structure[by senior people 5+yoe]
	 *		development->creation of utility files, testCases
	 *
	 design--
	 blueprint of folder structure--creating of folder structure
	 
	 development--	
	 [adding new utility file, implementing new tc, creating pom,etc]
	 utility-excel utils, extent report utils,etc
	 --taken help for seniors for designing and 
	 for development:
	 --say i have done some contribution towards the framework like
	 --designed pom, updated tc in regression test suite, added new tc,created utility files[utility=xl data, extent report, dataProviders]
	 
	 *4-Execution
	 	1-local[within eclipse]
	 	2-remote[push code in remote repository- and execute tc remotely using jenkins]
	 	3-selenium grid
	 	
	 *5-Maintenance
	 	every day we push the changes to remote repository
	 	
	 	
	 	 other folders include :
	 1-logs-- to store detailed info about issues, faliures, execution flow, etc
	 2-reports--for reporting--eg: extent reports,allure reports, cucumber reports, etc
	 3-screenshots--to capture image in case of faliures
	 4-testData-- to store the  excel file for data driven testing
	 
	 various roles and different roles have doffernt eccesses like reviewer, analyst, 
	 
	 -->automate front end pages
	 
	 end-to-end tc: combining multiple tc to test the overall functionality
	 
	 
	 structure of maven project framework:
	 1->development:
	 	pom
	 	testCases
	 	utility files
	 	testData
	 	resources
	 2->execution
	 	testng.xml
	 	pom.xml
	 	reports
	 	logs
	 3->ci/cd
	 	git
	 	gitHub
	 	jenkins
	 	
	 -->all tc inside src/test/java
	 -->all resources[log4j, properties],utility[excel,extent report,data provider] and testData[excel files]  inside src/resource/java
	 
	 
	 -->for folder structure info refer selenium_framework project
	 
	 
	 
	 ##logging:: -->log4j2 config file [specify appenders and loggers]
	 //create log file along with timeStamp to know which to refer and when its created
	 record all events/actions in the form of text file
	 
	 Two types of log files:
		1->application logs, 	2->automation logs
	 advantages of log file:
	 	--log files will be used to track user actions[if any tc got failed, info will be available in log files, as some defects are not reproducible in dev environment]
	 
	 	different log levels--all < trace < debug < info < warn < error < fatal < off
	 	
	 	appenders-->where we want to generate the logs[console/files]-->file is preferable
	 	loggers-->what log levels we want
	 	
	 	
	 	
	 ##	config.properties-->common hardcoded values are placed in this properties files and passed to all the tc
	 		common variables like url, username, passwrod
	 */
	
}
