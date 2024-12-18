class NestClass {

     static class Function{

        int sun(int a , int b ){
            return a + b ;
        }

        int multiply(int a , int b ){
            return a * b;
        }



    }

    class NonStatic{
        void greeting(){
            System.out.println("Welcome to our website!");
        }
    }

    public static void main(String[] args) {
        NestClass.Function function = new Function();
        int resultSub = function.sun(10,30);
        int resultMultiply = function.multiply(30,40);
        System.out.println("This is a sub of method in nest class : " + resultSub);
        System.out.println("This is a multiply of method in nest class : " + resultMultiply);

        // for we don't want to use


        // Create an instance of outer class
        NestClass nestClass = new NestClass();
        // Create an instance of the nested class using the outer class instance
        //
        NestClass.NonStatic nonStatic = nestClass.new NonStatic();
        nonStatic.greeting();





    }

}
