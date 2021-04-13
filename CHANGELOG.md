# Halfnarp Client changelog

## NEXT

* Not released yet

### Changes

* Use jackson-databind v.2.11.3.
* Use retrofit v.2.6.4.
* Use okhttp v.3.12.13.
* Use assertj-core v.3.19.0.
* Use junit v.4.13.2.
* Fix GET "talkpreferences" test - "speakers" might not be assigned to each talk.

## [v.4.3.0](https://github.com/johnjohndoe/HalfnarpClient/releases/tag/v.4.3.0)

* Published: 2019-11-14

### Changes

* Use okhttp v.3.12.5.
* Use retrofit v.2.6.2.
* Use jackson-databind v.2.10.1.
* Use assertj-core v.3.14.0.
* Use Gradle wrapper v.5.6.4.
* Use gradle-versions-plugin v.0.27.0.
* Fix GET "talkpreferences" response - "abstract" can be null.
* Fix Travis CI build.

## [v.4.2.0](https://github.com/johnjohndoe/HalfnarpClient/releases/tag/v.4.2.0)

* Published: 2018-11-23

### Changes

* Provide JSON example for successful responses.
* Extend GetTalksResponse with "event_classifiers" property.
* Use retrofit v.2.5.0.
* Use okhttp v.3.12.0.
* Use assertj-core v.3.11.1.
* Use jackson-databind v.2.9.7.
* Use gradle-bintray-plugin v.1.8.4.
* Use gradle-versions-plugin v.0.20.0.
* Use Gradle wrapper v.4.10.2.
* RIP VersionEye.


## [v.4.1.0](https://github.com/johnjohndoe/HalfnarpClient/releases/tag/v.4.1.0)

* Published: 2017-11-26

### Changes

* Use Gradle wrapper v.4.3.1.
* Use gradle-bintray-plugin v.1.8.0.
* Use retrofit v.2.3.0.
* Use okhttp v.3.9.1.
* Use jackson-databind v.2.9.2.
* Use assertj-core v.2.8.0.
* Use gradle-versioneye-plugin v.1.5.0.
* Use gradle-versions-plugin v.0.17.0.


## [v.4.0.0](https://github.com/johnjohndoe/HalfnarpClient/releases/tag/v.4.0.0)

* Published: 2017-05-12

### Changes

* Base URL must now be injected by the client application. This allows usage for other events.
* Library now used Java 8.
* Test "createTalkPreferences" API response.
* Test "https" in base URL.
* Allow "language" in "getTalks" API response to be an empty string.
* Update OkHttp to v.3.7.0.
* Update jackson-databind to v.2.8.8.1.
* Update assertj-core to v.2.7.0.
* Update Gradle wrapper to v.3.5.
* Reduce Lint warnings.


## [v.3.0.0](https://github.com/johnjohndoe/HalfnarpClient/releases/tag/v.3.0.0)

* Published: 2016-11-22

### Changes

* Add deployment configuration.
* Update base URL which has changed.
* Parse "hashed_uid" and "public_url" attributes in "CreateTalkPreferencesSuccessResponse".
* Parse "language" property in "GetTalksResponse".
* Enable test since server is currently online.
* Update OkHttp to v.3.4.2.
* Update jackson-databind to v.2.8.5.
* Update assertj-core to v.2.6.0.
* Reduce Lint warnings.


## [v.2.2.0](https://github.com/johnjohndoe/HalfnarpClient/releases/tag/v.2.2.0)

* Published: 2016-11-20

### Changes

* Update Retrofit to v.2.1.0.
* Update OkHttp to v.3.4.1.
* Update Jackson-databind to v.2.8.4.
* Update Gradle wrapper to v.2.14.1.
* Log unit test execution events into console.
* Reflect version name in artifact file name.


## [v.2.1.0](https://github.com/johnjohndoe/HalfnarpClient/releases/tag/v.2.1.0)

* Published: 2015-11-24

### Changes

* Update OkHttp to v.2.6.0.
* Add unit tests.
* Update Gradle wrapper to v.2.9.


## [v.2.0.0](https://github.com/johnjohndoe/HalfnarpClient/releases/tag/v.2.0.0)

* Published: 2015-10-28

### Changes

* Migrate to Retrofit 2.0.0-beta2.
* Updated library dependencies.


## [v.1.0.0](https://github.com/johnjohndoe/HalfnarpClient/releases/tag/v.1.0.0)

* Published: 2014-12-12

### Changes

* This is the initial release. Have fun!
