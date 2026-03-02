// // public class forq35 {
// //     public static void main(String[] args) {
// //         int n=1124;
// //         int sum=0;int pro=1;
// //         for(;n>0;n/=10){
// //             int tem =n%10;
// //             sum+=tem;
// //             pro*=tem;

// //         }
// //         System.out.println((pro==sum)?"yes":"no");
// //     }
// // }
// public class forq35 {

//     public static void main(String[] args) {
//         int n=1124;
//         int sum=0;int pro=1;
//         for(;n>0;n/=10){
//             int tem=n%10;
//             sum+=tem;
//             pro*=tem;
//         }
//         System.out.println((sum==pro)?"yes":"no");
//     }
// }
public class forq35 {

    public static void main(String[] args) {
        int n=1124;
        int sum=0;int pro=1;
        for(;n>0;n/=10){
            int tem=n%10;
            sum+=tem;
            pro*=tem;
        }
        System.out.println((sum==pro)?"yes":"no");
    }
}