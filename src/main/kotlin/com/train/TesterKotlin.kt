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
package com.train

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    println("Please enter number of tickets:")
    var ticket = scanner.nextInt()
    println(" How many round-trip tickets:")
    var tickets = scanner.nextInt()
    val test = TesterKotlin(ticket,tickets)
    test.print()

}

class TesterKotlin (var ticket:Int, var ticktes:Int) {

    fun print(){
        println("Total tickets:"+ticket+"\n"+"Round-trip:"+ticktes+"\n"+
                "Total:"+(getPrice()+getRound_price()))
    }
    fun getPrice(): Int{
        return ticket * 1000;
    }
    fun getRound_price(): Int{
        return (ticktes * (2000*0.9)).toInt()
    }

}