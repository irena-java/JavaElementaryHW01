package com.company;

public class Task3 {
    public static void main(String[] args) {
        System.out.println(createStringWithNumbers());
    }

    private static String createStringWithNumbers() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i <= 30; i++) {
            stringBuilder.append("(").
                    append(i).
                    append(")");
        }
        return stringBuilder.toString();
    }
}