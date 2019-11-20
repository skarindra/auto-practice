# automation-practice

#Pre-requisite Tools:
-    Apache Maven
-    JDK 8

#Project Structure
-	pom.xml
-	src/test/java/com/hellofresh/challenge/pages : list of all UI elements used for testing and all actions to be done.
-	src/test/java/com/hellofresh/challenge/stepdefinitions : consist of classes that can be used to map the story (scenario) in feature file with actions.
-	src/test/java/com/hellofresh/challenge/TestsRunner.java : Test runner
-	src/test/resources/chromedriver
-	src/test/resources/features : cucumber feature files

#Note:
-    I used Serenity BDD (Thucydides) combine with Cucumber to implement PageObjects and it will create good graphical report. You can find anything about Serenity here : http://www.thucydides.info/#/
-    As for the programming language, I used Java and Apache Maven as build tool.
-    The test will be run in Chrome browser. Please check the pom.xml : <webdriver.driver>chrome</webdriver.driver> <webdriver.chrome.driver>${chromedriver}</webdriver.chrome.driver>
-    Chromedriver is located inside "src/test/resources" directory.
-    To run the test : point to the project directory (where the pom.xml exist) - type "mvn clean install" and enter
-    To check the report : /target/site/serenity/index.html
