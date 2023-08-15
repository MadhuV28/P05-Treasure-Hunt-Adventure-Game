/////////////// FILE HEADER (INCLUDE IN EVERY FILE) //////////////////////////
//
// Title: RestartGameButton
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
 * this class has RestartGameButton which extends Button
 * 
 * @author mvuyyuru
 *
 */
public class RestartGameButton extends Button {
  /**
   * Creates a new RestartGameButton object labeled "Restart Game" at a specific position on the
   * screen
   * 
   * @param x x-position to be assigned to this restart game button
   * @param y y-position to be assigned to this restart game button
   */
  public RestartGameButton(int x, int y) {
    super("Restart Game", x, y);
  }

  /**
   * Defines the behavior of this button when the mouse is pressed. This button initializes the game
   * if it is clicked (meaning if the mouse is over it)
   */
  @Override
  public void mousePressed() {
    if (this.isMouseOver()) {
      ((TreasureHunt) processing).initGame();
    }
  }
}

