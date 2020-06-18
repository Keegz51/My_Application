package com.example.myapplication;

public class Calculations {

    double globalResult;
    String function;

    public Calculations(double globalResult,String function)
    {
        this.globalResult=globalResult;
        this.function=function;
    }

    public double Calc(double number)
    {
        if (function.equalsIgnoreCase("empty")) {
            function = "empty";
            globalResult=0.0;
            return Add(number);

        } else if (function.equalsIgnoreCase("Add")) {
            function = "empty";
            return Add(number);

        } else if (function.equalsIgnoreCase("Minus")) {
            function = "empty";
            return Minus(number);
        } else if (function.equalsIgnoreCase("Multiply")) {
            function = "empty";
            return Multiply(number);
        } else if (function.equalsIgnoreCase("Divide")) {
            function = "empty";
            return Divide(number);
        }

        return 0.0;
    }
    public double reset() {
        globalResult=0.0;
        return globalResult;
    }

    public double Add(double i)
    {
        globalResult=globalResult+i;
        return globalResult;
    }

    public double Minus(double i)
    {
        globalResult=globalResult-i;
        return  globalResult;
    }

    public double Multiply(double i)
    {
        globalResult=globalResult*i;
        return  globalResult;
    }

    public double Divide(double i)
    {
        globalResult=globalResult/i;
        return  globalResult;
    }

    public void setFunction(String operand)
    {
        function=operand;
    }

    public String getFunction()
    {
        String operand="";
        switch (function){
            case "Add":
                operand= "+";
                break;

            case "Minus":
                operand= "-";
                break;

            case "Multiply":
                operand= "x";
                break;

            case "Divide":
                operand= "÷";
                break;

            default:
                operand="";
                break;
        }

        return operand;
    }
}
