public class large {
    public static void main(String[] args) {
        int a=90; int b=20; int c=30;
        if(a>b&&a>c)
        {
            System.out.println("a is large");
            if(b>c)
            {
                System.out.println("b is large");
                if(a>c)
                {
                    System.out.println("c is large");
                }
            }
        }

    }
}
