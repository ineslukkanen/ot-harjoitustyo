# CinemaStan 

## Purpose of the app 

The purpose of CinemaStan is to be a fun one-player game of movie trivia with questions of varying difficulty.


## Documentation

[Architecture](https://github.com/ineslukkanen/ot-harjoitustyo/blob/main/Documentation/architecture.md)

[Hours worked (In Finnish)](https://github.com/ineslukkanen/ot-harjoitustyo/blob/main/Documentation/tyoaikakirjanpito.md)

[Requirement specifications](https://github.com/ineslukkanen/ot-harjoitustyo/blob/main/Documentation/specifications.md)

[Testing](https://github.com/ineslukkanen/ot-harjoitustyo/blob/main/Documentation/testing.md)

[User Manual](https://github.com/ineslukkanen/ot-harjoitustyo/blob/main/Documentation/usermanual.md)



## Releases

[Release 1](https://github.com/ineslukkanen/ot-harjoitustyo/releases/tag/viikko5)

[Release 2](https://github.com/ineslukkanen/ot-harjoitustyo/releases/tag/viikko6)

[Release 3](https://github.com/ineslukkanen/ot-harjoitustyo/releases/tag/viikko7)


## Command line functions 

### Testing

Tests can be executed with the command 

```
mvn test
```
Test report is generated with the command

```
mvn jacoco:report
```

Report file is in the path _/target/site/jacoco/index.html_

### Generating executable jar

Command

```
mvn package
```
Generates an executable jar-file

### JavaDoc

JavaDoc can be generated with the command

```
mvn javadoc:javadoc
```
Examine the JavaDoc by opening target/site/apidocs/index.html on your web browser

### Checkstyle 

Checkstyle report into the checkstyle.xml file is executed with the command

```
mvn jxr:jxr checkstyle:checkstyle
```
Errors can be examined by opening the file _target/site/checkstyle.html_ on your web browser

