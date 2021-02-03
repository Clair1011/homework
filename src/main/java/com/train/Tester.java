package com.train;

import java.util.Scanner;
/*
此作業的問題
假設只有台北到高雄的票，單程票價1000元，來回票為2000元再打九折 ， 請設計 Tester.java與TestKotlin.kt ，讓它執行後完成以下規範 :

1. 詢問使用者要購買張數，如下:

  Please enter number of tickets:

2. 取得使用者輸入的張數後，再詢問幾張來回票，如下:

  How many round-trip tickets:

3. 最後印出本次的張數、來回票數與總金額，如下:

  Total tickets: __ Round-trip: __  Total: ___
 */
public class Tester{
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter number of tickets:");
            int tick = scanner.nextInt();
            System.out.println("How many round-trip tickets:");
            int ticks = scanner.nextInt();
            Test cus = new Test(tick,ticks);
            cus.print();


    }



    }


