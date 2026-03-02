// // import java.util.Scanner;
// // public class ifq19{
// //     public static void main(String[] args){
// //         Scanner f = new Scanner(System.in);
// //         int n= f.nextInt();
// //         if(n>60){System.out.println("first division");}
// //         else if (n>50){System.out.println("second division");}
// //         else if (n>40){System.out.println("third division");}
// //         else {System.out.println("fail");}
// //     }
// // }

// import java.util.Scanner;
// public class ifq19{
// public static void main(String[] args){
//     Scanner f = new Scanner(System.in);
//     int n = f.nextInt();
//     if(n>60){System.out.println("first");}
//     else if (n>50){
//         System.out.println("second");
//     }
//     else if (n>40){System.out.println("third");}
//     else {System.out.print("fail");}
// }}

import java.util.Scanner;

public class ifq19 {
    public static void main(String[] args) {
        Scanner f = new Scanner(System.in);
        int n = f.nextInt();
        if (n > 60) {
            System.out.println("First");
        } else if (n > 50) {
            System.out.println("sectond ");
        } else if (n > 40) {
            System.out.println("third");
        } else {
            System.out.println("fail");
        }
    }

}