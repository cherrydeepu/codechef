import java.util.*;
class Codechef
{
	public static void main (String[] args)
	{
        Scanner s=new Scanner(System.in);
        int T=s.nextInt();
        for(int i=0;i<T;i++){
            int A=s.nextInt();
            int B=s.nextInt();
            int C=s.nextInt();
            if((A+B)==C){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
	}
}
