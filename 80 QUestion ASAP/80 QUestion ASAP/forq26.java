// // public class forq26 {
// //     public static void main(String[] args) {
// //         int n=10;
// //         int a=0,b=1,c=1;
// //         System.out.print(a+" "+b+" "+c+" ");
// //         for(int i=4;i<=n;i++){
// //             int nxt=a+b+c;
// //             System.out.print(nxt+" ");
// //             a=b;b=c;c=nxt;
// //         }

// //     }
// // }
// public class forq26 {

//     public static void main(String[] args) {
//         int n=1;
//         int a=0,b=1,c=1;
//         System.out.println(a+" "+b+" "+c);
//         for(int i=4;i<=8;i++){
//             int t=a+b+c;
//             System.out.print(" "+t);
//             a=b;b=c;c=t;
//         }
//     }
// }
public class forq26 {

    public static void main(String[] args) {
        int a=0,b=1,c=1;
        System.out.println(a+" "+b+" "+c);
        for(int i=4;i<=10;i++){
            int tem=a+b+c;
            System.out.println(tem);
            a=b;
            b=c;
            c=tem;
        }

    }
}