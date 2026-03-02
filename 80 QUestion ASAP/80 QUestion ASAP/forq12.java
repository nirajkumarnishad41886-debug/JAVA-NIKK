// // // import java.util.Scanner;
// // // public class forq12{
// // //     public static void main(String[] args){
// // //         Scanner f=  new Scanner(System.in);
// // //         int n  = f.nextInt();int c= 0;
// // //         for(;n>0;n/=10)c+=n%10;
// // //         System.out.println(c);
// // //     }
// // // }

// // import java.util.Scanner;
// // public class forq12{
// //     public static void main(String[] args){
// //         Scanner f = new Scanner(System.in);
// //         int n=  f.nextInt();
// //         int sum=0;
// //         for(;n>0;n/=10)sum+=n%10;
// //         System.out.print(sum);
// //     }
// // }
import java.util.Scanner;
public class forq12{
    public static void main(String[] args){
        Scanner f= new Scanner(System.in);
        int n = f.nextInt();
        int sum=0;
        for(;n>0;n/=10)sum+=n%10;
        System.out.println(sum);

    }
}