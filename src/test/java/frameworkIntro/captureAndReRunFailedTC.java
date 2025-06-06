package frameworkIntro;

public class captureAndReRunFailedTC {

	/*
	 * in 1st round we executed all tc, some got failed
	 * in 2nd round we want to run just failed tc
	 * 
	 * failed tc in previous round automatically captured in xml file[testng-filed.xml]->test-output
	 * 
	 * 
	 * so just execute this xml file not the mail master suite
	 * 
	 * this failed entry will be present even if the tc is corrected and passed and only be refreshed when we have  a new failure
	 */
}
