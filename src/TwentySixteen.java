import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class TwentySixteen {
    public String solution(int a, int b) {
        LocalDate date = LocalDate.of(2016,a,b);
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        return dayOfWeek.getDisplayName(TextStyle.SHORT, Locale.US).toUpperCase();
    }
    public static void main(String[] args) {
        TwentySixteen obj = new TwentySixteen();
        String answer = obj.solution(5,24);
        System.out.println(answer);
    }
}
