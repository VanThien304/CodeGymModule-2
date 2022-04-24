package com.codegym;
import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        TV tv1 = new TV();
        tv1.turnOn();
        tv1.setChannel(30);
        tv1.setVolume(3);

//        TV tv4 = new TV(50, 1, false);

        TV tv2 = new TV();
        tv2.turnOn();
//        tăng giá trị channel lên 1;
        tv2.channelUp();
        tv2.channelUp();
        tv2.volumeUp();

        TV tv3 = new TV();
        tv3.turnOff();

        System.out.println("Kênh của tv1 là " + tv1.channel
                + " và mức âm lượng là: " + tv1.volumeLevel);

        System.out.println("Kênh của tv2 là " + tv2.channel
                + " và mức âm lượng là: " + tv2.volumeLevel);

        System.out.println("TV đang tắt");
    }
}