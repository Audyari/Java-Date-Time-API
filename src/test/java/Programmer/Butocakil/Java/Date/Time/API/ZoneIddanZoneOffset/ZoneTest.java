package Programmer.Butocakil.Java.Date.Time.API.ZoneIddanZoneOffset;

import org.junit.jupiter.api.Test;
import java.time.ZoneOffset;
import java.time.ZoneId;
import java.util.Set;

public class ZoneTest {

    @Test
    void createZoneId() {

        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);

        ZoneId zoneIdGMT = ZoneId.of("GMT");
        System.out.println(zoneIdGMT);

        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        availableZoneIds.forEach(System.out::println);

    }

    @Test
    void createZoneOffset() {
        ZoneOffset zoneOffset1 = ZoneOffset.of("+07:00");
        ZoneOffset zoneOffset2 = ZoneOffset.ofHours(-7);
        ZoneOffset zoneOffset3 = ZoneOffset.ofHoursMinutes(7, 30);

        System.out.println(zoneOffset1);
        System.out.println(zoneOffset2);
        System.out.println(zoneOffset3);
    }
}