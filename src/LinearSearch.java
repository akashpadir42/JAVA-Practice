public class LinearSearch {
    public static int Linear_Search(String menu[], String key){
        for (int i=0; i< menu.length;i++){
            if (menu[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String menu[]= {"Dosa","Paneer Masala", "Samosa", "Vada Pav", "Misal", "Coca Cola" };
        String key= "Vada Pav";
        int index=Linear_Search(menu,key);

        if (index==-1){
            System.out.println("Key is Not Found in an Array..");
        }
        else {
            System.out.print("Key found at index: "+index);
        }

    }
}
