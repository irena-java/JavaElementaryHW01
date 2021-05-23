package com.company;

public class Task3 {
    public static void main(String[] args) {
        System.out.println(createStringWithNumbers());
    }

    private static String createStringWithNumbers() {
        int minNumber=1;
        int maxNumber=30;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = minNumber; i <= maxNumber; i++) {
            stringBuilder.append("(").
                    append(i).
                    append(")");
        }
        return stringBuilder.toString();
    }
}