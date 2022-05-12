package ru.netology.sqr;

public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService();
        int count = service.sqrCount(200, 300);
        System.out.println(count);
    }
}
