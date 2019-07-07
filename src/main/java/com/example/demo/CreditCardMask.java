package com.example.demo;

public class CreditCardMask {
    public static void main(String args[]){

        String x = "XXXX-XXXX-XXXX-";
        String cc = "1234-5678-9876-5432";

        //1 : XXXX-XXXX-XXXX-5432
        System.out.println(x+cc.substring(15,19));

        //2 : XXXX-XXXX-XXXX-5432
        StringBuilder sb= new StringBuilder(x);
        sb.append(cc, 15, 19);
        System.out.println(sb.toString());
    }
}
