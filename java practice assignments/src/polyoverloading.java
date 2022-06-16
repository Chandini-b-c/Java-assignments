//method overloading
public class polyoverloading {
    static int sub(int a,int b){
        int c=a+b;
        return c;
    }
    static double sub(double a, double b, double c){
        double d=a+b+c;
        return d;
    }
    public static void main(String[] args){
        System.out.println(polyoverloading.sub(100,29));
        System.out.println(polyoverloading.sub(33,23));

    }
}

