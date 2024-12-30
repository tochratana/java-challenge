public class Main {
    public static void main(String[] args) {
        System.out.println("Start program...............");
        calculatorScore("Toch Ratana",2000,50);
        int newScore = calculatorScores(75);
        System.out.println("The new score that you get is : " + newScore);
        System.out.println("The end of program..........");
    }

    public static void calculatorScore(String playerName , int score , int point){
        System.out.println(playerName + " get a score " + score + " on " + point);
    }

    public static int calculatorScores(int score){
        return score * 1000;
    }
//    public static void convertToCentimeters(int heightInches){
//
//    }
//    public static void convertToCentimeters(int heightInches){
//
//    }

}
