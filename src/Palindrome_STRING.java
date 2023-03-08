public class Palindrome_STRING {
    public static boolean palidromeornot(String str){
        String palindrome="";
        for (int i=str.length()-1; i>=0; i--){
            palindrome+=str.charAt(i);
        }
//        System.out.println(palindrome);
        if(str.toLowerCase().equals((palindrome.toLowerCase()))){
//            System.out.println("String is Palindrome");
            return true;
        }
        else {
//            System.out.println("String is not a Palindrome");
        }
        return false;
    }
    public static void main(String[] args) {
        String name= "A man, a plan, a canal: Panama";
        System.out.println(palidromeornot(name));
    }
}
