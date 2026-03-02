// // import java.util.Scanner;
// // public class forq16{
// //     public static void main(String[] args){
// //         Scanner f = new Scanner(System.in);
// //         int n= f.nextInt();
// //         int check=n;
// //         int c=0;
// //         for(int i=1;i<=n;i++){
// //             if(n%i==0)c++;
// //         }
// //         System.out.println((c==2)?"prime":"no");
// //     }
// // }
// import java.util.Scanner;
// public class forq16{
//     public static void main(String[] args){
//         Scanner f =new Scanner(System.in);
//         int n =f.nextInt();
//         int v=0;
//         for(int i=1;i<=n;i++){
//             if(n%i==0)v++;
//         }
//         System.out.println((v==2)?"ptrime":"no");

//     }
// }
import java.util.Scanner;
public class forq16{
    public static void main(String[] args){
        Scanner f = new Scanner(System.in);
        int n = f.nextInt();
        int c =0;
        for(int i=1;i<=n;i++){
            if(n%i==0)c++;
        }
        // System.out.println((c==2)?"prime":"no");
    }
}