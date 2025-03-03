/**
    This is a template for a Java file.
    @author Angelo B. Dela Cruz (222086)
    @version March 9, 2023

    This class is used to create the square shape for whichever class wants to use it.
**/

/*
    I have not discussed the Java language code in my program 
    with anyone other than my instructor or the teaching assistants 
    assigned to this course.

    I have not used Java language code obtained from another student, 
    or any other unauthorized source, either modified or unmodified.
    
    If any Java language code or documentation used in my program 
    was obtained from another source, such as a textbook or website, 
    that has been clearly noted with a proper citation in the comments 
    of my program.
*/

import java.awt.*;
import java.awt.geom.*;

public class Square implements DrawingObject{
    private double x;
    private double y;
    private double size;
    private Color color;

    /**Initializes the initial position, color, and side length of the square. */
    public Square(double x, double y, double size, Color color){
        this.x = x;
        this.y = y;
        this.size = size;
        this.color = color;
    }

    /**Draws the Square shape */
    @Override
    public void draw(Graphics2D g2d) {
        Rectangle2D.Double sqr = new Rectangle2D.Double(x,y,size,size);
        g2d.setColor(color);
        g2d.fill(sqr);
    }

}
