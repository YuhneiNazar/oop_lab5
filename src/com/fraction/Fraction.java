package com.fraction;

public class Fraction {
    private int num1;
    private double num2;
    public Fraction()
    {
        num1 = 0;
        num2 = 0;
    }
    public Fraction(int num1, double num2)
    {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Fraction(Fraction c)
    {
        this.num1 = c.num1;
        this.num2 = c.num2;
    }
    public void setNum1(int num1)
    {
        this.num1 = num1;
    }
    public void setNum2(double num2)
    {
        this.num2 = num2;
    }
    public int getNum1()
    {
        return this.num1;
    }
    public double getNum2()
    {
        return this.num2;
    }
public  Fraction minusFraction(Fraction other) {
    int newn1 = this.num1;
    double newn2 = this.num1 - other.num2;
    return new Fraction(newn1, newn2);
}
    public String toString() {return num1 + " / " + num2;}

    public boolean isEven() {
        return this.num1 % 2 == 0;
    }

    public Fraction dil(Fraction other) {
        int newn1 = this.num1;
        double del = this.num1 / other.num2;
        String rez = String.format("%.2f", del);
        rez = rez.replace(",", ".");
        double newn2 = Double.parseDouble(rez);
        return new Fraction(newn1, newn2);
    }
    public Fraction Pow(int x) {
        int newn1 = (int) Math.pow(this.num1, x);
        double newn2 = this.num2;
        return new Fraction(newn1, newn2);
    }

    public Fraction zalvidil(Fraction other) {
        int newn1 = this.num1;
        double zal = this.num1 % other.num2;
        String rez = String.format("%.2f", zal);
        rez = rez.replace(",", ".");
        double newn2 = Double.parseDouble(rez);
        return new Fraction(newn1, newn2);
    }
}

