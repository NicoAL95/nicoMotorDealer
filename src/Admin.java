import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

interface adminData{
    public void waktu();
    public String cetakWaktu();
}

public class Admin implements adminData {
    public void waktu(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/uuuu HH:mm");
        LocalDateTime now =  LocalDateTime.now();
        System.out.println(dtf.format(now));       
    }
    public String cetakWaktu(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/uuuu HH:mm");
        LocalDateTime now =  LocalDateTime.now();
       return(dtf.format(now));       
    }
}
