public class inverted_starpattern {
    public static void main(String[] args) {
        int i, j;
        for (i=1;i<=6;i++){
            for (j=4;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
