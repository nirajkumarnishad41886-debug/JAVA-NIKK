// // public class forq49 {
// //     public static void main(String[] args) {
// //         int n=100;
// //         int oct=0;
// //         int place=1;
// //         for(;n>0;n/=8){
// //             oct+=(n%8)*place;
// //             place *=10;
// //         }
// //         System.out.println(oct);
// //     }
// // }
// public class forq49 {

//     public static void main(String[] args) {
//         int n=100;
//         int oct=0;int place=1;
//         for(;n>0;n/=8){
//             oct+=(n%8)*place;
//             place*=10;
//         }
//         System.out.println(oct);
//     }
// }
public class forq49 {

    public static void main(String[] args) {
        int n=100;
        int oct =0;
        int place=1;
        for(;n>0;n/=8){
            oct+=(n%8)*place;
            place*=10;
        }
        System.out.println(oct);
    }
}