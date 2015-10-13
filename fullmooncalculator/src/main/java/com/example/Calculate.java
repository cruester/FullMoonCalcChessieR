//This program calculates and displays when the next full moon will be for 2015
// based on an input month and day.
package com.example;

public class Calculate {
    public static void main(String args[])
    {
        String currentMonth = "January";  //The first "input" month value
        int currentDay = 11;             // The first "input" day value

        calcNextFullMoon(convertDate(currentMonth, currentDay));

        //Now I will change the month and day and recall the method
        currentMonth = "July";
        currentDay = 23;
        calcNextFullMoon(convertDate(currentMonth, currentDay));

    }
    private static int convertDate (String cm, int day) //This will return a number usable in moon calc
    {
        if (cm == "January")
        {
            day += 0;
        }
        else if (cm == "February")
        {
            day += 31;
        }
        else if (cm == "March")
        {
            day += 59;
        }
        else if (cm == "April")
        {
            day += 90;
        }
        else if (cm == "May")
        {
            day += 120;
        }
        else if (cm == "June")
        {
            day += 151;
        }
        else if (cm == "July")
        {
            day += 181;
        }
        else if (cm == "August")
        {
            day += 212;
        }
        else if (cm == "September")
        {
            day += 243;
        }
        else if (cm == "October")
        {
            day += 273;
        }
        else if (cm == "November")
        {
            day += 304;
        }
        else
        {
            day += 334;
        }
        return day;
    }

    private static void calcNextFullMoon(int date) //Determines when the next full moon is
    {
        if (date < 4)
        {
            System.out.println("The next full moon is on January 4th");
        }
        else if (date < 34)
        {
            System.out.println("The next full moon is on February 3rd");
        }
        else if (date < 64)
        {
            System.out.println("The next full moon is on March 5th");
        }
        else if (date < 94)
        {
            System.out.println("The next full moon is on April 4th");
        }
        else if (date < 123)
        {
            System.out.println("The next full moon is on May 3rd");
        }
        else if (date < 153)
        {
            System.out.println("The next full moon is on June 2nd");
        }
        else if (date < 212)
        {
            System.out.println("The next full moon is on July 31st");
        }
        else if (date < 241)
        {
            System.out.println("The next full moon is on August 29th");
        }
        else if (date < 270)
        {
            System.out.println("The next full moon is on September 27th");
        }
        else if (date < 300)
        {
            System.out.println("The next full moon is on October 27th");
        }
        else if (date < 329)
        {
            System.out.println("The next full moon is on November 25th");
        }
        else
        {
            System.out.println("The next full moon is on December 25th");
        }
    }
}
