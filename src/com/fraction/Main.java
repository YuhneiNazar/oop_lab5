package com.fraction;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введіть цілу частину числа:");
        int num1 = scan.nextInt();
        System.out.println("Введіть дробову частину числа:");
        double num2 = scan.nextDouble();
        Fraction f1 = new Fraction(num1, num2);
        Fraction f2 = new Fraction(num1, num2);
        Fraction result = f1.minusFraction(f2);
        System.out.println("Віднімання чисел: "+result);
        System.out.println("Перевірка числа на парність: "+f1.isEven());
        System.out.println("Ділення чисел: "+f1.dil(f2));
        System.out.println("Піднесення числа до степеня х: "+f1.Pow(2));
        System.out.println("Остача від ділення чисел: "+f1.zalvidil(f2));
    }
}