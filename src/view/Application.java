package view;

import controller.Calculator;
import controller.CompareArrays;
import controller.Pair;

public class Application {
    public static void app() {
        System.out.println("Hello world!!!\nMy name is Sublustrum007\n");
        System.out.println("Task_1");
        runCalc();
        System.out.println();
        System.out.println("Task_2");
        runComparArray();
        System.out.println();
        System.out.println("Task_3");
        runPair();
    }

    public static void runCalc() {
        float x = 3.4f;
        double y = 4.6;
        System.out.println("SUM:");
        System.out.println("Result = " + Calculator.sum(x, y));
        System.out.println("MULTYPLY:");
        System.out.println("Result = " + Calculator.multiply(x, y));
        System.out.println("DIVIDE:");
        System.out.println("Result = " + Calculator.divide(x, y));
        System.out.println("SUBTRACT:");
        System.out.println("Result = " + Calculator.subtract(x, y));
    }

    public static void runComparArray() {
        Integer[] arr1 = {1, 2, 3, 4, 5, 6};
        String[] arr2 = {"1", "2", "3", "4", "5", "6"};
        Integer[] arr3 = {1, 2, 3, 4, 5, 6};
        System.out.println(CompareArrays.compateArrays(arr1, arr2));
        System.out.println(CompareArrays.compateArrays(arr1, arr3));
    }

    public static void runPair() {
        Pair<String, Integer> pair1 = new Pair<>("str1", 1);
        Pair<Double, Float> pair2 = new Pair<>(38.5d, 1324.23f);


        System.out.println("pair1.getFirst() = " + pair1.getFirst());
        System.out.println("pair1.getSecond() = " + pair1.getSecond());
        System.out.println(pair1);
        System.out.println("pair2.getFirst() = " + pair2.getFirst());
        System.out.println("pair2.getSecond() = " + pair2.getSecond());
        System.out.println(pair2);
    }
} 
