// // public class forq37 {

// //     public static void main(String[] args) {
// //         int n=125;
// //         int sq=n*n;
// //         int c=0;
// //         for(;n>0;n/=10,sq/=10){
// //             if(n%10==sq%10){
               
// //                 c++;
// //             }else{
// //                 break;
// //             }
// //         }
// //         System.out.println((c>0)?"yes":"no");
// //     }
// // }
// public class forq37 {

//     public static void main(String[] args) {
//         int n=25;
//         int sq=n*n;
//         int c=0;
//         for(;n>0;sq/=10,n/=10){
//             if(n%10==sq%10){
//                 c++;

//             }else{
//                 break;
//             }
//         }
//         System.out.println((c>0)?"yes":"no");
//     }
// }
public class forq37 {

    public static void main(String[] args) {
        int n=112;
        int sq=n*n;
        int c=0;
        for(;n>0;n/=10,sq/=10){
            if(n%10==sq%10){
                c++;
            }else{
                break;
            }
        }
        System.out.println((c>0)?"yes":"no");
    }
}