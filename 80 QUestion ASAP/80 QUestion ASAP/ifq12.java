// // import java.util.Scanner;
// // public class ifq12{
// // public static void main(){
// //     Scanner aa = new Scanner(System.in);
// //     int n = aa.nextInt();
// //     if(n>90)System.out.println("a");
// //     else if (n>75)System.out.println('B');
// //     else if (n>50)System.out.println("C");
// //         else{System.out.println("fail");}

// // }}
// import java.util.Scanner;
// public class ifq12{
//     public static void main(String[] args){
//         Scanner f = new Scanner(System.in);
//         int n = f.nextInt();
//         if(n>90){System.out.println("A");}
//         else if(n>75)System.out.println("B");
//         else if(n>50){
//             System.out.println("C");
//         }
//         else{
//             System.out.print("fail");
//         }
//     }
// }
import java.util.Scanner;
public class ifq12{
    public static void main(String[] args){
        Scanner f = new Scanner(System.in);
        int n = f.nextInt();
        if(n>90)System.out.print("A");
        else if(n>75){System.out.println("B");}
        else if(n>50){System.out.println("C");}
        else {System.out.println("FAIL");}
    }
}
