package edu.knoldus.BirthDays;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.stream.Stream;

public class DatesImplementation {


    public static void main(String[] args) throws Exception {
        BirthDates birth = new BirthDates ();
        MahatmasDuration life = new MahatmasDuration ();
        LeapYears leap = new LeapYears ();
        // MY ALL BIRTH DATES
        LocalDate firstBirthday = LocalDate.of (1993,06,14);
        ArrayList<String> allBirthDates = birth.getBirthDates (firstBirthday);
        System.out.println ("all birthdays till date : "+allBirthDates);
        // GANDHIJI'S LIFE DURATION IN SECONDS
        LocalDateTime birthDate = LocalDateTime.of (1869,10,02,12,0,0);
        LocalDateTime deathDate = LocalDateTime.of (1948,01,30,23,59,59);
        Long lifeDuration = life.lifeDuration (birthDate,deathDate);
        System.out.println ("mahatma's life duration in seconds is : "+lifeDuration);
        // ALL LEAP YEARS TILL DATE
        LocalDate startingDate = LocalDate.of (1900,01,01);
        ArrayList<Integer> allLeap = leap.allLeapYears (startingDate);
        System.out.println ("all leap years from 1900 till date are : "+allLeap);
    }
}
