import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner s=new Scanner(System.in);
        int T=s.nextInt();
        for(int i=0;i<T;i++){
            int N=s.nextInt();
            if(N<=10){
                System.out.println("Lower Double");
            }else if(N>=11 && N<=15){
                System.out.println("Lower Single");
            }else{
                if(N>=16 && N<=25){
                    System.out.println("Upper Double");
                }else{
                    System.out.println("Upper Single");
                }
            }
        }
	}
}
 {
    
}
