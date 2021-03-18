import processing.core.PApplet;
import zxiong.shapes.Line;


/**
  @(#)KochCurve.java


  @author
  @version
*/
public class KochCurve {

	// TO DO
	private Line line;
	private boolean useAngleLine;
	private double xLoc;
	private double yLoc;
	private int lvl;
	private int inL;
	private int inA;
	
    public KochCurve(int level, int length) {
    	lvl = level;
    	inL = length;
    	inA = 0;
    	xLoc = 200;
    	yLoc = 200;
    }
    
    public void draw(PApplet marker) {
    	drawKochCurve(marker, inL, inA, xLoc, yLoc, lvl);
    }

    private void drawKochCurve(PApplet marker, double length, double angle, double x, double y, int level) {
    	if(level < 1) {
        //	Draw a straight line of the current length
        	line = new Line(x, y, angle, length, useAngleLine);
        	line.draw(marker);
    	}else {
    	//	Draw a k-1 level Koch curve of 1/3 the current length
    		drawKochCurve(marker, length/3, angle, x, y, level-1);
    		xLoc = line.getX2();
    		yLoc = line.getY2();
        //	Starting where the previous left off, draw a k-1 level Koch curve of 1/3 the
        //	current length, at an angle of 60 degrees with respect to the current angle
    		drawKochCurve(marker, length/3, angle+60, xLoc, yLoc, level-1);
    		xLoc = line.getX2();
    		yLoc = line.getY2();
        //	Starting where the previous left off, draw a k-1 level Koch curve of 1/3 the
        //	current length, at an angle of -60 degrees with respect to the current angle
    		drawKochCurve(marker, length/3, angle-60, xLoc, yLoc, level-1);
    		xLoc = line.getX2();
    		yLoc = line.getY2();
        //	Starting where the previous left off, draw a k-1 level Koch curve of 1/3 the
        //	current length
    		drawKochCurve(marker, length/3, angle, xLoc, yLoc, level-1);
    	}
    }

}
