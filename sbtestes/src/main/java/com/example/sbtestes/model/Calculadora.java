package com.example.sbtestes.model;

public class Calculadora {

    private double a =0;
    private double b =0;

    public Calculadora(){

    }

    public Calculadora(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double somar(){
       return this.a+ this.b;
    }
    public double somar2(double a, double b){
        return a+b;
    }

    @Override
    public String toString() {
        return "Calculadora{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
