package com.example.myapplication;

public class Calculations {

    String globalResult;
    String function;

    public Calculations(String globalResult,String function)
    {
        this.globalResult=globalResult;
        this.function=function;
    }

    public String Calc(String number)
    {
        if (function.equalsIgnoreCase("empty")) {
            function = "empty";
           String gr= globalResult+""+number;
           globalResult=gr;
            //globalResult=0.0;
            return globalResult;

        } else if (function.equalsIgnoreCase("Add")) {
            function = "empty";
            return Add(number);

        }
        else if (function.equalsIgnoreCase("Minus")) {
            function = "empty";
            return Minus(number);
        } else if (function.equalsIgnoreCase("Multiply")) {
            function = "empty";
            return Multiply(number);
        } else if (function.equalsIgnoreCase("Divide")) {
            function = "empty";
            return Divide(number);
        }else if (function.equalsIgnoreCase("Over")) {
            function = "empty";
            return Over(number);
        }

        return "";
    }
    public String Add(String i)
    {
        globalResult=Double.toString(Double.parseDouble(globalResult)+Double.parseDouble(i));
        return globalResult;
    }

    public String Minus(String i)
    {
        globalResult=Double.toString(Double.parseDouble(globalResult)-Double.parseDouble(i));
        return  globalResult;
    }

    public String Multiply(String i)
    {
        globalResult=globalResult=Double.toString(Double.parseDouble(globalResult)*Double.parseDouble(i));
        return  globalResult;
    }

    public String Divide(String i)
    {
        globalResult=globalResult=Double.toString(Double.parseDouble(globalResult)/Double.parseDouble(i));
        return  globalResult;
    }

    public String Over(String i)
    {
        globalResult=Double.toString(1/Double.parseDouble(i));
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
