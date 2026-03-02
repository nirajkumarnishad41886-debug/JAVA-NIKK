// // import  java.util.Scanner;
// // public class ifq30{
// // public static void main(String[] args){
// //     Scanner f = new Scanner(System.in);
// //     int a = f.nextInt();
// //     int b = f.nextInt();
// //     int c =f.nextInt();
// //     int d = b*b-4*a*c;
// //     if (d>0)System.out.print("TWO disticnt root");
// //     else if (d==0)System.out.println("Two equal root");
// //     else {System.out.print("no root");}



// // }}
// import java.util.Scanner ;
// public class ifq30{
//     public static void main(String[] args){
//         Scanner f =new Scanner(System.in);
//         int a =f.nextInt();
//         int b= f.nextInt();
//         int c = f.nextInt();
//         int d= b*b-4*a*c;
//         if(d>0){System.out.print("TWO DIstinck root");}
//         else  if (d==0){System.out.print("two equal root");}
//         else {
//             System.out.print("no rooot");
//         }
//     }
// }

import java.util.Scanner;
public class ifq30{
    public static void main(String[] args){
        Scanner gf = new Scanner(System.in);
        int a = gf.nextInt();
        int b = gf.nextInt();
        int c= gf.nextInt();
        int d= b*b-4*a*c;
        if(d==0){System.out.print("equal root");}
        else if (d>0){System.out.print("distint root ");}
        else{
            System.out.println("no root");
        }

    }
}