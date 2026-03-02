// // public class forq33 {

// //     public static void main(String[] args) {
// //         long a=1000;
// //         int base=1,sum=0;
// //         for(;a>0;a/=10){
// //             int tem =(int)a%10;
// //             tem*=base;
// //             sum+=tem;
// //             base*=2;


// //         }
// //         System.out.println(sum);
// //     }
// // }
// public class forq33 {
//     public static void main(String[] args) {
//         long a=111111;
//         int base=1;
//         int sum=0;
//         for(;a>0;a/=10){
//             int tem=(int)a%10;
//             sum+=tem*base;
//             base*=2;
        
//         }
//         System.out.println(sum);
//     }
    
// }
public class forq33 {

    public static void main(String[] args) {
        long a = 101010111;
        int sum=0;int base=1;
        for(;a>0;a/=10){
            int tem=(int)a%10;
            sum+=tem*base;
            base*=2;
        }
        System.out.println(sum);
    }
}