public class Program1 {
    public static void main(String[] args) {
        String input = "Hello World";
        char[] chars= input.toCharArray();

        System.out.print("AND: ");
        for(int i=0; i<chars.length; i++){
            chars[i]=(char) (chars[i] & 127);
        }
        String result = new String(chars);
        System.out.println(result);

        System.out.println("XOR: ");
        for(int i=0; i<chars.length; i++){
            chars[i]=(char) (chars[i] ^ 127);
        }
        String result1 = new String(chars);
        System.out.println(result1);

    }
}
