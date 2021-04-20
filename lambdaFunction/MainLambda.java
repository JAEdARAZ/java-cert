package lambdaFunction;

public class MainLambda {
    public static void main(String[] args) {
        InterfazFuncional sinReturn = (String word) -> System.out.println("first lambda function " + word);
        sinReturn.lambdaMethod("heyhey");

        InterfazFuncionalReturn conReturnInstance1 = () -> new StringBuilder("sup mate");
        System.out.println("with return: " + conReturnInstance1.lambdaMethodWithReturn().toString());

        InterfazFuncionalReturn conReturnInstance2 = () -> 10 + 10; //return can be omitted
        System.out.println("with return: " + conReturnInstance2.lambdaMethodWithReturn().toString());

        InterfazFuncionalReturn conReturnInstance3 = () -> {
            int a = 10;
            int b = 30;
            return b/a;
        };
        System.out.println("with return: " + conReturnInstance3.lambdaMethodWithReturn().toString());
    }
}
