/*
Given two integers a and b, which can be positive or negative, find the sum of all the numbers between including them too and return it. 
If the two numbers are equal return a or b.

Note: a and b are not ordered!
*/

public class Sum
  {
     public int GetSum(int a, int b)
     {
     
       if (a == b)
         return a;
       
       int result = 0;
       int minValue = Math.min(a, b);
       int maxValue = Math.max(a, b);
       
       for (int i = minValue; i <= maxValue; i++) {
         
         result += i;
       }
       
       return result;
     }
  }
