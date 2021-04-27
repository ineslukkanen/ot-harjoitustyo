# CinemaStan 

## Purpose of the app 

The purpose of the app is to be a fun one-player game of movie trivia.

## Documentation

[Tyoaikakirjanpito](https://github.com/ineslukkanen/ot-harjoitustyo/blob/main/Documentation/tyoaikakirjanpito.md)

[Architecture](https://github.com/ineslukkanen/ot-harjoitustyo/blob/main/Documentation/architecture.md)

## Releases

## Command line commands 

### Running CinemaStan

Program can be run with the command

```
mvn compile exec:java (final path here)
```

### Testing

Tests can be executed with the command 

```
mvn test
```
Test report is generated with the command

```
mvn jacoco:report
```

Report file is in the path _./target/site/jacoco/index.html_

### Generating executable jar

Command

```
mvn package
```
Generates an executable jar-file (name).jar

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
Errors can be examined by opening the file target/site/checkstyle.html on your web browser

