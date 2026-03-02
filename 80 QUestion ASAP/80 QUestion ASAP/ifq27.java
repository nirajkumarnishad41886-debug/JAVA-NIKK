// // import java.util.Scanner;
// // public class ifq27{
// //     public static void main(String[] args){
// //         Scanner f = new Scanner(System.in);
// //         System.out.print("enter age :");
// //         int age = f.nextInt();
// //         System.out.print("enter salaray");
// //         int sal = f.nextInt();
// //         System.out.print("enter score");
// //         int score = f.nextInt();
// //         if(age>18 && age<60 && sal>25000 && score>700){
// //             System.out.print("ok");
// //         }else{
// //             System.out.print("no");
// //         }
// //     }
// // }
// import  java.util.Scanner;
// public class ifq27{
//     public static void main(String[] args){
//         Scanner f =new Scanner(System.in);
//         System.out.print("Enter age");
//         int age = f.nextInt();
//         System.out.print("Enter salary");
//         int sal = f.nextInt();
//         System.out.print("Enter score");
//         int score = f.nextInt();
//         if(18<age && 60>age && sal>25000 && score>700){
//             System.out.print("yes");
//         } else{
//             System.out.print("no");
//         }
//     }
// }

import java.util.Scanner;
public class ifq27{
    public static void main(String[] args){
        Scanner f = new Scanner(System.in);
        System.out.print("enter age : ");
        int age = f.nextInt();
        System.out.print("enter sal");
        int sal = f.nextInt();
        System.out.print("enter sacre");
        int score = f.nextInt();
        System.out.print((18<age && 60>age && sal>25000 && score>700 )?"yes":"no");


    }
}