


//    public static void main(String[] args) {
//        int tries = 0;
//
//        boolean iterated = false;
//        String temp = "";
//        String holder = "";
//
//        Scanner keyboard = new Scanner(System.in);
//        System.out.println("Enter your secret word:");
//        String word = keyboard.nextLine();
//
//        do {
//            System.out.println("Enter your letter guess");
//            String guess = keyboard.nextLine();
//
//            for(int i = 0; i < word.length(); i ++) {
//                if (guess.equals(Character.toString(word.charAt(i)))) {
//                    if(!iterated)
//                        temp += Character.toString(word.charAt(i));
//                    else {
//                        holder = Character.toString(temp.charAt(i)).replace("-", guess);
//                        temp = temp.substring(0, i) + holder + temp.substring( i + 1, temp.length());
//                    }
//                } else {
//                    if(!iterated) {
//                        temp += "-";
//                    }
//                }
//            }
//            tries++;
//            iterated = true;
//            System.out.println(temp);
//            if(temp.equals(word)) {
//                System.out.println("You guessed correctly!");
//                break;
//            }
//        }while (tries < 10);
//
//    }
//}

package labtasks;


import java.io.*;

import java.util.Scanner;

public class LabTasks {

public static void main(String[] args) {

File f;

String c;

char d;

int words = 0;

Scanner sc = new Scanner(System.in);

try{

f=new File("E:/names.txt");

InputStream is = new FileInputStream(f);

int size = is.available();

String str[] = new String[size];

System.out.print("Data in file1 : ");

for(int i= 0 ;i<size;i++){

d = (char)is.read();

str[i] = Character.toString(d);

if(" ".equals(str[i])){

words++;

}

System.out.print(d);

}

System.out.println("\nNumber of words in file : "+(words+1));

}catch(Exception e){ System.out.println("Either file not exist or Error is found!");

}}}
