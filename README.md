# realtor-testing
UI Automation Testing Using Java for realtor.com.

Selenium-cucumber is a behavior driven development (BDD) approach to write automation test script to test Web.
It is cross-platform and open source.

### Technology:
 * Selenium
 * Cucumber
 * Maven
  
### Highlights:
 * Page object pattern
 * Mavenized
 * Behaviour driven development


### Project Framework:
java/test/resources: All the feature files containing the scenarios are added in the resource package.
java/test/page: Page Object classes corresponding to each page is added inside the page package.
java/test/steps: All the classes which contains the steps tagged to those defines in he feature files are added inside this package.


Writing a test
--------------

The cucumber features goes in the `resource` library and should have the ".feature" extension.

Running test
--------------

Go to your project directory from terminal and hit following commands
* `mvn test (defualt will run on local firefox browser)`
* `mvn test "-Dbrowser=chrome" (to use any other browser)`

