This is an example integrating Sauce automated browser testing with the Jasmine testing framework for JavaScript. It was developed for my article on the Object Partners blog: http://www.objectpartners.com/2013/04/18/multi-browser-javascript-unit-testing-with-sauce/

### Run JavaScript tests in your browser

    ./gradlew clean jettyRun

Then visit the following URL in your browser: [http://localhost:8080/SpecRunner.html](http://localhost:8080/SpecRunner.html)

    

Great, the Jasmine tests pass. Hit Cntl-C to get out of Gradle.

### Run tests against local Firefox

    ./gradlew clean test

### Run tests against Internet Explorer 8 using Sauce and Sauce Connect

	./gradlew clean test -Dgeb.env=windows-ie-8 -Dsauce.username=your_username -Dsauce.apiKey=aaaaaaaa-bbbb-cccc-dddd-ffffffffffff

Surprisingly, the tests fail on IE. Let's see what's going on...

	open build/reports/gebTest/geb/JasmineSpec/*.png

This is a little overkill. We don't need Geb to run Selenium tests... but it sure is easy. Also, we probably don't need to build a full WAR and start up Jetty... but it doesn't hurt for the sake of example.

## Jenkins job

You can try it out in a Jenkins job by getting [Vagrant](http://www.vagrantup.com) and running the following command:

    vagrant up

Then visit [http://localhost:9099](http://localhost:9099).

Again, overkill. But pretty cool.
