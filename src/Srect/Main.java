package Srect;

public class Main {
    public static void main(String[] args) {
        Rect rect = new Rect(10, 20);
        rect.h = 1;
        if (rect.getW() * rect.getH() != rect.getS()) {
            System.out.println("False");
        }
    }
}
