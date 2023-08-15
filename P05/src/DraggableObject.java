/////////////// FILE HEADER (INCLUDE IN EVERY FILE) //////////////////////////
//
// Title: DraggableObject
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
 * this class has DraggableObject which extends InteractiveObject
 * 
 * @author mvuyyuru
 *
 */
public class DraggableObject extends InteractiveObject {
  private boolean isDragging;
  private int oldMouseX;
  private int oldMouseY;

  /**
   * Creates a new Draggable object with a given name, x and y position, and "Drag Me!" as a default
   * message. When created a new draggable object is NOT dragging.
   * 
   * @param name - name to be assigned to this draggable object
   * @param x    - x-position of this draggable object in the display window
   * @param y    - y-position of this draggable object in the display window
   */
  public DraggableObject(java.lang.String name, int x, int y) {
    super(name, x, y, "Drag Me!");
    oldMouseX = x;
    oldMouseY = y;
  }

  /**
   * Creates a new Draggable object with a given name, x and y position, and a specific message.
   * When created a new draggable object is NOT dragging.
   * 
   * @param name    - name to be assigned to this draggable object
   * @param x       - x-position of this draggable object in the display window
   * @param y       - y-position of this draggable object in the display window
   * @param message - message to be displayed when this draggable object is clicked. We assume that
   *                message is VALID (meaning it is NOT null and NOT an empty string).
   */
  public DraggableObject(java.lang.String name, int x, int y, java.lang.String message) {
    super(name, x, y, message);
    oldMouseX = x;
    oldMouseY = y;
    isDragging = false;
  }

  /**
   * Checks whether this draggable object is being dragged.
   * 
   * @return true if this object is being dragged, false otherwise
   */
  public boolean isDragging() {
    return isDragging;
  }

  /**
   * Starts dragging this draggable object and updates the oldMouseX and oldMouseY positions to the
   * current position of the mouse.
   */
  public void startDragging() {
    isDragging = true;
    oldMouseX = processing.mouseX;
    oldMouseY = processing.mouseY;

  }

  /**
   * Stops dragging this draggable object
   */
  public void stopDragging() {
    isDragging = false;
  }

  /**
   * Draws this draggable object to the display window. If this object is dragging, this method sets
   * its position to follow the mouse moves. Then, it draws its image to the its current position.
   * 
   */
  public void draw() {
    if (isDragging() == true) {
      this.move​(processing.mouseX - oldMouseX, processing.mouseY - oldMouseY);
      processing.image(image, processing.mouseX, processing.mouseY);
      startDragging();
    } else {
      processing.image(image, this.getX(), this.getY());
    }
  }

  /**
   * Starts dragging this object when it is clicked (meaning when the mouse is over it).
   */
  public void mousePressed() {
    if (isMouseOver()) {
      startDragging();
    }
  }

  /**
   * Stops dragging this object if the mouse is released
   */
  public void mouseReleased() {
    stopDragging();
  }
}

