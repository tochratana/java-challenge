package challenge_switch_case;

public class printNumberInWord {

    static void doNumberTop(int number){
        switch(number){
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
        }
    }
    public static void main(String[] args) {
        int number = 1;

        doNumberTop(number);
        doNumberBottom(number);

        String numberToDisplat;
        switch (number){
            case 1 -> numberToDisplat = "ONE";
            case 2 -> numberToDisplat = "TWO";
            case 3 -> numberToDisplat = "THREE";
            case 4 -> numberToDisplat = "FOUR";
            case 5 -> numberToDisplat = "FIVE";
            case 6 -> numberToDisplat = "SIX";
            case 7 -> numberToDisplat = "SEVEN";
            case 8 -> numberToDisplat = "EIGHT";
            case 9 -> numberToDisplat = "NINE";
            default -> numberToDisplat = "UNKNOWN";
        };
        System.out.println(numberToDisplat);
    }

    static void doNumberBottom(int number){
        switch(number){
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
        }
    }
}
