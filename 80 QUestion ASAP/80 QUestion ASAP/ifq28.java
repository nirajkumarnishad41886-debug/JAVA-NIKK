// // import java.util.Scanner;
// // public class ifq28 {
// //     public static void main(String[] args) {
// //         Scanner f= new Scanner(System.in);
// //         int per =f.nextInt();
// //         int sal =f.nextInt();
// //         if(per>85 && sal<30000)System.out.println("full solacalaur");
// //         else if(per>75 && sal<50000)System.out.println("half");
// //         else System.out.println("no");

// //     }
    
// // }
// import java.util.Scanner;
// public class ifq28 {
//     public static void main(String[] args) {
//         Scanner f =new Scanner(System.in);
//         int per =f.nextInt();
//         int sal = f.nextInt();
//         if(per>85 && sal<30000)System.out.println("full");
//         else if(per >75 && sal<50000)System.out.println("half");
//         else{System.out.println("no");}
//     }
    
// }
import java.util.Scanner;
public class ifq28 {

    public static void main(String[] args) {
        Scanner f =new Scanner(System.in);
        int per =f.nextInt();
        int sal = f.nextInt();
        if(per>85 && sal<30000)System.out.println("full");
        else if(per <75 && sal<50000)System.out.println("half");
        else System.out.println("no");
    }
}