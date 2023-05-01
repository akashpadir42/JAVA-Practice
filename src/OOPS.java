public class OOPS {
    public static void main(String[] args) {
        Pen p1= new Pen();
        System.out.println(p1.color="Blue");
        System.out.println(p1.tip= 7);
    }
}
class Pen{
    String color;
    int tip;

    public void setColor(String newColor) {
        color = newColor;
    }
    public void setTip(int newTip) {
        tip = newTip;
    }
}
