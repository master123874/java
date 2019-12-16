package iotest.算法测试;

import java.util.Scanner;
class Stock{
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;
    public Stock(String symbol,String name){
        this.symbol=symbol;
        this.name=name;
    }
    public double getChangePercent(){
        return (currentPrice-previousClosingPrice)/previousClosingPrice;
    }
}
public class pta5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String symbol1=input.next();
        String name1=input.next();
        Stock stock = new Stock(symbol1, name1);

        stock.previousClosingPrice = input.nextDouble();
        // Input current price
        stock.currentPrice = input.nextDouble();
        // Display stock info
        System.out.println(stock.name+" Price Changed: " + stock.getChangePercent() * 100 + "%");
        input.close();
    }
}
