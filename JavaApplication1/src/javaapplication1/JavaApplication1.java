package javaapplication1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class JavaApplication1 {
public static void main(String[] args) throws FileNotFoundException, IOException {
    
 //DATA TYPES IN JAVA 
    
    //Data types byte, short, int, long, char, boolean, float, double
//    byte num = 121;
//    short num1 =  11;
//    int num2 = 1111;
//    long num3 = 121L;
//    char character = 'B';
//    boolean bol = true;
//    float nep = 191f;
//    double dob =131;
//    String Name = "Dexonen";
//    System.out.println(nep);
//    System.out.println(Name);

          //Operators
//int age = 18;
//float age1 = 21f;
//    System.out.println(age + age1);
//    System.out.println(age - age1);
//    System.out.println(age * age1);
//    System.out.println(age / age1);
//    System.out.println(age % age1);
//    System.out.println(age++);
//    System.out.println(age1--);
    

//////TALING USER INPUT
//Scanner console = new Scanner (System.in);
//System.out.println("Enter your name :");
//String name = console.nextLine();
//System.out.println("Your bam" + name);

//
//Scanner keyboard = new Scanner(System.in);
//System.out.println("Enter UserName");
//
//String Username = keyboard.nextLine();
//    System.out.println("UserName is :"  +Username );

//Conditional Statements

//Scanner console = new Scanner (System.in);
//System.out.println("Enter The Number Of The Student");
//int num = console.nextInt();
//    if (num){
//(num >= 90)
//    {
//        System.out.println("Grade A ");
//    }
//    else if (num >=80)
//    {
//        System.out.println("Garde B");    
//    }
//    else if (num >=70)
//    {
//        System.out.println("Grade C");
//        
//    }else if (num >=60)
//    {
//        System.out.println("Grade D");
//        
//    } else {
//        System.out.println("FAIL");
//    }

                         //SWITCH CASE
//int day  = 8;
//switch (day){
//    case 1:
//        System.out.println("Monday");
//        break;
//    case 2 :
//        System.out.println("Tuesday");
//        break;
//        case 3 :
//        System.out.println("Wednesday");
//        break;
//        case 4 :
//        System.out.println("Thursday");
//        break;
//        case 5 :
//        System.out.println("Friday");
//        break;
//        case 6 :
//        System.out.println("Saturday");
//        break;
//        case 7 :
//        System.out.println("Sunday");
//        break;
//
//                         
//
//                         
//
//    
//    }

//Scanner console = new Scanner(System.in);
//        System.out.println("Enter Number");
//        int score = console.nextInt();
//       String grade = null;    
//       switch (score /10){
//           case 1:
//               return = "A";
//               break;
//                 case 2:
//               grade = "B";
//               break;
//                 case 3:
//              grade = "C";
//               break;
//                 case 4:
//               grade = "D";
//               break;
//                 case 5:
//               grade = "E";
//               break;
//                 default:
//                     grade = "F";
//                     break;
//                     
//                     //Display
//                     System.out.println("Grade ="  +grade );
//       }

//
                // 
//       Scanner console = new Scanner (System.in);
//        System.out.println("Enter your name");
//      String name = console.nextLine();
//        System.out.println("Enter your Section");
//        String section = console.nextLine();
//        System.out.println("Enter your GPA");
//        int GPA = console.nextInt();
//        System.out.println("NAME :" +name);
//        System.out.println("SECTION :" +section);
//        System.out.println("GPA :" +GPA);
//
//        String Name = "Lukmaan";
//        String Fathername = "Suleman";
//        String City = "Sukkur";
//        String Address = "PECHS";
//        String Nationality = "Pakistani";
//        String stp;
//        String stpp;
//
//        String NamFN = Name.concat(Fathername);
//        System.out.println(NamFN);
//
//        System.out.println(Name.toUpperCase());
//        System.out.println(Address.toLowerCase());
//
//        stpp = Nationality.substring(0, 8);
//        stp = Name.substring(2,7);
//
//     System.out.println("Sub String :" + stp);
//     System .out.println("Substring :" + stpp);    
//
//
//Scanner cu = new Scanner (System.in);
//System.out.println("Enter  First Number");
//int num1  = cu.nextInt();
//System.out.println("Enter  Second Number");
//int num2 = cu.nextInt();
//System.out.println("Enter  Third Number");
//int num3 = cu.nextInt();
File f1=new File("input.txt"); //Creation of File Descriptor for input file
      String [] words=null;    //Intialize the word Array
      int wc=0;     //Intialize word count to zero
      FileReader fr = new FileReader(f1);    //Creation of File Reader object
      BufferedReader br = new BufferedReader(fr);    //Creation of BufferedReader object
      String s;
      while((s=br.readLine())!=null)    //Reading Content from the file
      {
         words=s.split(" ");   //Split the word using space
         wc=wc+words.length;   //increase the word count for each word
      }
      fr.close();
      System.out.println("Number of words in the file:" +wc);    //Print the word count
   }
}

    







