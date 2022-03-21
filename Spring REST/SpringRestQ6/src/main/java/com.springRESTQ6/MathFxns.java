package com.springRESTQ6;

public class MathFxns
{
    private int a,b;

    public int getA()
    {
        return a;
    }

    public void setA(int a)
    {
        this.a = a;
    }

    public int getB()
    {
        return b;
    }

    public void setB(int b)
    {
        this.b = b;
    }

    public MathFxns()
    {
    }

    public MathFxns(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
}