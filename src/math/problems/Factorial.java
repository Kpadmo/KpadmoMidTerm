package math.problems;

public class Factorial {



        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         */
        public static int iteratorFactorial(int a)
        {
            int number = 1;

            for (int i =2; i < 6; i++)
            {
                number = number * i;
            }
            return number;
        }

         public static int recursionFactorial(int a)
         {
             if (a == 0) return 1;
             return a * recursionFactorial(( a -1));
         }

         public static void main(String[] args)
         {
             int a = 5;

             System.out.println("the factorial of 5 is :" + iteratorFactorial(a) );
             System.out.println(" the factorial of 5 is :" + recursionFactorial(a) );


         }
}

