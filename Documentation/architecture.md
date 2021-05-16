
# Architecture

## Structure

CinemaStan's package structure consists of the following:

- ui : contains the UI CinemaStanProgram
- domain : contains all of the classes responsible for the application logic
- database : contains all the database and user functionality classes 

## UI

The user interface has four components:

- Opening scene/welcome scene, where the menu buttons are introduced
- Sign up scene
- Login scene
- Play game -scene

All other views are built on the initial opening scene. Most of the gameplay and sign-up/login functions (application logic) have been separated from the user interface.

## Application logic

![Structure](https://github.com/ineslukkanen/ot-harjoitustyo/blob/main/Documentation/images/cinemastanstructure.jpg)

The naming of methods will be updated in the above figure to reflect the program’s current state.


## Data storage

Data storage for user data is done by implementing a database, (SQLite) and the quiz questions are added to a list. 

## Main functionalities

![Sequence](https://github.com/ineslukkanen/ot-harjoitustyo/blob/main/Documentation/images/CinemaStan%20play%20quiz.png)


## Structural weaknesses

The program is very much a work in progress, with several internal shortcomings.

### Gameplay logic

The program doesn't ensure that a question is only asked once during a session, but randomizes through the whole list. Furthermore, the program allows the user to keep playing even though a wrong answer has been entered.

### Data storage

A text file would be more convenient for future plans of further development, when it comes to storing the questions. The integration of the SQLite database is most likely also incomplete.
