import processing.core.PApplet;


/**
  @(#)KochCurve.java


  @author
  @version
*/
public class KochCurve {

	// TO DO

    public KochCurve(int level, int length) {
    	// TO DO
    }
    
    public void draw(PApplet marker) {
    	drawKochCurve(/* TO DO */);
    }

    private void drawKochCurve(PApplet marker, double length, double angle, double x, double y, int level) {
    	if(level < 1) {
        	Draw a straight line of the current length
    	}else {
    		Draw a k-1 level Koch curve of 1/3 the current length

        	Starting where the previous left off, draw a k-1 level Koch curve of 1/3 the
        	current length, at an angle of 60 degrees with respect to the current angle

        	Starting where the previous left off, draw a k-1 level Koch curve of 1/3 the
        	current length, at an angle of -60 degrees with respect to the current angle

        	Starting where the previous left off, draw a k-1 level Koch curve of 1/3 the
        	current length
    	}
    }

}
