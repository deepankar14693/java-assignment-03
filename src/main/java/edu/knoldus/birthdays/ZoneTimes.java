package edu.knoldus.birthdays;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ZoneTimes {

    public String differentTimeZones(String timeZone) {
        ZoneId zoneId = ZoneId.of(timeZone);
        LocalDateTime currentDateAndTime = LocalDateTime.now(zoneId);
        final DateTimeFormatter TIME_FORMAT = DateTimeFormatter.ofPattern("HH:mm:ss");
        return ZonedDateTime.of(currentDateAndTime, zoneId).format(TIME_FORMAT);
    }
}
