// // import java.util.Scanner ;
// // public class forq18{
// //     public static void main(String[] args){
// //     Scanner f = new Scanner(System.in);
// //     int n1=f.nextInt();
// //     int n2=f.nextInt();

// //     int i=0;
// //     if(n1>n2)i=n1;else{i=n2;}
// //    int r=1;
// //     for(;;i++){
// //         if(i%n1==0 && i%n2==0){
// //             r=i;
// //             break;

// //         }
        
// //     } 
// //     System.out.println(r);
// // }}
import java.util.Scanner;
public class forq18{
    public static void main(String[] args){
        Scanner f= new Scanner(System.in);
        int n1=f.nextInt();
        int n2=f.nextInt();
        int max=Math.max(n1,n2);
        for(;;max++){
            if(max%n1==0 && max%n2==0){
                System.out.println(max);
                break;
            }
        }
    }
}

