public class TwoDArrQ2 {

    public static void sumofnums(int nums[][]){
        int sum=0;
        for (int j=0; j<nums[0].length; j++){
            sum+= nums[2][j];
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        int [][] nums= {{1,4,9}, {11,4,3}, {2,2,3}};
        sumofnums(nums);
    }
}
