public class CopyConstructor {
    int id;
    String name;

    public static void main(String[] args) {
        Emp e1 = new Emp(4, "Akash");
        Emp e2 = new Emp(e1);
    }

    CopyConstructor(int i, String s) {
        id = i;
        name = s;
    }

    CopyConstructor(Emp e) {
        id = e.id;
        name = e.name;
    }

}