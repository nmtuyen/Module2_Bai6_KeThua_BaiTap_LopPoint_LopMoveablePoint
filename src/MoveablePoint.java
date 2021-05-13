public class MoveablePoint extends Point{
    float xSpeed = 0.0f;
    float ySpeed = 0.0f;

    public MoveablePoint(){
    }

    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MoveablePoint(float x, float y, float xSpeed, float ySpeed){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float [] getSpeed(){
        float [] arr = {xSpeed, ySpeed};
        return arr;
    }
    public String toString(){
        return "(x,y),speed = "+"("+ xSpeed +","+ySpeed+")";
    }
    public MoveablePoint move(){
        x+= xSpeed;
        y+= ySpeed;
        return this;
    }
}
