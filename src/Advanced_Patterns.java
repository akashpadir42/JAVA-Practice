public class Advanced_Patterns {
    public static  void Hollow_Rectangle(int rows,int cols){
        for (int i=1; i<=rows; i++){
            for (int j=1;j<=cols; j++){
                if (i==1 || i==rows || j==1 || j==cols){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void invertedandrotated_HalfPyramid(int rows, int cols) {
        //outer loop
        for (int i=1; i<=rows;i++){
            //for spaces
            for (int j=1; j<=cols-i;j++){
                System.out.print(" ");
            }
            //for printing *
            for (int k=1; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void halfPyramidNumbers(int n) {
        for (int i=1; i<=n; i++){
            for (int j=1; j<=n-i+1; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }

    public static void FloydsTriangle(int n) {
        int counter=1;
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print(counter+ " ");
                counter++;
            }
            System.out.println();
        }
    }

    public static void ZerOneTriangle(int n) {
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i;j++){
                if ((i+j)%2==0){
                    System.out.print("1 ");
                }
                else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    public static void ButterflyPattern(int n) {
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i;j++){
                System.out.print("*");
            }
            for (int k=1; k<=((2*n)-(2*i)); k++){
                System.out.print(" ");
            }
            for (int l=1; l<=i; l++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=n; i>=1; i--){
            for (int j=1; j<=i;j++){
                System.out.print("*");
            }
            for (int k=1; k<=((2*n)-(2*i)); k++){
                System.out.print(" ");
            }
            for (int l=1; l<=i; l++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void SolidRhombus(int n) {
        for (int i=1; i<=n; i++){
            for (int j=1;j<=(n-i); j++){
                System.out.print(" ");
            }
            for (int k=1; k<=n;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void Hollow_Rhombus(int n) {
        for (int i=1; i<=n; i++){
            for (int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            for (int j=1; j<=n;j++){
                if (i==1 || i==n || j==1 || j==n){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void Diamond_Pattern(int n) {
        for (int i=1; i<=n; i++){
            for (int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            for (int k=1; k<=((2*i)-1); k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=n; i>=1; i--){
            for (int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            for (int k=1; k<=((2*i)-1); k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void NumberPyramid(int n) {
        for (int i=1; i<=n; i++){
            for (int j=1; j<=(n-i);j++){
                System.out.print(" ");
            }
            for (int k=1; k<=i; k++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    public static void Palindromic_Pattern(int n) {
        for (int i=1; i<=n; i++){
            for (int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for (int k=1; k<=i;k++){
                System.out.print(k);
            }
            for (int L= i-1;L>0;L--){
                System.out.print(L);
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
       Palindromic_Pattern(5);
    }
}
