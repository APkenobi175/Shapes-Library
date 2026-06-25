## Assignment 1 Decisions and Notes:

1. We need a base INTERFACE called shape.
2. I believe an interface is the right move here due to every shape needing to implement the same move method,
   but the move method will look a little different for every shape.
3. Move is a required method, and shapes will move along the X and Y axis, so we will need to pass in 2 parameters for the move method, X and Y.

4. UML for the interface would look like this:

```mermaid
classDiagram
    class Shape {
      <<interface>>
      +move(x: Double, y: Double) Void
    }
```

5. Our first shape is a point, a point needs the following:
1. X coordinate
2. Y coordinate
3. Move method (from the interface)
4. Clone method
5. get X and Y

```mermaid
classDiagram
    class Point {
      -x: Double
      public get
      -y: Double
      public get
      +move(dx: Double, dy: Double) Void
      +clone() Point
    }
```

- Now that I have a starting point the rest of the UML will be done in lucid chart.

- The rectangle only needs two points. getArea() can calculate the length and the width of the rectangle based on the points, and then just return the area
- We shouldn't ever have to expose the width and height properties to the user.


- A square "is-a" rectangle so we can inherit from rectangle.


- Now that I have hit my third shape that wants a get area method, I think its a good idea to create a 


- circle will inherit from ellipse, and now we are done with the UML and we can start coding!
