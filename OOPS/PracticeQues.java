package OOPS;
public class PracticeQues {
    public static void main(String[] args) {
        Complex  number = new Complex();
        System.out.println(number.sum(5, 8));
        System.out.println(number.substract(8, 4));
        System.out.println(number.multiplication(5, 5));
    }
}

class Complex{
    int sum(int a, int b){
        return a+b;
    }

    int substract(int a, int b){
        return a-b;
    }

    int multiplication(int a, int b){
        return a*b;
    }
}
