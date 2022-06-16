public class parameter {
    int num;
    String name;

    //  function without parameter
    void working() {
        System.out.println("all are working");
    }

    // function with paramter
    void display(int a) {
        System.out.println(a);
    }

    public static void main(String[] args) {

        parameter obj = new parameter();
        obj.working();
        obj.display(10);

    }

}
