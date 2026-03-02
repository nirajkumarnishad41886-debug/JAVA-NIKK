// // public class forq38 {
// //     public static void main(String[] args) {
// //         int n=18;
// //         int sum=0;
// //         for(;n>0;n/=10)sum+=n%10;
// //         System.out.println((n%sum)==0?"yes":"ni");
// //     }
// // }

// public class forq38 {
// public static void main(String[] args) {
//     int n=18;
//     int usm=0;
//     for(;n>0;n/=10)usm+=n%10;
//     System.out.println((usm%n==0)?"yes":"no");
// }
    
// }
public class forq38 {

    public static void main(String[] args) {
        int n=18;
        int sum=0;
        for(;n>0;n/=10)sum+=n%10;
        System.out.println((n%sum==0)?"yes":"no");
    }
}