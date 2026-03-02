// // import java.util.Scanner;
// // public class ifq21{
// //     public static void main(String[] args){
// //         Scanner f = new Scanner(System.in);
// //         int n = f.nextInt();
// //         if(n<12){System.out.print("GM");}
// //         else if(n<18)System.out.print("GE");
// //         else System.out.println("GN");


// //     }
// // }
// import java.util.Scanner;
// public class ifq21{
//     public static void main(String[] args){
//     Scanner f = new Scanner(System.in);
//     int n = f.nextInt();
//     if(n<=12){System.out.print("Gm");}
//     else if(n<=18)System.out.print("GA");
//     else System.out.print("GN");
    
// }}
import java.util.Scanner;
public class ifq21{
    public static void main(String[] args){
        Scanner f = new Scanner(System.in);
        int n= f.nextInt();
        if(n<=12)System.out.print("GM");
        else if(n<18)System.out.println("GA");
        else {System.out.print("GN");}
    }
}