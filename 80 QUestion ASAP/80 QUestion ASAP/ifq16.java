// // import java.util.Scanner;
// // public class ifq16{
// //     public static void main(String[] args){
// //         Scanner sc = new Scanner(System.in);
// //         int a = sc.nextInt();
// //         int b= sc.nextInt();
// //         int c = sc.nextInt();
// //         if(a+b<c && a+c<b && c+b<a){
// //             System.out.println("yes");
// //         }else{
// //             System.out.println("no");
// //         }
// //     }
// // }
// import java.util.Scanner;
// public class ifq16 {
//     public static void main(String[] args){
//         Scanner f = new Scanner(System.in);
//         int a =f.nextInt();
//         int b=f.nextInt();
//         int c = f.nextInt();
//         if(a+b<c && a+c<b && b+c<c){
//             System.out.println("YEs");
//         }else{
//             System.out.println("no");
//         }
//     }
// }
import java.util.Scanner;
public class ifq16 {

    public static void main(String[] args){
        Scanner f = new Scanner(System.in);
        int  a=f.nextInt();
        int b=f.nextInt();
        int c=f.nextInt();
        if(a+b<c && a+c<b && b+c<a){
            System.out.println("yes");
        }else{
            System.out.println("NO");
        }
    }
}