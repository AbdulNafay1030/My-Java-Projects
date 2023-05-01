package homeworktasks;

import java.util.Scanner;                  
import java.util.ArrayList;

class homeworktasks
{
    public static void main(String args[])
    {
        ArrayList<String> People = new ArrayList<String>();
        People.add("Abdul Nafay");
        People.add("Nek Muhammad");
        People.add("Nabeel Ahmed");
        People.add("Nelson Mandela");
        System.out.println("ArrayList Elements: " + People);
        int largestString = People.get(0).length();
        int index = 0;

        for(int i = 0; i < People.size(); i++)
        {
            if(People.get(i).length() > largestString)
            {
                largestString = People.get(i).length();
                                index = i;
            }
        }
        System.out.println("Index " + index + " "+ People.get(index) + " " + "is the largest string and is size " + largestString);  

    }

}