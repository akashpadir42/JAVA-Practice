public class swapping_usingXOR {

    public static void swap2numbers(int x, int y){
        System.out.println("Before Swapping: \nx= "+x + " & y= "+ y);
        x= x^y;
        y= x^y;
        x= x^y;
        System.out.println("After Swapping: \nx= "+x + " & y= "+ y);

    }
    public static int practice(int x){
        x= x^x;
        return x;
    }
    public static void main(String[] args) {
//        System.out.println(practice(4));
//        swap2numbers(3,4);

        for (char ch= 'A'; ch<= 'Z'; ch++){
            System.out.print((char) (ch | ' '));
        }
    }
}
