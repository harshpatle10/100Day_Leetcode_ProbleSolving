package leetcodeQ.AfterExam;
/*
* Input: rings = "B0B6G0R6R0R6G9"
Output: 1
Explanation:
- The rod labeled 0 holds 3 rings with all colors: red, green, and blue.
- The rod labeled 6 holds 3 rings, but it only has red and blue.
- The rod labeled 9 holds only a green ring.
Thus, the number of rods with all three colors is 1.*/

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class A2103 {
    public static void main(String[] args) {
       String rings = "G3R3R7B7R5B1G8G4B3G6";
             int count=0;
               String str ="";
               String str1 ="";
               String str2 ="";
               String str3 ="";
               String str4 = "";
               String str5 ="";
               String str7 ="";
             String str8 ="";
               String str9 = "";
               String str6 = "";
       for(int i=0;i<rings.length();i=i+2)
       {

           if(String.valueOf(rings.charAt(i+1)).equalsIgnoreCase("0"))
           {
               if(String.valueOf(rings.charAt(i)).equalsIgnoreCase("G"))
               {
                   str =str.concat("G");
               }
              else if (String.valueOf(rings.charAt(i)).equalsIgnoreCase("B")){
                   str =str.concat("B");
               }
               else{
                   str =str.concat("R");
               }

           }
           else    if(String.valueOf(rings.charAt(i+1)).equalsIgnoreCase("2"))
           {
               if(String.valueOf(rings.charAt(i)).equalsIgnoreCase("G"))
               {
                   str2 =str2.concat("G");
               }
               else if (String.valueOf(rings.charAt(i)).equalsIgnoreCase("B")){
                   str2 =str2.concat("B");
               }
               else {
                   str2 =str2.concat("R");
               }

           }
           else    if(String.valueOf(rings.charAt(i+1)).equalsIgnoreCase("3"))
           {
               if(String.valueOf(rings.charAt(i)).equalsIgnoreCase("G"))
               {
                   str3 =str3.concat("G");
               }
               else if (String.valueOf(rings.charAt(i)).equalsIgnoreCase("B")){
                   str3 =str3.concat("B");
               }
               else {
                   str3 =str3.concat("R");
               }

           }
           else    if(String.valueOf(rings.charAt(i+1)).equalsIgnoreCase("4"))
           {
               if(String.valueOf(rings.charAt(i)).equalsIgnoreCase("G"))
               {
                   str4=str4.concat("G");
               }
               else if (String.valueOf(rings.charAt(i)).equalsIgnoreCase("B")){
                   str4 =str4.concat("B");
               }
               else {
                   str4 =str4.concat("R");
               }

           }
           else    if(String.valueOf(rings.charAt(i+1)).equalsIgnoreCase("5"))
           {
               if(String.valueOf(rings.charAt(i)).equalsIgnoreCase("G"))
               {
                   str5 =str5.concat("G");
               }
               else if (String.valueOf(rings.charAt(i)).equalsIgnoreCase("B")){
                   str5 =str5.concat("B");
               }
               else {
                   str5=str5.concat("R");
               }

           }
           else    if(String.valueOf(rings.charAt(i+1)).equalsIgnoreCase("7"))
           {
               if(String.valueOf(rings.charAt(i)).equalsIgnoreCase("G"))
               {
                   str7 =str7.concat("G");
               }
               else if (String.valueOf(rings.charAt(i)).equalsIgnoreCase("B")){
                   str7 =str7.concat("B");
               }
               else {
                   str7 =str7.concat("R");
               }

           }
           else    if(String.valueOf(rings.charAt(i+1)).equalsIgnoreCase("8"))
           {
               if(String.valueOf(rings.charAt(i)).equalsIgnoreCase("G"))
               {
                   str8 =str8.concat("G");
               }
               else if (String.valueOf(rings.charAt(i)).equalsIgnoreCase("B")){
                   str8 =str8.concat("B");
               }
               else {
                   str8 =str8.concat("R");
               }

           }
        else    if(String.valueOf(rings.charAt(i+1)).equalsIgnoreCase("1"))
           {
               if(String.valueOf(rings.charAt(i)).equalsIgnoreCase("G"))
               {
                   str1 =str1.concat("G");
               }
              else if (String.valueOf(rings.charAt(i)).equalsIgnoreCase("B")){
                   str1 =str1.concat("B");
               }
               else {
                   str1 =str1.concat("R");
               }

           }
         else   if(String.valueOf(rings.charAt(i+1)).equalsIgnoreCase("9"))
           {
               if(String.valueOf(rings.charAt(i)).equalsIgnoreCase("G"))
               {
                   str9 =str9.concat("G");
               }
              else if (String.valueOf(rings.charAt(i)).equalsIgnoreCase("B")){
                   str9 =str9.concat("B");
               }
               else {
                   str9 =str9.concat("R");
               }

           }
          else
           {
               if(String.valueOf(rings.charAt(i)).equalsIgnoreCase("G"))
               {
                   str6 =str6.concat("G");
               }
              else if (String.valueOf(rings.charAt(i)).equalsIgnoreCase("B")){
                   str6 =str6.concat("B");
               }
               else {
                   str6 =str6.concat("R");
               }

           }

       }
        System.out.println(str);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str5);
        System.out.println(str6);
        System.out.println(str7);
        System.out.println(str8);
        System.out.println(str9);
       if(str.contains("G") && str.contains("B") && str.contains("R"))
       {
           count++;
       }
        if(str1.contains("G") && str1.contains("B") && str1.contains("R"))
        {
            count++;
        }
        if(str2.contains("G") && str2.contains("B") && str2.contains("R"))
        {
            count++;
        } if(str3.contains("G") && str3.contains("B") && str3.contains("R"))
        {
            count++;
        } if(str4.contains("G") && str4.contains("B") && str4.contains("R"))
        {
            count++;
        } if(str5.contains("G") && str5.contains("B") && str5.contains("R")) {
            count++;
        }
        if(str6.contains("G") && str6.contains("B") && str6.contains("R"))
        {
            count++;
        }
         if(str7.contains("G") && str7.contains("B") && str7.contains("R"))
        {
            count++;
        } if(str8.contains("G") && str8.contains("B") && str8.contains("R"))
        {
            count++;
        }
        if(str9.contains("G") && str9.contains("B") && str9.contains("R"))
        {
            count++;
        }
        System.out.println("count = "+count);

    }
}
