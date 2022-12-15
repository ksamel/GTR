# GTR

This repository contains two folder:

* GTRSauceDemo - This folder contains plain vanilla code using Karate UI . Once we execute the code, the target folder gets created where in we can see the reports here- target>karate-reports>karate-summary.html

* GTRSauceDemoRP -This folder contains Karate UI integration with Report Portal. Report Portal is an open source reporting Dashboad. It has a HookFactory.java file which contains the details regarding report portal customised implementations and logging. Also there is a report reportportal.properties file where we need to provide Report Portal domain and other configuration details which has been explained in the file. We need to setup Report Portal instance at our premise to get started with it's integration. Please refer the  installation guide to get started https://reportportal.io/installation
    * Command to execute the runner file from mvn : mvn test -Dkarate.options="classpath:scenarios/saucelabs.feature" -Dtest=TestRunner

- Important Links for reference:
    - Karate UI : https://karatelabs.github.io/karate/karate-core/
    - Report Portal : https://reportportal.io/docs

Support team:
You can contact us at ksamel@webuy.com for any queries. 
