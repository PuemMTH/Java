public class EnumeratedType {
    enum Day{
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }
    public static void main(String[] args) {
        Day myBDay = Day.MONDAY;
        System.out.println(myBDay);
    }
}
