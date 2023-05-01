/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filewordcount;
//import java.io.*;
//
//import java.util.Scanner;
//
//public class FileWordCount {
//
//public static void main(String[] args) {
//
//File f;
//
//File f2;
//
//char c,d,g;
//
//Scanner sc = new Scanner(System.in);
//
//System.out.print("Enter initial letter to search for : ");
//
//char v = sc.next().charAt(0);
//
//try{
//
//f=new File("E:/names.txt");
//
//f2=new File("E:/newnames.txt");
//
//InputStream is = new FileInputStream(f);
//
//InputStream iss = new FileInputStream(f2);
//
//OutputStream oss = new FileOutputStream(f2);
//
//int size = is.available();
//
//char str[] = new char[size];
//
//System.out.print("Names in file1 : ");
//
//for(int i= 0 ;i<size;i++){
//
//c = (char) is.read();
//
//System.out.print(c);
//
//str[i] = (char) c ;
//
//}
//
//System.out.println("");
//
//for(int k = 0 ; k<size ; k++){
//
//if(str[k] == v){
//
//for(int j = 0; j < 6 ; j++){
//
//oss.write(str[j]);
//
//}
//
//}}
//
//int size2 = iss.available();
//
//System.out.print("Names in file2 : ");
//
//for(int k = 0;k<size2;k++){
//
//g = (char) iss.read();
//
//System.out.print(g);
//
//}}catch(Exception e){ System.out.println("Either file not exist or Error is found!");
//
//}
//
//}}
import java.io.*;
import java.util.Scanner;
 public class FileWordCount 
public static void main(String[] args) throws IOException; 
FileInputStream f = newFileInputStream("D:\\MY GADGETS\\Names.txt");
DataInputStream df =new DataInputStream(f);
int i=0;
char in;
Scanner sc = new Scanner(System.in);
in = sc.next().charAt(0);
while((i=df.read())!=-1) {
if(in==(char)i) {
System.err.print((char)i);}
else System.out.print((char)i);
}}}
