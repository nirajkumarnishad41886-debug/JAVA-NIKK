// // import java.util.Scanner;
// // public class ifq11{
// //     public static void main(String[] args){
// //         Scanner aa =new Scanner(System.in);
// //         int a=aa.nextInt();
// //         int b= aa.nextInt();
// //         int c = aa.nextInt();
// //         if(a>b){if(a>c)System.out.println("a");else{System.out.println("c");}}
// //         else if(b>c)System.out.print("b");else{System.out.print("c");}
// //     }
// // }
// import java.util.Scanner;
// public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);
//     int a = sc.nextInt();
//     int b= sc.nextInt();
//     int c = sc.nextInt();
//     if(a>b){
//         if(a>c)System.out.print("A");
//         else {System.out.print("C");}
//     }
//     else if(b>c){System.out.println("b");}
//     else{System.out.println("c");}
// }
import java.util.Scanner;
public class ifq11{
    public static void main(){
    Scanner sc = new Scanner(System.in);
    int a =sc.nextInt();
    int b = sc.nextInt();
    int c= sc.nextInt();
    if(a>b){
        if(a>c){
            System.out.println("A");
        }else{
            System.out.println("C");
        }
    }
    else if(b>c){System.out.println("B");}
    else{System.out.println("C");}
    }
}