package lambdaexpressiondemo;
/**
 *
 * @author ghosh
 */
import interfaces.MathOperation;
public class LambdaExpressionDemo{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MathOperation addition = (a,b)->a + b;
        MathOperation subtraction = (a,b)->a-b;
        MathOperation multiplication = (a,b)->a*b;
        MathOperation division = (a,b)->a/b;
        
        float a = 10;
        float b = 7;
        System.out.println("a + b = " + operate(a,b,addition));
        System.out.println("a - b = " + operate(a,b,subtraction));
        System.out.println("a * b = " + operate(a,b,multiplication));
        System.out.println("a / b = " + operate(a,b,division));
    }
    public static float operate(float a,float b,MathOperation m){
        return m.operation(a,b);
    }
}
