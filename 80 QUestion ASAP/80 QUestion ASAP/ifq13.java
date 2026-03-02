// // import java.util.Scanner;
// // public class ifq13 {
// //     public static void main(String[] args){
// //         Scanner s = new Scanner(System.in);
// //         int n = s.nextInt();
// //         if(n>100){
// //             System.out.println(n*5);
// //         }else{
// //             System.out.println(100*2+(100-n)*10);
// //         }
        
// //     }
    
// // }
// import java.util.Scanner;
// public class ifq13{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n= sc.nextInt();
//         if(n<100){
//             System.out.println(n*2);
//         }else{
//             System.out.println(n*2+(n-100)*10);
//         }
//     }
// }
import java.util.Scanner;
public class ifq13{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        if(a<100){
            System.out.println(a*5);
            
        }
        else{
            System.out.println(100*5+(100-a)*10);
        }
    }
}