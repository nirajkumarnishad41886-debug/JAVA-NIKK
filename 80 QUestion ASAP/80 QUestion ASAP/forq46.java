// // public class forq46 {
// //     public static void main(String[] args) {
// //         int n=123;
// //         int fordigit=n,digitcout=0;int sum=0;
// //         for(;fordigit>0;fordigit/=10)digitcout++;
// //         for(;n>0;n/=10){
// //             int tem=n%10;
// //             int pro=1;
// //             for(int i=1;i<=digitcout;i++){
// //                 pro*=tem;
// //             }
// //             sum+=pro;
// //         }
// // System.out.println(sum);

// //     }
// // }

// public class forq46 {

//     public static void main(String[] args) {
//         int n=123;
//         int fordigitcount=n,digitcout=0;int sum=0;
//         for(;fordigitcount>0;fordigitcount/=10)digitcout++;
//         for(;n>0;n/=10){
//             int tem=n%10;
//             int pro=1;
//             for(int i=1;i<=digitcout;i++)pro*=tem;
//             sum+=pro;
//         }
//         System.out.println(sum);
//     }
// }
public class forq46 {

    public static void main(String[] args) {
        int n=12;int fordigit=n,digitcout=0,sum=0;
        for(;fordigit>0;fordigit/=10)digitcout++;
        for(;n>0;n/=10){
            int tem=n%10;
            int pro=1;
            for(int i=1;i<=digitcout;i++){
                pro*=tem;
            }
            sum+=pro;
        }
        System.out.println(sum);
    }
}