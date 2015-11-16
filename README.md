This is the mini-sized package to start use Appium with iOS mobile Safari browser.

Pre-requisite:
1. MacOS
2. Java
3. Maven
4. Appium 4.1.13+
5. Xcode 7.0.1+ with "iPhone 6/iOS9.1" Simulator

To run the test, start Appium properly first, then simply go to the project directory, use Terminal to run command:

mvn clean test

It should:
1. Start the mobile simulator
2. Open mobile safari
3. Visit "http://google.com"
4. Verify if the title is "Google"
5. Quit the driver
