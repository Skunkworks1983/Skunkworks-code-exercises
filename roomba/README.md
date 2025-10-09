# Cleaning Robot (Roomba)

Your task is to create a program for a Roomba that cleans a square room. The room contains walls and
furniture that the robot cannot move into. Your Roomba need to find your way around these walls and furniture,
cleaning every available space. Here is an example of a room:

```
cr.....■.■
cc...■....
cc..■..■..
..........
.....■.■..
■.■■.■■...
..........
.■.■......
.....■■...
...■..■...
```

The robot is the 'r' character. The boxes are walls. The 'c' characters indicate cleaned floor spots. The '.'
characters indicate open, uncleaned floor spots. So far, the robot has cleaned five spots and is in the (x, y)
position (1, 0). The origin, (0, 0), is the top left (or northwest) corner of the room.

## Running the Program

You should be able to run the program from the `java/` directory using `java Main.java`. You should
see the robot moving around in a small square, cleaning the floor as it goes.

The program will keep running until the whole floor is clean, which won't happen with the existing code.
You can stop the program by pressing control-C on your keyboard while in the terminal window (this is true
of most programs).

## Implementing Your Solution

Your solution code should go in the `moveRobotOnce()` method in `Main.java`. Each time this method is
called, you should call a robot movement method on `grid` and possibly also `grid.robotClean()`. Calling
more than one movement function at a time will mess up the regular printing of the grid, which happens
every 1 second by default.

## Background

You should read through all the `public` methods in Grid.java, particularly all the methods whose names
start with "robot". These are how you will control the robot from Main.java.

You should understand why the existing code behaves like it does. Why does the robot move in a square?

To fully understand how the `Grid` class works, you may need to read the
[Java documentation on HashSet](https://docs.oracle.com/javase/8/docs/api/java/util/HashSet.html), which
is a very useful class.

## Extensions

You may notice while working on this project that some rooms are impossible to fully clean. You could
add a method to `Grid` that checks if it is possible to clean the whole room or not from the robot's
starting position.
