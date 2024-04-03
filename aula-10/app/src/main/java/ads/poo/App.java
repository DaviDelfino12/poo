package ads.poo;

import java.awt.Color;

import edu.princeton.cs.algs4.Draw;

public class App {


    public static void main(String[] args) {

        Draw draw = new Draw();

        // draw.setPenColor(Color.BLUE);
        // draw.square(.5, .5, .1);
        // draw.text(.5, .5, ":()");

        draw.setCanvasSize(800, 600);
        draw.setXscale(0, 800);
        draw.setYscale(0, 600);

        draw.picture(400, 300, "takanaka.jpg");

        
    }
}