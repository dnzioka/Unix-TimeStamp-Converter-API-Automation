# Unix-TimeStamp-Converter-API-Automation
A trivial public API for converting unix epoch time to human readable format

## Note
In this project I have covered Rest Assured Automation using TestNG framework, Maven, JSON Simple and Rest Assured Dependencies

## Environment Setup before running the project
#### Below are steps to install Maven on windows OS
* Make sure **JDK** is installed, and **JAVA_HOME** environment variable is configured.
* Download Apache Maven Binary zip archive from this link: https://dlcdn.apache.org/maven/maven-3/3.9.0/binaries/apache-maven-3.9.0-bin.zip
* Unzip it to a folder, for example to C:\Program Files\Maven\apache-maven-3.9.0
* To add **MAVEN_HOME** system variable
  * Press Windows key, type adva and clicks on the View advanced system settings
  * In System Properties dialog, select Advanced tab and clicks on the Environment Variables... button.
  * In “Environment variables” dialog, System variables, click on the New... button and add a **MAVEN_HOME** variable and point it to C:\program files\maven\apache-maven-3.9.0
  * In system variables, find **PATH**, click on the edit.. button. In “Edit environment variable” dialog, click on the New button and add this **%MAVEN_HOME%\bin**
  * Click **OK** button to close all the dialog windows

* To verify whether Maven has been installed properly
  * start a new command prompt
  * type **mvn –version**
  * it will return something like this **Apache Maven 3.9.0 (97c98ec64a1fdfee7767ce5ffb20918da4f719f3........
  * The Apache Maven is now installed successfully on Windows


## How to run the project from Command Line
* Download the project from GitHub - https://github.com/dnzioka/Unix-TimeStamp-Converter-API-Automation.git  and unzip e.g. C:\Users\Administrator\SeleniumTraining\TechnicalAssessment
* Open Command prompt as an Administrator
* Go to the project location by typing e.g., cd C:\Users\Administrator\SeleniumTraining\TechnicalAssessment on Command prompt
* To execute the project, type this command-on-Command prompt: **mvn clean install**

