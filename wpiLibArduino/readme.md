# WPILib For Arduino

This project contains a minimal port of WPILib compatible with the Arduino Uno and Adafruit Motor Shield v2.3. You can use this to practice writing FRC robot code on your Arduino kitbot. The following classes are included:

 * Robot: The main class in a WPILib project.
 * Command: An abstract class that can be extended to implement different tasks that the robot can perform.
 * CommandGroup: A structured list of Commands.
 * Scheduler: Handles the execution of Commands.
 * MotorController: Sends outputs to the motors.
 * AnalogInput: Reads voltages from the "Analog In" pins. Allows use of the included IR rangefinder.
 * PidController: An implementation of a [PID controller](https://en.wikipedia.org/wiki/PID_controller).
 * PidOutput: An interface for output devices compatible with the PidController. Implemented by MotorController.
 * PidInput: An interface for input devices compatible with the PidController. Implemented by AnalogInput.

An Arduino sketch is also included. To run:

1. Download the [Arduino IDE](https://www.arduino.cc/en/Main/Software).
2. Download [this Arduino port of the C++ standard library](https://github.com/maniacbug/StandardCplusplus) and follow the installation instructions.
3. Edit the LIB_DIR variable in the makefile and set it to the location of your Arduino library directory (the same directory you just put the C++ standard library port in).
4. Run the command "make project" (after the first time, just run "make") in a Cygwin terminal. This will import your code into the Arduino IDE as a library.
5. Open the included sketch file, testSketch.ino, in the Arduino IDE and click the "Upload" button. The code will execute on your Arduino as soon as the upload finishes.

# Background

To write WPILib For Arduino code, you'll need to know or learn about the following:

 * loops
 * pointers
 * classes
 * WPILib command-based program architecture

If you need help with any of these, ask a mentor or the internet.

# Tips

 * Any code that you write should go in commands that extend the Command base class, or in Robot::autonomousInit(). The other classes are available for viewing so you can see how they work, but you shouldn't need to edit any of them.
 * For an example of how these classes fit together in a real robot program, take a look at [one of our old repositories](https://github.com/Skunkworks1983/2016Stronghold).

# Extensions

1. Make your Arduino bot drive in a circle of a fixed diameter.
2. Make your Arduino bot drive in a square using a CommandGroup.
3. Make your Arduino bot set the speed of its motors proportionally to the voltage received from the infrared distance sensor.
4. Use a PID with the infrared distance sensor to make your Arduino bot maintain a fixed distance from whatever is in front of it.
