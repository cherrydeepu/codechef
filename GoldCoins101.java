import java.util.*;
class Codechef
{
	public static void main (String[] args){
        Scanner s=new Scanner(System.in);
        int A=s.nextInt();
        int B=s.nextInt();
        int X=s.nextInt();
        int Y=s.nextInt();
        if(X>=1 && X!=Y && Y<=5){
            if(X>Y){
                if((A>B)){
                    System.out.println(A);
                }else{
                    System.out.println(B);
                }
            }else{
                if(A<B){
                    System.out.println(A);
                }else{
                    System.out.println(B);
                }
            }
        }
	}
}
