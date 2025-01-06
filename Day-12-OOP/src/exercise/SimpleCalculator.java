package exercise;

public class SimpleCalculator {
    Double firstNumber;
    Double secondNumber;

    Double getFirstNumber() {
        return firstNumber;
    }

    Double getSecondNumber() {
        return secondNumber;
    }

    void setFirstNumber(Double firstNumber) {
        this.firstNumber  = firstNumber;
    }
    void setSecondNumber(Double secondNumber) {
        this.secondNumber = secondNumber;
    }

    Double getAdditionResult(){
        return firstNumber + secondNumber;
    }

    Double getSubtractionResult(){
        return firstNumber - secondNumber;
    }

    Double getMultiplicationResult(){
        return firstNumber * secondNumber;
    }

    Double getDivisionResult(){
        if(secondNumber == 0){
            return 0D;
        }
        return firstNumber / secondNumber;
    }

    public static void main(String[] args) {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        simpleCalculator.setFirstNumber(1.0);
        simpleCalculator.setSecondNumber(2.0);
        Double result = simpleCalculator.getDivisionResult();
        System.out.println(result);
    }
}
