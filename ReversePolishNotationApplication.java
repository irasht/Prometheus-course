import java.util.Deque;
import java.util.LinkedList;

public class Application {

	  public static double parse(String rpnString) throws RPNParserException, ArithmeticException {
        double returnedNumber = 0;
        String operators = "+-*/";
        String[] array = rpnString.split(" ");
        LinkedList<Double> stack = new LinkedList<Double>();
        try {
            for (int i = 0; i < array.length; i++) {
                String rpnStr = array[i];
                if (!operators.contains(rpnStr)) {
                    try {
                        stack.push(Double.parseDouble(rpnStr));
                    } catch (Exception e) {
                        throw new RPNParserException();
                    }
                } else {
                    double a = stack.pop();
                    double b = stack.pop();
                    int index = operators.indexOf(rpnStr);
                    switch (index) {
                        case 0:
                            stack.push(a + b);
                            break;
                        case 1:
                            stack.push(b - a);
                            break;
                        case 2:
                            stack.push(a * b);
                            break;
                        case 3:
                            if (a != 0.0) {
                                stack.push(b / a);
                                break;
                            } else {
                                throw new ArithmeticException();
                            }

                        default:
                            throw new RPNParserException();
                    }
                }
            }

            returnedNumber = stack.pop();

            return returnedNumber;
        } catch (ArithmeticException e) {
            throw e;
        } catch (Exception e) {
            throw new RPNParserException();
        }
    }
   

	public static void main(String[] args) {

	}

}
      
      
