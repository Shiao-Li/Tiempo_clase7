public class Main {
    public static void main(String[] args){
        time1 time = new time1();

        displayTime("After time object is created", time);
        System.out.println();
        time.settime1(13, 27, 6);
        displayTime("After calling setTime", time);
        System.out.println();
        try{
            time.settime1(99, 99, 99);
        }
        catch (IllegalArgumentException e)
        {
            System.out.printf("Exception: %s%n%n", e.getMessage());
        }
        displayTime("After calling setTime with invalid values", time);
    }
    private static void displayTime(String header, time1 t)
    {
        System.out.printf("%s%nUniversal time: %s%nStandard time: %s%n", header, t.toUniversalString(), t.toString());

        ;

    }
}
