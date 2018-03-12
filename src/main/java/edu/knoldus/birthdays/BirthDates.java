package edu.knoldus.birthdays;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class BirthDates {
    public ArrayList<String> getBirthDates(LocalDate date) throws Exception {
        ArrayList<String> birthDays = new ArrayList<>();
        try {
            //14-06-93  10-03-2018
            while(date.isBefore(LocalDate.now())) {
                if(date.getYear() == LocalDate.now().getYear()) {
                    if(LocalDate.now().getDayOfYear()
                            > date.getDayOfYear()) {
                        birthDays.add (date.getDayOfWeek().name());
                        date = date.plus(1, ChronoUnit.YEARS);
                    } else {
                        date = date.plus(1, ChronoUnit.YEARS);
                    }
                } else {
                    birthDays.add(date.getDayOfWeek().name());
                    date = date.plus(1, ChronoUnit.YEARS);
                }
            }
        } catch(Exception e) {
            throw new Exception("you are not born yet");
        }
        return birthDays;
    }
}
