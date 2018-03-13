package edu.knoldus;

import edu.knoldus.birthdays.LeapYears;
import org.junit.Before;
import org.junit.Test;
import org.omg.CORBA.ExceptionList;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

import static junit.framework.TestCase.assertEquals;

public class LeapYearsTest {
    LeapYears years;
    LocalDate startingDate;
    @Before
    public void setUp(){
        years = new LeapYears ();
        startingDate = LocalDate.of(1900, 01, 01);
    }
    @Test
    public void testAllLeapYears()  {
        ArrayList<Integer> actualResult = years.allLeapYears (startingDate);
        ArrayList<Integer> expectedResult = new ArrayList<Integer>
                (Arrays.asList (1904, 1908, 1912, 1916, 1920, 1924, 1928, 1932, 1936, 1940, 1944, 1948, 1952, 1956, 1960, 1964, 1968, 1972, 1976, 1980, 1984, 1988, 1992, 1996, 2000, 2004, 2008, 2012, 2016));
        assertEquals("leap year method", expectedResult, actualResult);
    }
}

