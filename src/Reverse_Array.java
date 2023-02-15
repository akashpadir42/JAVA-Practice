import java.util.Scanner;

public class Reverse_Array {

    public static void reverse_array(int numbers[]) {
        int first=0; int last=numbers.length-1;
        while (first<last){
            int temp= numbers[first];
            numbers[first]=numbers[last];
            numbers[last]=temp;

            first++;
            last--;

        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size= sc.nextInt();
        int numbers[]= new int[size];
        for(int i=0; i<size;i++){
            numbers[i]=sc.nextInt();
        }

        reverse_array(numbers);

        for (int i=0; i<numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
    }
}
