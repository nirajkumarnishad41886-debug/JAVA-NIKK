// // public class forq40 {
// //     public static void main(String[] args) {
// //         int n=2012;
// //         int b=20012;int c=0;
// //         for(int i=n;i<=b;i++){
// //             if((i%400==0)||(i%4==0 && i%100!=0))c++;
// //         }
// //         System.out.println(c);
// //     }
    
// // }
// public class forq40 {

//     public static void main(String[] args) {
//         int a=2000;
//         int b=2021;int c=0;
//         for(int i=a;i<=b;i++){
//             if((i%400==0)||(i%100!=0 && i%4==0))c++;

//         }
//         System.out.println(c);
//     }
// }
public class forq40 {

    public static void main(String[] args) {
        int a=2000;int b =2012;
        int c=0;
        for(int i=a;i<=b;i++){
            if((i%400==0)||(i%4==0 || i%100!=0))c++;
        }
        System.out.println(c);
    }
}