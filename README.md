

Page Object model Test automation framework using Selenium with Java, TestNG and Maven-

Dependency :

    Java as a Programing  language.
    Maven as a build management tool.

Step 1: Download Java (JDK -1.8)

    - Java Log in with your Oracale account, if not create an account to download)

    - Download JDK 11 (Choose the file based on your OS)

        - Link : https://www.oracle.com/java/technologies/javase/jdk11-archive-downloads.html

    - Install Java on your computer

Next Step 2: Download Latest Maven (3.8.6)

    Mac - https://dlcdn.apache.org/maven/maven-3/3.8.6/binaries/apache-maven-3.8.6-bin.tar.gz

    Windows- https://dlcdn.apache.org/maven/maven-3/3.8.6/binaries/apache-maven-3.8.6-bin.zip

    Mac - Copy the download Apache Maven folder and move it to Application Folder 
    Windows - Unzip the file > Move it to Application Folder 


Step 3:  Set up Path - (Mac users only) For windows user please read the readme file for Java and Maven to set the path

- Open Terminal 

- Open .bash_profile in vi editor - vi .bash_profile

- Insert the following intou your .bash_profile : (Mac Users only)
 
        export M2_HOME=/Applications/apache-maven-3.8.6
    
        export PATH=$PATH:$M2_HOME/bin
    
        export JAVA_HOME=$(/usr/libexec/java_home)
    
        export PATH=${JAVA_HOME}/BIN:$PATH

- Now Save the file and exit
- On new terminal type: source .bash_profile  (This comand will reload the file on the new terminal)

How to check version on your terminal - (Optional: To ensure Java and Maven are installed)

    Open Terminal - JAVA -version 
    Open Terminal - mvn -v


Libraries used : (Information)

    Selenium WebDriver V:- 4.3.0
    TestNG V:- 6.11
    WebdriverManager  V:- 5.2.1

Steps to clone execute the tests :

    - git clone https://github.com/rai239298/TheHudl.git
    
    Before running*** - Open the Config file and insert the password 
        - Path to the file: https://github.com/rai239298/TheHudl/blob/main/src/main/java/com/qa/huld/config/config.properties 
        - Image of the file where you need to add the password - (https://www.screencast.com/t/tQ6J0eMgHbBI)    
    
    After setting the Password in the config file make sure to save it - Then CD into the Project from your terminal to run
    - cd Hudl
    - mvn clean test
    
    Video Showing test run - https://www.screencast.com/t/1sMv0KHTx
