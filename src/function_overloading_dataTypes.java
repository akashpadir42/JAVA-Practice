public class function_overloading_dataTypes {

    public static int sum(int a, int b){
        return a+b;
    }

    public static float sum(float a, float b){
        return a+b;
    }

    public static void main(String[] args) {
        System.out.println(sum(5,3));
        System.out.println(sum(6.8f, 1.2f));
    }
}
