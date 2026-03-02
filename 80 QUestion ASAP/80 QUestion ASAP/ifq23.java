// // import java.util.Scanner;
// // public class ifq23{
// //     public static void main(String[] args){
// //         Scanner f = new Scanner(System.in);
// //         int a= f.nextInt();
// //         int b= f.nextInt();
// //         int c = f.nextInt();
// //         if(a==b && b==c){System.out.println("EQIAULR");}
// //         else if (a==b || a==c || c==b)System.out.print("ISO");
// //         else System.out.print("sq");
// //     }
// // }
// import java.util.Scanner;
// public class ifq23{
//     public static void main(String[] args){
//         Scanner f= new Scanner(System.in);
//         int a = f.nextInt();
//         int b = f.nextInt();
//         int c  = f.nextInt();
//         if(a==b && b==c)System.out.print("eqi");
//         else if (a==b || b==c || a==c)System.out.print("iso");
//         else System.out.print("sq");
//     }
// }
import java.util.Scanner;
public static void main(String[] args){
    Scanner f = new Scanner(System.in);
    int a = f.nextInt();
    int  b = f.nextInt();
    int c  = f.nextInt();
    if(a==b && b==c)System.out.print("eqi");
    else if (a==b || b==c || c==a)System.out.print("iso");
    else System.out.print("sq")
}