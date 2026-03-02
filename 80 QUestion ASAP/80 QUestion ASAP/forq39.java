// // public class forq39 {
// //         public static void main(String[] args) {
// //             root k= new root();
            
// //             int n=56;
            
// //             for(;n>10;){
// //                 n=k.um(n); 
                          
                
// //             }
// //             System.out.println(n);

// //         }
// // }

// // class root{
    
// //     int um(int n){
// //         int sum=0;
// //         for(;n>0;n/=10)sum+=n%10;
// //         return sum;
// //     }
// // }
// public class forq39 {

//     public static void main(String[] args) {
//         sum l=new sum();
//         int n=457;
//         for(;n>10;){
//             n=l.sum(n);
//         }System.out.println(n);
//     }
// }
// class sum{
//     int sum(int n){
//         int sum=0;
//         for(;n>0;n/=10)sum+=n%10;
//         return sum;
//     }
// }
public class forq39 {

    public static void main(String[] args) {
        sum l=new sum();
        int n=987;
        for(;n>10;)n=l.sum(n);
        System.out.println(n);
    }

}
class sum{
    int sum(int n){
        int sum=0;
    
        for(;n>0;n/=10)sum+=n%10;
        return sum;
    }
}