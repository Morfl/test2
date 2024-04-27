public class Tank {
int u;
    private int x;
    private int y;
    private int povorot = 0;
    private int fuel;
    private int num;
    private static String marka = "T34";

    public Tank(int x, int y, int fuel) {
        this.x = x;
        this.y = y;
        this.fuel = fuel;
        num = 3;
    }

    public Tank(int x, int y) {
        this(x, y, 100);
        num = 2;
    }

    public Tank() {
        this(0, 0, 100);
        num = 1;
    }


    public void goForward(int position) {
        if (position < 0 && -position > fuel)
            position = -fuel;
        else if (position > fuel)
            position = fuel;
        if (povorot == 0) x += position;
        else if (povorot == 1) y += position;
        else if (povorot == 2) x -= position;
        else y -= position;
        fuel -= Math.abs(position);
    }

    public void printPosition() {
        System.out.println("The Tank " + marka + "-" + num + " is at " + x + ", " + y + " now.");
    }


    public void turnRight() {
        povorot++;
        if (povorot == 4) {
            povorot = 0;
        }
    }

    public void turnLeft() {
        povorot--;
        if (povorot == -1) {
            povorot = 3;
        }

    }

    public void goBackward(int position) {
        goForward(-position);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}