import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        //BufferedReader
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
        int g=sc.nextInt();
        int p=sc.nextInt();
        int n=sc.nextInt();
int p1=0;
int p2=0;
for(int i=0;i<n;i++) 
{
         int a=sc.nextInt();
                int b=sc.nextInt();

                if (a==1)
                p1++;
                if (b==1)
                p2++;
            }
            int c1=p1*g+p2*p;
            int c2=p1*p+p2*g;
            System.out.println(Math.min(c1,c2));
            t--;
        }
    }
}
