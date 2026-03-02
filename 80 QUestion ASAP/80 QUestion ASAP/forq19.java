// // import java.util.Scanner;
// // public class forq19{
// // public static void  main(String[] args){
// //     Scanner f = new Scanner(System.in);
// //     int sum=0;
// //     int m = f.nextInt();
// //     for(int i=1;i<m;i++){
// //         if(m%i==0)sum+=i;
// //     }
// //     System.out.println((m==sum)?"YES":"NO");

// // }
// // } 
// import java.util.Scanner;
// public class forq19{
//     public static void main(String[] args){
//         Scanner f = new Scanner(System.in);
//         int n=f.nextInt();
//         int sum =0;
//         for(int i=1;i<n;i++)if(n%i==0)sum+=i;
//         System.out.println((sum==n)?"yes":"no");
//     }
// }
import java.util.Scanner;
public class forq19{
    public static void main(String[] args){
        Scanner  f =new Scanner(System.in);
        int n=f.nextInt();int sum=0;
        for(int i=1;i<n;i++)if(n%i==0)sum+=i;
        System.out.println((sum==n)?"yes":"no");
    }
}