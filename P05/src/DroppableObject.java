/////////////// FILE HEADER (INCLUDE IN EVERY FILE) //////////////////////////
//
// Title: droppableObject
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
import java.util.NoSuchElementException;

/**
 * this class has DroppableObject which extends DraggableObject
 * 
 * @author mvuyyuru
 *
 */
public class DroppableObject extends DraggableObject {
  private InteractiveObject target; // target of this droppable object

  /**
   * Creates a new Droppable object with specific name, x and y positions, message, target , and
   * sets its next clue.
   * 
   * @param name     - to be assigned to this droppable object
   * @param x        - x-position of this droppable object
   * @param y        - y-position this droppable object
   * @param message  - message to be assigned to this droppable object
   * @param target   - target where this droppable object should be dropped
   * @param nextClue - reference to an interactive object which will be activated when this
   *                 droppable object is dropped on its target.
   */
  public DroppableObject(java.lang.String name, int x, int y, java.lang.String message,
      InteractiveObject target, InteractiveObject nextClue) {
    super(name, x, y, message);
    this.target = target;
    this.setNextClue​(nextClue);
  }

  /**
   * Stops dragging this droppable object. Also, if this droppable object is over its target and the
   * target is activated, this method (1) deactivates both this object and its target, (2) activates
   * the next clue, and (3) prints the message of this draggable object to the console.
   */
  public void mouseReleased() {
    stopDragging();
    if (isOver​(target) && target.isActive()) {
      this.deactivate();
      target.deactivate();
      System.out.println(this.message());
      try {
        this.activateNextClue();
      } catch (NoSuchElementException e) {

      }
    }
  }

  /**
   * Checks whether this object is over another interactive object.
   * 
   * @param other - reference to another iteractive object. We assume that other is NOT null.
   * @return true if this droppable object and other overlap and false otherwise.
   */
  public boolean isOver​(InteractiveObject other) {
    if ((this.getX() < other.getX() + other.image.width)
        && (other.getX() < this.getX() + this.image.width)
        && (this.getY() < other.getY() + other.image.height)
        && (other.getY() < this.getY() + this.image.height)) {
      return true;
    }
    return false;
  }
}
