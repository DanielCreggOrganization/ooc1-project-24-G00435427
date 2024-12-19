[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=17263108)
# OOC1 Project

**Title:** Videogame Manager  
**Name:** Nathan Reilly 
**Student ID:** G00435427  

## Application Function

Discuss what the application does.

## Running the Application

Provide step by step instructions on how to run your applicaiton. Are there any prerequisite softwares required?

```list
List the instructions step by step
    1. Go to the Main class and press execute
    2. Enter one and add game to array
    3. Enter game ID, Name, genre, storage size(GB) and if the game is multiplayer(true/false)
    4. Repeat to fill up array.
    5. Once multiple games are entered use other numbered features in the menu
            
            
```

## Minimum Project Requirements

Describe how you have met all minimum project requirements below:

* The repository contains, at minimum, two commits per week (Note: There should be many commits per day coding).
    I did my best but power outages due to storm and more urgent assignments and assesments
    took away from my time to work on this porject.

* The project, including code and documentation, is fully contained in the provided GitHub Classroom repository.
    All code is in Classroom repository.

* Methods = Add Item, Remove Item, Update Item, Find total items, Search Items and Quit.
    All base methods added.

* The code MUST compile.
    Code compiles.

* The application code must be formatted in a consistent and standard way.
    Yes.
* The code must contain comments. One comment per class, method and variable at minimum.
    Yes.
* The documentation and commentary must be free of a grammar and spelling mistakes.
    Hopefully

## Project Requirements above and beyond

Discuss any application features or design elements that show you went above and beyond basic requirements.

I added extra methods to my menu:
List all games in the array.
Genre search for games.
Option to display and compare sales of game, Showing which has greater sales


## Application Architecture

Discuss in detail how the application is structured. List all classes and describe their purpose. List all methods and describe what they do.

Game:
Represents the individual game, gives it its variables(ID, Name, Genre etc)

Encapsulates variables and uses getter annd setter methods

GameManager:
Base abstract class for managing gamecollection
Defines abstract methods for menu options.


GameCollection:
Implements the abstract methods
Provides function to menu options.
Manages the list of game options

Menu:
Displays the inteface and manages users interaction
uses a loop to display the menu options.

Main:
Instantiates the menu class to start the program


## Roadblocks and Unfinished Functionality

What did you not get finished? Discuss the issues you faced when creating your application Provide possible solutions to these issues. What would you have done differently if you had to do this project again?

Orinally I had planned to expand the Multiplayer boolean to add extra variables for server regions 
if it was set to true when creating a game in the array, 
This feature would list different server regions and let the user select a region and show what other regions are compatible with it.
Same of the left over code from this can be seen commented out in Game.java

If I was to do this project again, I would try to manage my time better so that I could get all the features I wanted to include in.

## Resources

Provide links to resources used:

* [Tutorialspoint](https://www.tutorialspoint.com/java/) - Java Tutorials site I found helpful
