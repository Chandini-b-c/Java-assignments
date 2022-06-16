public class prime {
    public static void main(String[] args) {
        int i,a=7;
        for(i=2;i<=7;i++)
        {
            if(a%i==0)
            {
                System.out.println(a+" is not a prime number");
            }
            else{
                System.out.println(a+"is a prime number");
            }
        }

    }
}
