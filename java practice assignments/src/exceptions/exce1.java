package exceptions;
import java.io.*;
public class exce1 {
    public static void main(String[] args) {
        char[] array = new char[40];
        try {
            FileOutputStream ens = new FileOutputStream("D:\\java");
            String s = "Rose is beautiful";
            byte B[] = s.getBytes();
            ens.write(B);
            ens.write(66);
            ens.close();
            System.out.println("Byte");
            FileInputStream obj = new FileInputStream("D:\\java");
            InputStreamReader obj1 = new InputStreamReader(obj);
            obj1.read(array);
            System.out.println(array);
            obj1.close();

        } catch (Exception e) {
            System.out.println(e);
            e.getStackTrace();

        }

    }
}
