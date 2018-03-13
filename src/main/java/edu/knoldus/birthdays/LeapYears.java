package edu.knoldus.birthdays;

import java.time.LocalDate;
import java.util.ArrayList;

public class LeapYears {
    public ArrayList<Integer> allLeapYears(LocalDate startingYear) {
        ArrayList<Integer> leapYearsList = new ArrayList<>();
        while (startingYear.isBefore(LocalDate.now())) {
            if (startingYear.isLeapYear()) {
                leapYearsList.add(startingYear.getYear());
                startingYear = startingYear.plusYears(1);
            } else {
                startingYear = startingYear.plusYears(1);
            }
        }
        return leapYearsList;
    }
}
