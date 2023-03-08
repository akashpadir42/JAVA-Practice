public class LargestString {

    public static String getLargestsubstr(String [] fruits){
        String largest= fruits[0];
        for (int i=1; i< fruits.length;i++){
            if (largest.compareToIgnoreCase(fruits[i])<0){
                largest=fruits[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        String [] fruits= {"Apple", "banana", "Mango", "orange", "Pineapple", "Cheeku" };
        System.out.print("Largest String= "+getLargestsubstr(fruits));
    }
}
