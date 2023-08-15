/////////////// FILE HEADER (INCLUDE IN EVERY FILE) //////////////////////////
//
// Title: Clickable
// Course: CS 300 Spring 2022
//
// Author: Madhu Vuyyuru
// Email: mvuyyuru@wisc.edu
// Lecturer: Hobbes LeGault
//
//////////////////// PAIR PROGRAMMERS COMPLETE THIS SECTION ///////////////////
//
// no pair programming was used or allowed
//
///////////////////////// ALWAYS CREDIT OUTSIDE HELP //////////////////////////
//
// no outside source code was used
//
//
///////////////////////////////////////////////////////////////////////////////
/**
 * this class has the Clickable interface
 * 
 * @author mvuyyuru
 *
 */
public interface Clickable {
  /**
   * draws this Clickable object to the screen
   */
  public void draw();

  /**
   * defines the behavior of this Clickable object each time the mouse is pressed
   */
  public void mousePressed();

  /**
   * defines the behavior of this Clickable object each time the mouse is released
   */
  public void mouseReleased();

  /**
   * returns true if the mouse is over this clickable object
   * 
   * @return true if mouse is over the clickable object
   */
  public boolean isMouseOver();
}
