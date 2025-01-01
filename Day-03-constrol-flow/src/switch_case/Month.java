package switch_case;

public class Month {


    String query(String month) {
       return switch (month) {
            case "January","February","March","May" ->
                    {
                      yield   "1th";
                    }
            case "April","June","July","August" -> "2nd";
            case "September","October","November","December" -> "3th";
            case "No" -> {
                yield  "hello"; // yield use when we want to return in case
            }
            default -> "bad";
        };
    }
    public static void main(String[] args) {
        Month month = new Month();
        String monthName = "January";

        String result = month.query(monthName);
        System.out.println(monthName + " is in " + result);

    }
}
