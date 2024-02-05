import java.time.LocalDate;

public enum Holidays {
    NO,
    NEWYEAR,
    MARCH8,
    FEB23;


    Holidays(){}

    public static Holidays isHoliday(LocalDate date) {
        if (date.getMonthValue() == 12 && date.getDayOfMonth() == 31) {
            return NEWYEAR;
        }
        if (date.getMonthValue() == 2 && date.getDayOfMonth() == 23) {
            return FEB23;
        }
        if (date.getMonthValue() == 3 && date.getDayOfMonth() == 8) {
            return MARCH8;
        }
        return NO;
    }

}
