// import  java.util.Scanner;
// public class ifq26{
//     public static void main(String[] args){
//         Scanner f = new Scanner(System.in);
//         double income= f.nextDouble();
//         double tax=0;
//         if(income<250000)tax=0;
//         else if (income<500000)tax=2500000*0+(income-2500000)*0.05;
//         else  tax=250000*0+(income-2500000)*0.05+(income-5000000)*0.03;

//         System.out.print(tax);
//     }

// }
// import java.util.Scanner;
// public class ifq26{
//     public static void main(String[] args){
//         Scanner f = new Scanner(System.in);
//         double income=f.nextDouble();
//         double tax=0;
//         if(income<250000)tax=0;
//         else if (income<500000)tax=250000*0+(2500000-income)*.5;
//         else  tax= 250000*0+(income-250000)*.05+(income-5000000)*.02;
//     }
// }
import java.util.Scanner;

public class ifq26{
    public static void main(String[] args){
        Scanner f  = new Scanner(System.in);
        double income = f.nextDouble();
        double tax=0;
        if(income<250000)tax=0;
        else  if (income<500000)tax=250000*0+(income-250000)*.5;
        else tax = 250000*0+(income-250000)*.5+(income-500000)*2;
        System.out.println(tax);
    }
}
