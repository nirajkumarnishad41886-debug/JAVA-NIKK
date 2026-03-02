// // public class forq36 {
// //     public static void main(String[] args) {
// //         int n=9;
// //         int sq=n*n;
// //         int sum=0;
// //         for(;sq>0;){
// //             sum+=sq%10;sq/=10;
// //         }
// //         System.out.println((sum==n)?"neom":"no");
// //     }
// // }

// public class forq36 {

//     public static void main(String[] args) {
//         int n=9;
//         int sq=n*n;
//         int sum=0;
//         for(;sq>0;){
//             sum+=sq%10;
//             sq/=10;
//         }
//         System.out.println((sum==n)?"neom":"no");
    
    
//     }
// }
public class forq36 {

    public static void main(String[] args) {
        int n=9;int sq=n*n;
        int sum=0;
        for(;sq>0;){
            sum+=sq%10;
            sq/=10;
        }
        System.out.println(sum);
    }
}