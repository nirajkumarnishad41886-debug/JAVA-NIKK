// // public class forq42 {

// //     public static void main(String[] args) {
// //         int n=1912316;
// //         int max=0;
// //         for(;n>0;n/=10){
// //             if(n%10>max)max=n%10;
// //         }
// //         System.out.println(max);
// //     }
// // }
// public class forq42 {

//     public static void main(String[] args) {
//         int n=12138;
//         int max=0;
//         for(;n>0;n/=10){
//             if(n%10>=max)max=n%10;
//         }
//         System.out.println(max);
//     }
// }
public class forq42 {

    public static void main(String[] args) {
        int n=123134;
        int max=0;
        for(;n>0;n/=10){
            if(n%10>=max)max=n%10;
        }
        System.out.println(max);
    }
}