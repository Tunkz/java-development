import java.awt.*;

public class MainApp {
    public static void main(String[] args) {
        // This starter code to get you familiar with how
        // the TurtleLogo application works

        // The world is your canvas
        World world = new World(500, 500);
        Turtle turtle = new Turtle(world, -100, -100);

//        int width = 200;
//        int height = 200;
//
//        // calculate the hypotenuse (diagonal)
//        // a2 + b2 = c2
//        double widthSquared = Math.pow(width, 2);
//        double heightSquared = Math.pow(height, 2);
//        double hypotenuse = Math.sqrt(widthSquared + heightSquared);
//
//
//        turtle.setPenWidth(3);
//        turtle.setColor(Color.GREEN);
//
//        turtle.turnRight(45);
//        turtle.forward(hypotenuse);
//
//        turtle.penUp();
//        turtle.goTo(100, 100);
//        turtle.turnRight(90);
//
//        turtle.penDown();
//        turtle.forward(hypotenuse);
//    }
//        turtle.setHeading(0);
//
//        for (int i = 0; i < 4 ; i++) {
//            turtle.forward(200);
//            turtle.turnRight(90);
//        }
//        world.saveAs("square.png");

        turtle.penUp();
        turtle.setDelay(0.0007);
        turtle.goTo(100,100);
        turtle.penDown();
        turtle.turnLeft(90);
        for (int i = 0; i < 270; i++) {
            turtle.forward(2);
            turtle.turnLeft(1);
        }
        turtle.turnLeft(90);
        turtle.forward(120);
        turtle.turnRight(90);
        turtle.forward(120);
        turtle.turnLeft(90);

        Turtle turtwig = new Turtle(world,110,-90);
        turtwig.setColor(Color.BLUE);
        turtwig.turnLeft(180);
        turtwig.forward(110);
        turtwig.turnLeft(90);
        turtwig.forward(110);
        turtwig.turnLeft(90);
        for (int i = 0; i < 180; i++) {
            turtwig.setDelay(0.0007);
            turtwig.forward(1);
            turtwig.turnLeft(0.5);
        }
        turtwig.turnRight(90);



    }
}
