// // import java.util.Scanner;
// // public class ifq8 {
// //     public static void main(){
// //         Scanner f = new Scanner(System.in);
// //         int cost = f.nextInt();
// //         int sell= f.nextInt();
// //         if(sell>cost)System.out.print(sell-cost+" profit");
// //         else System.out.println("loss");
    
// //     }

    
// // }
// import java.util.Scanner;
// public class ifq8{
//     public static void main(){
//         Scanner f = new Scanner(System.in);
//         int cost = f.nextInt();
//         int sell = f.nextInt();
//         int t=sell-cost;
//         int k=cost-sell;
//         k=k*2-k;
//         if(sell > cost ){System.out.println("profit of "+t );}
//         else {System.out.println("loss of "+k);}
//     }
// }
import java.util.Scanner;
public static void main(){
    Scanner s = new Scanner(System.in);
    int cost = s.nextInt();
    int sell = s.nextInt();
    int t=(cost-sell)*2-(cost-sell);
    if(cost>sell){
        System.out.println("loss"+t);
    }
    else{
        int l = sell-cost;
        System.out.println("profit of "+l);
    }
}