public class CompleteIfElse {
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 10000;
        int lavelCompleted = 8;
        int bonus = 200;
        int finalScore = score;

        calculateScore(gameOver, finalScore, lavelCompleted, bonus);
        String name = "Toch Ratana";
        greeting(name);
        String birthDay = "13-06-2005";
        System.out.println(printBirthDay(birthDay));

        // declare method
        // public static void methodName(){
        //  blog code
        // }
        // calling methods or invoking the methods
    }
    public static void calculateScore(boolean gameOver,int finalScore,int lavelCompleted, int bonus){
        System.out.println("This is a methods");
        if (gameOver == true){
            finalScore+=lavelCompleted*bonus;
            System.out.println("You final score is : "+finalScore);
        }
    }


    // Static methods
    public static void greeting(String name){
        System.out.println("Hello "+name);
    }

    //methods with return type
    // synax
    // public static dataType methodName(){
    //      return value;
    // }

    public static String printBirthDay(String birthDay) {
        return ("This day is your birthday: " + birthDay);

    }




}
