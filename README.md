

Page Object model Test automation framework using Selenium with Java, TestNG and Maven-

Dependency :

    Java as a Programing  language.
    Maven as a build management tool.

Step 1: Download Java (JDK -1.8)

    Java Log in with your Oracale account, if not create an account to download)

    Mac - 

    https://download.oracle.com/otn/java/jdk/8u333-b02/2dee051a5d0647d5be72a7c0abff270e/jdk-8u333-macosx-x64.dmg

    Windows - 

    https://download.oracle.com/otn/java/jdk/8u333-b02/2dee051a5d0647d5be72a7c0abff270e/jdk-8u333-windows-x64.exe

    Install Java on your computer

Next Step 2: Download Latest Maven (3.8.6)

    Mac - https://dlcdn.apache.org/maven/maven-3/3.8.6/binaries/apache-maven-3.8.6-bin.tar.gz

    Windows- https://dlcdn.apache.org/maven/maven-3/3.8.6/binaries/apache-maven-3.8.6-bin.zip

    Mac - Copy the download Apache Maven folder and move it to Application Folder 
    Windown - Unzip the file > Move it to Application Folder 


Step 3:  Set up Path - (Mac users only)

Open Terminal 

Open .bash_profile in vi editor - vi .bash_profile

Insert the following intou your .bash_profile : 
 
    export M2_HOME=/Applications/apache-maven-3.8.6
    export PATH=$PATH:$M2_HOME/bin
    export JAVA_HOME=$(/usr/libexec/java_home)
    export PATH=${JAVA_HOME}/BIN:$PATH

Now Save the file and exit

How to check version on your terminal - 

    Open Terminal - JAVA -version 
    Open Terminal - mvn -v

Make sure you it shows your Java and Maven  


Libraries used :

    Selenium WebDriver V:- 4.3.0
    TestNG V:- 6.11
    WebdriverManager  V:- 5.2.1

Steps to clone execute the tests :

    git clone https://github.com/rai239298/TheHudl.git
    cd Hudl
    mvn clean test