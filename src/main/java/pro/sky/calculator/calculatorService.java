package pro.sky.calculator;

public interface calculatorService {
    public static String plus1(){
        int num1 = 5;
        int num2 = 5;
        System.out.println("5 + 5 =" + num1 + num2);
        return null;
    }
    public static String minus1(){
        int num1 = 5;
        int num2 = 5;
        System.out.println("5 - 5 =" + (0));
        return null;
    }
    public static String multiply1(){
        int num1 = 5;
        int num2 = 5;
        System.out.println("5 * 5 =" + num1 *num2);
        return null;
    }
    public static String divide1(){
        int num1 = 5;
        int num2 = 5;
        System.out.println("5 / 5 =" + num1 /num2);
        return null;
    }

}
