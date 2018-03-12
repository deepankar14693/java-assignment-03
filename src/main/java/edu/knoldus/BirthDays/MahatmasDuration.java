package edu.knoldus.BirthDays;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class MahatmasDuration {
public Long lifeDuration(LocalDateTime birth,LocalDateTime death){
    Long durationMillis = Duration.between (birth,death).toMillis ();
    return durationMillis/1000;
}
}
