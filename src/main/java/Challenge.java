import java.util.Scanner;

public class Challenge {
    public static void main(String[] args) {
        System.out.println("What is the first number?");
        Scanner UserInput = new Scanner(System.in);
        double FirstIn = UserInput.nextInt();
        while (FirstIn < 0){
            System.out.println("Enter a positive number:");
            double x = UserInput.nextInt();
            if (x > 0){
                System.out.println("What is the second number?");
                double SecondIn = UserInput.nextInt();
                double Add = x + SecondIn;
                double subtract =x - SecondIn;
                double multiply = x * SecondIn;
                double divide = x/SecondIn;

                System.out.println(x + " + " + SecondIn +" = "+ Add+"\n"+ x + " - " + SecondIn +" = "+ subtract+"\n"
                        + x + " * " + SecondIn +" = "+multiply+"\n" + x + " / " + SecondIn +" = "+ divide);
                return;
            } else {
            }
        }
        System.out.println("What is the second number?");
        double SecondIn = UserInput.nextInt();
        while (SecondIn < 0){
            System.out.println("Enter a positive number:");
            double y = UserInput.nextInt();
            if (y > 0){
                System.out.println("What is the second number?");

                double Add = FirstIn + y;
                double subtract = FirstIn - y;
                double multiply = FirstIn * y;
                double divide = FirstIn/y;

                System.out.println(FirstIn + " + " + y +" = "+ Add+"\n"+ FirstIn + " - " + y +" = "+ subtract+"\n"
                        + FirstIn + " * " + y +" = "+multiply+"\n" + FirstIn + " / " + y +" = "+ divide);
                return;
            } else {
            }
        }



        double Add = FirstIn + SecondIn;
        double subtract = FirstIn - SecondIn;
        double multiply = FirstIn * SecondIn;
        double divide = FirstIn/SecondIn;

        System.out.println(FirstIn + " + " + SecondIn +" = "+ Add+"\n"+ FirstIn + " - " + SecondIn +" = "+ subtract+"\n"
                + FirstIn + " * " + SecondIn +" = "+multiply+"\n" +FirstIn + " / " + SecondIn +" = "+ divide);
    }
}

