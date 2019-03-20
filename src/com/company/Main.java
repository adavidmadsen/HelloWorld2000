package com.company;

public class Main
{

    public static void main(String[] args)
    {
        System.out.println("Hello, World");

//        for (String arg: args)
//        {
//            System.out.println(arg);
//        }
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.println("total: " + (a + b));
    }
}
