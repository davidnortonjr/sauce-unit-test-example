This is an example integrating Sauce automated browser testing with the Jasmine testing framework for JavaScript.

    ./gradlew clean jettyRun

Then visit the following URL in your browser:

    http://localhost:8080/SpecRunner.html

Great, the Jasmine tests pass. Hit Cntl-C to get out of Gradle.

To run tests using local Firefox:

    ./gradlew clean test

To run tests using Sauce via Sauce Connect:

	./gradlew clean test -Dgeb.env=windows-ie-8 -Dsauce.username=your_username -Dsauce.apiKey=aaaaaaaa-bbbb-cccc-dddd-ffffffffffff

Surprisingly, the tests fail on IE. Let's see what's going on...

	open build/reports/gebTest/geb/JasmineSpec/*.png

This is a little overkill. We don't need Geb to run Selenium tests... but it sure is easy. Also, we probably don't need to build a full WAR and start up Jetty... but it doesn't hurt for the sake of example.

Thanks to https://github.com/geb/geb-example-gradle