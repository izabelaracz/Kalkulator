package com.service;

public class Calculator {

    public Calculator() {
    }

    public float add(float first, float second) {
        return first + second;
    }

    public float sub(float first, float second) {
        return first - second;
    }

    public float multi(float first, float second) {
        return first * second;
    }

    public float div(float first, float second) {
        if(second != 0) {
            return first / second;
        }
        else {
            throw new ArithmeticException("You cannot divide by 0!");
        }
    }

    public float mod(float first, float second) {
        if(second != 0) {
            return first % second;
        }
        else {
            throw new ArithmeticException("You cannot divide by 0!");
        }
    }
}
