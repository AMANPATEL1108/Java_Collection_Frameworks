package Others.Chatgpt.MethodOverladingExample;

public class MathOperations {
    public static void main(String[] args) {
        System.out.println(multiply(1,2));
        System.out.println(multiply(1.5,4.6));
        System.out.println(multiply(7,7,9));
    }

    static int multiply(int a,int b){
        return a+b;
    }
    static double multiply(double a,double b){
        return a+b;
    }
   static int multiply(int a,int b,int c){
        return a+b+c;
    }
}
