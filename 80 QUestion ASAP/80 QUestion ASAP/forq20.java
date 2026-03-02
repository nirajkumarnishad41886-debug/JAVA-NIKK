// // import java.util.Scanner;
// // public class forq20 {

// //     public static void main(String[] args) {
// //         Scanner f = new Scanner(System.in);
// //         int n = f.nextInt();
// //         int p=1;
// //         for(;n>0;n/=10)p*=n%10;
// //         System.out.print(p);

// //     }
// // }
// import java.util.Scanner;
// public class forq20 {

//     public static void main(String[] args) {
//         Scanner f =new Scanner(System.in);
//         int n=f.nextInt();int pro=1;
//         for(;n>0;n/=10)pro*=n%10;
//         System.out.println(pro);
//     }
// }
import  java.util.Scanner;
public class forq20 {

    public static void main(String[] args) {
        Scanner f =new Scanner(System.in);
        int n=f.nextInt();
        int pro=1;
        for(;n>0;n/=10)pro*=n%10;
        System.out.println(pro);
    }
}