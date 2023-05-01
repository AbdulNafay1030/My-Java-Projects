
//import java.util.Scanner;
//
//public class LabHomeTasks {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//       System.out.println("Enter Number");
//       int number = sc.nextInt();
//        int sum = addNumbers(number);
//        System.out.println("Sum = " + sum);
//    }
//
//    public static int addNumbers(int num) {
//        if (num != 0)
//            return num + addNumbers(num - 1);
//        else
//            return num;
//    }
//}


///////////////////////////////////////////////////////////HOMEWORK TASK 1 LAB # 03/////////////////////////////////////////////////////////


//import java.util.Scanner;
//public class LabHomeTasks{
//public static void main(String arg[]) {
//int n,sum=0;
//Scanner sc=new Scanner(System.in);
//System.out.print("ENTER THE QUANTITY OF NUMBERS YOU WANT TO SUM :");
//n=sc.nextInt();
//int a[]=new int[n];
//System.out.println("ENTER THE "+n+" NUMBERS "); for(int i=0;i<n;i++)
//{
//System.out.print("ENTER NUMBER"+(i+1)+" : ");
//a[i]=sc.nextInt(); } for(int i=0;i<n;i++) {
// sum+=a[i]; }
//System.out.println("SUM OF "+n+" NUMBER IS = "+sum); }}



///////////////////////////////////////////////////////////HOMEWORK TASK 2 LAB # 03/////////////////////////////////////////////////////////
//import java.util.Scanner;
//public class LabHomeTasks{
//private static Scanner sc;
//public static void main(String[] args) { 
// int Number, Count=0;
//sc = new Scanner(System.in); 
//System.out.print("ENTER NUMBERS : "); 
//Number = sc.nextInt();
//while(Number > 0) {
//Number = Number / 10;
//Count = Count + 1;
//}
//System.out.println("THE COUNT OF DIGITS ARE :" + Count);
//    }
//}