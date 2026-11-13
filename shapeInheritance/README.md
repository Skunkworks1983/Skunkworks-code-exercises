# Shape Inheritance

This exercise demonstrates Java inheritance and interfaces.

Terminology you should become familiar with is in ***bold italics***.

`Shape.java` declares an `interface` named "Shape". An ***interface*** in Java is a specification of the ***methods*** that a class needs to provide in order to ***implement*** that interface.

`Rectangle.java` declares a `class` named "Rectangle". This class should ***implement*** the `Shape` interface, but currently it does not. As a result, the code will not compile. In order to correctly implement the `Shape` interface, `Rectangle` needs to implement the `perimeter()` and `area()` ***methods***. This is your job.

Similarly, `Triangle.java` declares the `Triangle` class, which should also implement the `Shape` interface.

To get this code running, you should ONLY modify `Rectangle.java` and `Triangle.java`. Once you have correctly updated these two files, running `java ShapeMain.java` (from the `shapeInheritance\java\` ***directory***) should have exactly the output below.

```
> java ShapeMain.java
The area of this 'Rectangle' shape is:          12.0
The perimeter of this 'Rectangle' shape is:     14.0
The area of this 'Triangle' shape is:           6.0
The perimeter of this 'Triangle' shape is:      12.0
```
