public class MovablePoint implements Movable {
  int x, xSpeed, y, ySpeed;

  public MovablePoint() {
    this.x = 0;
    this.y = 0;
    this.xSpeed = 0;
    this.ySpeed = 0;
  }

  public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
    this.x = x;
    this.y = y;
    this.xSpeed = xSpeed;
    this.ySpeed = ySpeed;
  }

  @Override
  public void moveUp() {
    this.y += this.ySpeed;
  }

  @Override
  public void moveDown() {
    this.y -= this.ySpeed;
  }

  @Override
  public void moveLeft() {
    this.x += xSpeed;
  }

  @Override
  public void moveRight() {
    this.x -= xSpeed;
  }

  @Override
  public String toString() {
    return "[" + this.x + ", " + this.y + "]";
  }
}
