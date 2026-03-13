import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        //BufferedReader
        Scanner sc=new Scanner(System.in);
       
        int n=sc.nextInt();
        String s=sc.next();
        
        if(s.contains("HH")){
            System.out.println("NO");
            return;
        }
            s=s.replace('.','B');
            System.out.println("YES");
            System.out.println(s);
        
    }
}
