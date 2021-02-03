package com.train;

public class Test {
    int price = 1000;
    double round_price = 2000 * 0.9;
    int tick;
    int ticks;


    public Test(int tick, int ticks) {
        this.tick = tick;
        this.ticks = ticks;
    }

    public void print() {
        System.out.println("Total tickets:"+tick+"\n"+"Round-trip:"+ticks+"\n"+
                "Total:"+(getPrice()+getRound_price()));

    }

    public int getPrice() {
        return tick*price;
    }

    public double getRound_price(){
        return ticks * round_price;
    }







}






