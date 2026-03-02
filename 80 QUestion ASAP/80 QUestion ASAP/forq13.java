// // import java.util.Scanner;
// // public class forq13{
// //     public static void main(String[] args){
// //         Scanner f = new Scanner(System.in);
// //         int n = f.nextInt();
// //         int rev=0;
// //         for(;n>0;n/=10)rev=rev*10+n%10;
// //         System.out.println(rev);

// //     }
// // }
// import java.util.Scanner;
// public class forq13{
// public static void main(String[] args){
//     Scanner f= new Scanner(System.in);
//     int n = f.nextInt();
//     int rev =0;
//     for(;n>0;n/=10){
//         rev=rev*10+n%10;

//     }
//     System.out.println(rev);
// }
// }
import java.util.Scanner;
public class forq13{
    public static void main(String[] args){
        Scanner f = new Scanner(System.in);
        int n =f.nextInt();
        int rev=0;
        for(;n>0;n/=10)rev=rev*10+n%10;
        System.out.println(rev);
    }
}