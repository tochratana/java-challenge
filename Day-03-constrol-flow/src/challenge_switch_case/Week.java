package challenge_switch_case;

public class Week {
    public static void main(String[] args) {


        int dayToFind  = 1;
        System.out.println(dayOfWeek(dayToFind));

        printDayOfWeek(dayOfWeek(dayToFind));
    }

    public static String dayOfWeek(int day) {
        String result = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Unknown";
        };
        return result;
    }

    public static void printDayOfWeek(String day){

        String invalid = "Invalid day";
        if(day.equals("Monday")){
            invalid = "Monday";
        }else if(day.equals("Tuesday")){
            invalid = "Tuesday";
        }else if(day.equals("Wednesday")){
            invalid = "Wednesday";
        }else if(day.equals("Thursday")){
            invalid = "Thursday";
        }else if(day.equals("Friday")){
            invalid = "Friday";
        }else if(day.equals("Saturday")){
            invalid = "Saturday";
        }else if(day.equals("Sunday")){
            invalid = "Sunday";
        }
        System.out.println(day + " is stand for " + invalid);
    }
}


