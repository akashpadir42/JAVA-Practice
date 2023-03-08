import java.util.Arrays;

public class STR_Anagram {
    public static void anagramornot(String str1, String str2){
        str1= str1.replace("", "");
        str2= str2.replace("", "");

        str1= str1.toLowerCase();
        str2= str2.toLowerCase();

        char a[]=str1.toCharArray();
        char b[]=str2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        boolean result= Arrays.equals(a,b);

        if (result==true){
            System.out.println("Strings are Anagram");
        } else{
            System.out.println("Strings are not Anagram");
        }
    }

    public static void main(String[] args) {
        String str1= "hE iS rAce";
        String str2= "caRe Is";
        anagramornot(str1, str2);
    }
}
