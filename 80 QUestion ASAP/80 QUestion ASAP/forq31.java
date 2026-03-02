// // import  java.util.Scanner;
// // public class forq31 {

// //     public static void main(String[] args){
// //         Scanner f=new Scanner(System.in);
// //         int n=f.nextInt();
// //         int digitCount=0;int fordigitcout=n;
// //         int sum=0;int check=n;
// //         for(;fordigitcout>0;fordigitcout/=10){
// //             digitCount++;
// //         }
// //         for(int i=1;n>0;n/=10,i++){
// //             int tem = n%10;
// //             int pro=1;
// //             for(int j=1;j<=digitCount;j++){
// //                 pro*=tem;
// //             }
// //             sum+=pro;


// //         }
// //         System.out.println((check==sum)?"yes":"no");

// //     }
// // }
// import java.util.Scanner;
// public class forq31 {

//     public static void main(String[] args) {
//         Scanner f =new  Scanner(System.in);
//         int n=f.nextInt();
//         int digitCount=0,fordigitcout=n,check=n;
//         int sum=0;
//         for(;fordigitcout>0;fordigitcout/=10){
//             digitCount++;
//         }
//         for(;n>0;n/=10){
//             int tem=n%10;
//             int pro=1;
//             for(int j=1;j<=digitCount;j++)pro*=tem;
//             sum+=pro;
//         }
//         System.out.println((check==sum)?"yes":"no");
//     }
// }
import java.util.Scanner;
public class forq31 {

    public static void main(String[] args) {
        Scanner f=new Scanner(System.in);
        int n=f.nextInt();
        int fordigitcount=n,digitCount=0,check=n,sum=0;
        for(;fordigitcount>0;fordigitcount/=10)digitCount++;
        for(;n>0;n/=10){
            int tem=n%10;
            int pro=0;
            for(int j=1;j<=digitCount;j++)pro*=tem;
            sum+=pro;
        }
        System.out.println((check==sum)?"yes":"no");


    }
}