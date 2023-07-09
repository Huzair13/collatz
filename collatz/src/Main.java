import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
//        System.out.print(n+" ");
        int count=0;
        while(n!=1){
            count+=1;
            if(n%2==0){
                n/=2;
                System.out.print(n+" ");
            }else{
                n=(3*n)+1;
                System.out.print(n+" ");
            }
        }
        System.out.print(count);
    }
}