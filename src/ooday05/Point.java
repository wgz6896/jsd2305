package ooday05;

public class Point {
    private int x ;
    private  int y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    static {
        System.out.println("out");
    }
    public int getX(){
        return  x;
    }
    public void setX(int x){
        this.x =x ;
    }
    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y = y;
    }

}
