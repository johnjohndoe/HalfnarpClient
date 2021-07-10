[![Build Status](https://travis-ci.com/johnjohndoe/HalfnarpClient.svg?branch=master)](https://travis-ci.com/johnjohndoe/HalfnarpClient) [![Apache License](http://img.shields.io/badge/license-Apache%20License%202.0-lightgrey.svg)](http://choosealicense.com/licenses/apache-2.0/) [![Known Vulnerabilities](https://snyk.io/test/github/johnjohndoe/halfnarpclient/badge.svg?targetFile=build.gradle)](https://snyk.io/test/github/johnjohndoe/halfnarpclient?targetFile=build.gradle)

# Halfnarp Client

A Java library containing a parser and models for the Halfnarp API available here:

* http://halfnarp.events.ccc.de/-/talkpreferences

The source code of the API can be found here:

* https://github.com/tomster/halfnarp


## Demo application

Please note there is a Android demo application for this library available:

* https://github.com/johnjohndoe/HalfnarpClientDemo


## Usage

The library can be accessed via the `ApiModule` class.

```java
TalkPreferencesService service = ApiModule.getTalkPreferencesService(final String baseUrl);

Call<List<GetTalksResponse>> getTalksCall = service.getTalks();
// Execute getTalks call to send a request to the webserver.

Call<CreateTalkPreferencesSuccessResponse> createTalkPreferencesSuccessResponseCall =
                mService.createTalkPreferences(talkIds);
// Execute createTalkPreferencesSuccessResponse call to send a request to the webserver.

Call<UpdateTalkPreferencesSuccessResponse> updateTalkPreferencesSuccessResponseCall =
                mService.updateTalkPreferences(uniqueId, talkIds);
// Execute updateTalkPreferencesSuccessResponse call to send a request to the webserver.

Call<GetTalkPreferencesSuccessResponse> getTalkPreferencesSuccessResponseCall =
                mService.getTalkPreferences(uniqueId);
// Execute getTalkPreferencesSuccessResponse call to send a request to the webserver.
```

Make sure to define the following `packagingOptions` in the  `build.gradle` of you app.

```groovy
packagingOptions {
    pickFirst "META-INF/LICENSE"
    pickFirst "META-INF/NOTICE"
}
```


### Gradle build

To deploy the library to your local Maven repository run the following task:

```bash
$ ./gradlew publishToMavenLocal
```

Then, to use the library in your project add the following to
your top level `build.gradle`:

```
allprojects {
    repositories {
        mavenLocal()
    }
}
```

and to your application module `build.gradle`:


```groovy
dependencies {
    implementation "info.metadude.java.library.halfnarp:halfnarp-client:$version"
}
```

## Tests

Run the following command to execute all tests:

```groovy
$ ./gradlew clean test
```

## Which applications are using this library?

* Schedule Conflict Resolvr - [Sources][scr-sources], [PlayStore][scr-playstore]


## Author

* [Tobias Preuss][tobias-preuss]

## License

    Copyright 2015 - 2021 Tobias Preuss

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.


[tobias-preuss]: https://github.com/johnjohndoe
[scr-sources]: https://github.com/ligi/SCR
[scr-playstore]: https://play.google.com/store/apps/details?id=org.ligi.scr


