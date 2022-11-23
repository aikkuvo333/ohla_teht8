import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class TimeUtilsTest {
    private TimeUtils timeutils;

    @ParameterizedTest(name = "Luku {0} s on aikana {1}")
    @CsvSource({"31999, 8:53:19", "32000, -1", "2312, 0:38:32", "-32, -1", "0, 0:00:00", "5.6, 0:00:06"})
    void secToTimes(double sec, String time) {
        String teksti = "väärin";
        assertEquals(time, timeutils.secToTime(sec), teksti);
    }
}