# Halfnarp Client

A Java library containing a parser and models for the Halfnarp API available here:

* http://halfnarp.events.ccc.de/-/talkpreferences

The source code of the API can be found here:

* https://github.com/tomster/halfnarp



## Usage

The library can be accessed via the `ApiModule` class.

```java
TalkPreferencesService service = ApiModule.getTalkPreferencesService();
service.getTalkPreferencesResponse(new Callback<List<TalkPreferencesResponse>>() {
    // Handle response
});

TalkIds talkIds = // set your TalkIds
service.postTalkPreferences(talkIds,new Callback<PostSuccessResponse>() {
   // Handle post response
});
```

Make sure to define the following `packagingOptions` in the  `build.gradle` of you app.

```groovy
packagingOptions {
    pickFirst 'META-INF/LICENSE'
    pickFirst 'META-INF/NOTICE'
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
        jcenter()
        mavenLocal()
    }
}
```

and to your application module `build.gradle`:


```groovy
dependencies {
    compile 'info.metadude.java.library.halfnarp:halfnarp-client:1.0.0'
}
```



## Author

* [Tobias Preuss][tobias-preuss]

## License

    Copyright 2014 Tobias Preuss

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


