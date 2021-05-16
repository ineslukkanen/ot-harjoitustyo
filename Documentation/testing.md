# Testing Document

## Unit and integration testing

### Application logic

Bulk of the testing was done to two classes; [Controller](https://github.com/ineslukkanen/ot-harjoitustyo/blob/main/CinemaStan/src/main/java/database/Controller.java) and [User](https://github.com/ineslukkanen/ot-harjoitustyo/blob/main/CinemaStan/src/main/java/database/User.java).

### Test coverage

Test coverage is very low at this stage, and only covers the database class.

The user interface and other classes with mainly interface-building properties have been excluded from the testing document.

![report](https://github.com/ineslukkanen/ot-harjoitustyo/blob/main/Documentation/images/Jacoco.png)


## System testing

System testing has been performed manually.


### Functionalities

Most of the functionalities listed in the requirements document (linkki) have been covered.


## Program flaws

The database works in very rudimentary cases, making this program both structurally unsound and vulnerable. Some exceptions have been covered, but several have been left unhandled.
