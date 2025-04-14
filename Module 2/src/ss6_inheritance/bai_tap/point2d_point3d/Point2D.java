package ss6_inheritance.bai_tap.point2d_point3d;

public class Point2D {
    private float x= 0.0f;
    private float y= 0.0f;
    Point2D(float x, float y){
        this.x = x;
        this.y = y;
    }
    Point2D(){}

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }
    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }
    public float[] getXY(){
        return new float[]{x, y};
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
