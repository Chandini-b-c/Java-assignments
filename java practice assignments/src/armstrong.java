public class armstrong {
    public static void main(String[] args) {
        int num=153;
        int num1=num;
        int r,s=0;
        while(num>0)
        {
            r=num%10;
            //getting last digit 153%10=3 reminder is considered
            s=s+r*r*r;
            //cubing last digit and adding, value is stored in s=27
            num = num/10;
            //getting quotient value is 15.
        }
        if(num1==s)
            System.out.println("Armstrong number");
        else
            System.out.println("Not a Armstrong number");

    }
}
