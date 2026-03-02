// // import java.util.Scanner;
// // public class ifq29 {
// //     public static void main(String[] args) {
// //         Scanner f =new Scanner(System.in);
// //         String s = f.nextLine();
// //         if((s.length()>=8)&& s.matches(".*[A-Z].*") && s.matches(".*[a-b].*")&& s.matches(".*[0-9].*"))
// //             System.out.println("strong");
// //         else System.out.println("weak");


// //     }
// // }
// import java.util.Scanner;

// public class ifq29{
//     public static void main(String[] args) {
//         Scanner f =new Scanner(System.in);
//         String s =f.nextLine();
//         if(s.length()>=8 && s.matches(".*[A-B].*") && s.matches(".*[a-b].*") && s.matches(".*[0-9].*"))
// System.out.println("strong");
//         else  System.out.println("waek");
//     }
// }
import java.util.Scanner;
public class ifq29 {
public static void main(String[] args) {
    Scanner f =new  Scanner(System.in);
    String s =f.nextLine();
    if(s.length()>=8 && s.matches(".*[A-Z].*") && s.matches(".*[a-z].*") && s.matches(".*[0-9].*"))System.out.println("strng");
    else System.out.println("weak");
 }
    
}