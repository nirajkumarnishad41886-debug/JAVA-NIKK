// // public class forq47 {
// //     public static void main(String[] args) {
// //         int a=10;int b=20;
// //         p p =new p();
// //         for(int i=a;i<=b;i++)p.prime(i);
       
// //     }
// // }
// // class p{
// //     boolean prime(int n){
// //         int sum=0;
// //         for(int i=1;i<=n;i++){
// //             if(n%i==0)sum++;

// //         }
// //         if (sum==2){System.out.print(" "+n); return true;}
// //         else return false;



// //     }
// // }

// public class forq47 {

//     public static void main(String[] args) {
//         int a=13;int b=25;
//         p p=new p();
//         for(int i=a;i<=b;i++)p.p(i);
//     }
// }
// class p{
//     boolean p(int n){int c=0;
//         for(int i=1;i<=n;i++){
//             if(n%i==0){
//                 c++;
//             }
//         }
//         if(c==2){
//             System.out.println(n);return true;
//         }else{
//             return false;
//         }
//     }
// }
public class forq47 {

    public static void main(String[] args) {
        int a=10;int b=20;
        p p = new p();
        for(int i=1;i<=b;i++)p.prime(i);
    }
}
class p{
    void prime(int n){
        int c=0;
        for(int i=1;i<=n;i++){
            if(n%i==0)c++;
        }
        if(c==2)System.out.println(n);
        
    }

}