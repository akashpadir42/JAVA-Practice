public class Emp {
    int id;
    String name;
    public static void main(String[] args) {
        Emp e1 = new Emp(4, "Akash");
        Emp e2 = new Emp(e1);
    }
    Emp(int i, String s){
        id= i;
        name=s;
    }

    Emp(Emp e){
        id= e.id;
        name= e.name;
    }
    void display(){
        System.out.println(" "+ id + " "+ name);
    }
}
