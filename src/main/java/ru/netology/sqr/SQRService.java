package ru.netology.sqr;

public class SQRService {
    public int sqrCount(int borderLeft, int borderRight) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            if (Math.pow(i, 2) >= borderLeft) {
                if (Math.pow(i, 2) <= borderRight) {
                    count++;
                }
            }
        }
        return count;
    }
}
