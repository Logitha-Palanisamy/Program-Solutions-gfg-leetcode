import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        //BufferedReader
        Scanner sc=new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int s=sc.nextInt();
       int n=s*2;
       String a=sc.next();
       System.out.println(n);
       System.out.println(a);

    }
}
