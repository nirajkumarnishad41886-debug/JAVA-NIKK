// // import java.util.Scanner;
// // public class forq15{
// //     public static void main(String[] args){
// //         Scanner f =new Scanner(System.in);
// //         int n=f.nextInt();int s=0;
// //         for(int i=1;i<=n;i++){
// //             if(n%i==0){
// //                 System.out.print(" "+ i);
// //                 s++;
// //             }
// //         }
// //         System.out.println();
// //         System.out.println(s);
// //     }
// // }
// import java.util.Scanner;
// public class forq15{
//     public static void main(String[] args){
        
//         Scanner f = new Scanner(System.in);
//         int n =f.nextInt();
//         int c=0;
//         for(int i=1;i<=n;i++){if(n%i==0)System.out.print(" "+i);c++;}
//         System.out.println();
//         System.out.println(c);
//     }
// }
import java.util.Scanner;
public class forq15{
    public static void main(String[] args){
        Scanner f =new Scanner(System.in);
        int n=f.nextInt();
        int c=0;
        for(int i = 1;i<=n;i++){
            if(n%i==0){
                System.out.print(" "+i);c++;
            }

        }
        System.out.println();
        System.out.println(c);
    }
}