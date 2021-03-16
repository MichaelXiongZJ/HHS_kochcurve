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
	private boolean useAngleLine = true;
	
    public KochCurve(int level, int length) {
    	// TO DO
    }
    
    public void draw(PApplet marker) {
    	drawKochCurve(marker, 5, 90, 50, 50, 1);
    }

    private void drawKochCurve(PApplet marker, double length, double angle, double x, double y, int level) {
    	if(level < 1) {
        //	Draw a straight line of the current length
        	line = new Line(x, y, angle, length, useAngleLine);
    	}else {
    	//	Draw a k-1 level Koch curve of 1/3 the current length
    		drawKochCurve(marker, length/3, angle, x, y, level-1);
    		
        //	Starting where the previous left off, draw a k-1 level Koch curve of 1/3 the
        //	current length, at an angle of 60 degrees with respect to the current angle
    		drawKochCurve(marker, length/3, 60, x, y, level-1);
    		
        //	Starting where the previous left off, draw a k-1 level Koch curve of 1/3 the
        //	current length, at an angle of -60 degrees with respect to the current angle
    		drawKochCurve(marker, length/3, -60, x, y, level-1);
    		
        //	Starting where the previous left off, draw a k-1 level Koch curve of 1/3 the
        //	current length
    		drawKochCurve(marker, length/3, angle, x, y, level-1);
    	}
    }

}
