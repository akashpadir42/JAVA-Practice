public class STRQ1 {
    public static int lowercasevowels(String name){
        int count=0;
        for (int i=0; i<name.length(); i++){
            char ch= name.charAt(i);
            if ( ch== 'a'||ch== 'e' ||ch=='i' ||ch== 'o' ||ch== 'u'){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String name= "Akause";
        System.out.print("No. of Lowercase Vowels= " + lowercasevowels(name));
    }
}
