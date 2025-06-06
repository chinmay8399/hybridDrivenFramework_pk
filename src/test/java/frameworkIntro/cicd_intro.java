package frameworkIntro;

public class cicd_intro {

	/*
	 * we can run the test through eclipse, command prompt, xml file, pom.xml file, c/cd jenkins
	 * 
	 * along with dependencies,
	 * in pom.xml we add plugins to compile and run our project
	 * 
	 * plugins:
	 * 1->maven compiler plugins[for compiling]
	 * 2->maven sureFire plugin[for running]
	 * 
	 * github jenkins architecture and process
	 * -->3 teams involved[qa, dev team and devops team]
	 * 
	 * repository[maintain all files in 1 location->git is a software to create local repository
	 * every individual has to commit their code daily, new changes, logic updates, etc should reflect daily
	 * they push their code from local repository[git] to a remote repository[git hub] repository, as all devs are working on different features but of the same project
	 * 
	 * [eclipse]commit-->[git]--->push[git hub]
	 * 
	 
	 * local repository- git is separate for individuals, but git hub is common for entire team
	 * 
	 * maven->create build, jenkins->run automation
	 * devops guys will take latest git hub build from dev and latest automation script from qa, and the automation scripts are executed in jenkins once automation is success[sanity testing in night job], build  will be certified by devops team
	 * 
	 * only after initial 2-3 build we will start to automate
	 * 
	 * qa scopr[commit(git)-->push(git hub)]
	 * -->today completed 5 tc, commit to git and pushed 5 tc to gitHub--->jenkins will run automation for 5 tc
	 * -->next day 10 tc, comit to git and push to gitHub 10 tc-->jenkins will now automate 10+5=15 tc
	 * 
	 * 
	 * flow of files::
	 * 
	 * working  directory[eclipse]----->staging area------------------>git repository----------------->git hub repository
	 * untracked files-<add command>----tracked files-<commit command>-committed files-<push command>-remote files
	 * 
	 * workFlow:
	 * 1->create local repository(one time for one project)===git init
	 * 
	 * 2->add files and folders to the staging==git add -A[all]; git add filename; git add foldername
	 */
	
}
