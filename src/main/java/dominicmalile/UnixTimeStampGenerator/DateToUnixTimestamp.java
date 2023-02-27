package dominicmalile.UnixTimeStampGenerator;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

public class DateToUnixTimestamp {
	
	String dateString = "2023-02-25 10:30:00"; // date string in 'YYYY-MM-DD HH:MM:SS' format

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateToUnixTimestamp stamp = new DateToUnixTimestamp();
        System.out.println(stamp.unixStampGenerator()); // prints: 1677321000
	}
	
	public long unixStampGenerator() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime dateTime = LocalDateTime.parse(dateString, formatter);
        long timestamp = dateTime.toEpochSecond(ZoneOffset.UTC);
        return timestamp;
		
	}

}
