package com.company;

public class Main {

    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println("1+2 = " + result);
        int previousResult = result;
        result = result - 1;
        System.out.println(previousResult + "- 1 =" + result);

        previousResult = result;

        result = result * 10;
        System.out.println(previousResult + "*10 = " + result);

        previousResult = result;

        result = result / 5;
        System.out.println(previousResult + "/5  = " + result);

        previousResult = result;
        result = result % 3;
        System.out.println(previousResult + "% 3 = " + result);

        previousResult = result;
        result = result + 1;
        System.out.println("Result is now " + result);
        result++;
        System.out.println("Result is now " + result);
        result--;
        System.out.println("Result is now " + result);
        result += 2;
        System.out.println("Result is now " + result);
        result *= 10;
        System.out.println("Result is now " + result);
        result -= 10;
        System.out.println("Result is now " + result);
        result /= 10;
        System.out.println("Result is now " + result);

        boolean isAlien = true;
        if (isAlien == false) {
            System.out.println("It is not an alien");
        } else {
            System.out.println("It IS an alien");
        }

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high score");

            int secondScore = 60;
            if (topScore > secondScore && topScore < 100) {
                System.out.println("Greater than second score and less than 100");

                if ((topScore > 90) || (secondScore <= 90))
                    System.out.println("One of these tests is true");

            boolean isCar =true;
            if(isCar == true)
                System.out.println("this is not supposed to happen");

            double myFirstValue = 20;
            double mySecondValue = 80;
            double myTotal = (myFirstValue + mySecondValue) *25;
            double theRemainder = myTotal % 40;
                System.out.println("the remainder is : " +theRemainder);
            if(theRemainder <=20)
                System.out.println("Total was over the limit");




            }
        }


    }
}
