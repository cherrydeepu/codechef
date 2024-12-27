import java.util.*;
class Codechef{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int A1=s.nextInt();
        int A2=s.nextInt();
        int B1=s.nextInt();
        int B2=s.nextInt();
        int C1=s.nextInt();
        int C2=s.nextInt();
        int sum=0;
        if(A1>A2){
            sum=A1;
        }else{
            sum=A2;
        }
        if(B1>B2){
            sum+=B1;
        }else{
            sum+=B2;
        }
        if(C1>C2){
            sum+=C1;
        }else{
            sum+=C2;
        }
        System.out.println(sum);
    }
}