package edu.knoldus;

import edu.knoldus.birthdays.MahatmasDuration;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDateTime;

import static junit.framework.TestCase.assertEquals;

public class MahatmasDurationTest {
    MahatmasDuration gandhi;
    LocalDateTime start;
    LocalDateTime end;
    @Before
    public void setUp(){
        gandhi = new MahatmasDuration ();
        start = LocalDateTime.of(1869, 10, 02, 12, 0, 0);
        end = LocalDateTime.of(1948, 01, 30, 23, 59, 59);
    }
    @Test
    public void testLifeDuration(){
        Long actualResult = gandhi.lifeDuration (start,end);
        Long expectedResult = 2471774399L;
        assertEquals("mahatma's duration method",expectedResult,actualResult);
    }
}
