package edu.knoldus;

import edu.knoldus.birthdays.BirthDates;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

import static junit.framework.TestCase.assertEquals;

public class BirthDatesTest {
    BirthDates bithday ;
    LocalDate firstBirthday;
    @Before
    public void setUp() {
        firstBirthday = LocalDate.of (1993, 06, 14);
      bithday = new BirthDates ();
    }
    @Test
    public void testGetBirthDates() throws Exception {
        ArrayList<String> actualResult =  bithday.getBirthDates (firstBirthday);
        ArrayList<String> expectedResult = new ArrayList<String>
                (Arrays.asList("MONDAY", "TUESDAY", "WEDNESDAY", "FRIDAY", "SATURDAY", "SUNDAY", "MONDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "SATURDAY", "SUNDAY", "MONDAY", "TUESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY", "TUESDAY", "WEDNESDAY"));
        assertEquals("birthdates method", expectedResult, actualResult);
    }
}
