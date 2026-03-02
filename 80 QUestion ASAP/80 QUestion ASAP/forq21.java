// // public class forq21 {
// //     public static void main(String[] args) {
// //         int n=10;
// //         int t1=0;int t2=1;
// //         System.out.println(t1+" "+t2+" ");
// //         for(int i=3;i<=n;i++){
// //             int next=t1+t2;
// //             System.out.print(next+" ");
// //             t1=t2;
// //             t2=next;

// //         }
// //     }
    
// // }
// public class forq21 {

//     public static void main(String[] args) {
//         int n=10;
//         int t1=0;int t2=1;
//         System.out.println(t1+" "+t2+" ");
//         for(int i=1;i<=n;i++){
//             int next=t1+t2;
//             System.out.println(next+" ");
//             t1=t2;t2=next;
//         }
//     }
// }
public class forq21 {

    public static void main(String[] args) {
        int n=10;
        int t1=0;int t2=1;
        System.out.println(t1);
        System.out.println(t2);
        for(int i=3;i<=n;i++){
            int next = t1+t2;
            System.out.println(next);
            t1=t2;t2=next;
        }
    }
}