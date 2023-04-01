package org.Seminar9.CowsAndBulls;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

import static java.lang.System.exit;

public class Application {
    public static void main(String[] args) throws MalformedURLException {
        BullsNCows BnC = null;
        System.out.println("Добро пожаловать в игру Быки-Коровы");
        System.out.println("Выберите тип игры");
        System.out.println("1-цифры");
        System.out.println("2-буквы EN");
        System.out.println("3-буквы RU");
        Scanner in = new Scanner(System.in);
        int num=in.nextInt();

        switch (num){
            case 1:  BnC = new NumberGame();
                break;
            case 2: BnC = new WordEnglishGame();
                break;
            case 3: BnC = new WordRussianGame();
                break;
            default:
                System.out.println("такой игры еще не существует");
                exit(0);
                break;
        }
        BnC.start(BnC);
    }
}
