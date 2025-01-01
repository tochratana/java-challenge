package switch_case;

class Expression { // new switch case expression is used to return value if we want it to execute, we should use {}
    public static void main(String[] args) {
        String name = "Toch Ratana";
        String result = switch (name) {
            case  "Toch Ratana"  -> "This is first case with name Toch Ratana";
            default -> "This is first case with name Toch Ratana";
        };
        System.out.println(result);



        int b = 20 ;
        switch (b){
            case 10 ->
                    System.out.println("This is first case with number 10");
            default ->
                    System.out.println("Default case");
        }

    }
}

public class Switch {
    public static void main(String[] args) {
        int a = 10;
        switch (a){
            case 1:
            case 2:
            case 3:
                System.out.println("1");
                break;
            case 4:
                System.out.println(2);
                break;
            default:
                System.out.println("default");
        }

        int c = 2 ;
        switch (c){
            case 1:
                System.out.println("First Case");
                break;
                case 2:
                    System.out.println("Second Case");
                    break;
                    default:
                        System.out.println("default");
        }
    }
}
