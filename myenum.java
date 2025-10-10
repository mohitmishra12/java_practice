enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class myenum {
    public static void main(String[] args) {
        Day today = Day.MONDAY;


        switch(today) {
            case MONDAY:
                System.out.println("Today is Monday, start of the week!");
                break;
            case FRIDAY:
                System.out.println("Today is Friday, weekend is near!");
                break;
            default:
                System.out.println("Midweek days.");
        }
        for(Day d : Day.values()) {
            System.out.println(d);
        }


        System.out.println("Ordinal of Friday: " + Day.FRIDAY.ordinal());
    }
}
