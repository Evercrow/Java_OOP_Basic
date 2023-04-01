package org.Seminar9.CowsAndBulls;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Random;
import java.util.Scanner;

public abstract class AbstractGame implements BullsNCows{
    static Random r = new Random();
    static Scanner in = new Scanner(System.in);

    File movesLog = new File("game_log.txt");
    Integer sizeWord;
    protected String word;
    Integer maxTry;

    BullsNCows gameType;

    static int countTry;
    GameStatus gameStatus = GameStatus.OFF;

    @Override
    public Answer inputGuess(String value) {
        int bull = 0;
        int cow = 0;
        for (int i = 0; i < word.length() && i <value.length(); i++) {
            if (word.contains(Character.toString(value.charAt(i)))) {
                cow++;
            }
            if (word.charAt(i) == value.charAt(i)) {
                bull++;
            }
        }
        Answer answer = new Answer(cow, bull, value);
        gameStatus = checkWin(answer);
        return answer;
    }


    GameStatus checkWin(Answer ans){

        if (ans.getBulls().equals(sizeWord) ) {
            System.out.println("Вы отгадали '"+word+"'");
            System.out.println("Поздравляем!");
            countTry=0;
            return gameStatus = GameStatus.FINISH;
        } else if (countTry >= maxTry) {
                System.out.println(ans);
                System.out.println("У вас закончились попытки, это была "+ maxTry + 'я');
                countTry = 0;
                return gameStatus = GameStatus.FINISH;
        } else {
            System.out.println(ans);
            return gameStatus = GameStatus.ONGOING;
        }
    }

    @Override
    public void start(BullsNCows type) {
        if ( gameStatus == GameStatus.START || gameStatus == GameStatus.ONGOING){
            System.out.println("Игра уже идет");
            return;
        }else {
            gameType = type;
            this.clearLog();
            gameStatus = GameStatus.START;
            gameType.settings();
        }
        gameStatus = GameStatus.ONGOING;
        gameType.askLength();
        System.out.println("For debug, загаданное слово: "+word);
        while(!gameStatus.equals(GameStatus.FINISH)){
            System.out.println("ваш ход");
            String guess=in.next();
            countTry++;
            Answer currentAnswer = gameType.inputGuess(guess);
            gameType.writeMove(currentAnswer);
        }

        endChoice();


    }

    @Override
    public void settings() {
        System.out.println("желаете задать параметры загадываемого слова(y/n)?");
        while(true){
            String  ans = in.next();
            if (ans.equals("y")){
                System.out.println("Введите длину слова:");
                sizeWord = in.nextInt();
                System.out.println("Введите количество попыток:");
                maxTry = in.nextInt();
                word = gameType.generateWord(sizeWord,maxTry);
                break;
            } else if (ans.equals("n")){
                System.out.println("Хорошо, загадаем случайное слово");
                word =  gameType.generateWord();
                break;
            } else {
                System.out.println("Не поняли вас, повторите ввод (\"y\" или \"n\")");
            }
        }


    }

    private void endChoice() {

        System.out.println("Желаете посмотреть все ваши ходы?(y/n)");
        while(true){
            String  ans = in.next();
            if(ans.equals("y")){
                showMoveHistory();
                break;
            } else if(ans.equals("n")){
                break;
            } else {
                System.out.println("Не поняли вас, повторите ввод (\"y\" или \"n\")");
            }
        }

        System.out.println("Желаете отгадать другое слово?(y/n)");
        while(true){
            String ans = in.next();
            if(ans.equals("y")){
                start(gameType);
                break;
            } else if(ans.equals("n")){
                System.out.println("Спасибо за игру!");
                gameStatus = GameStatus.OFF;
                break;
            } else {
                System.out.println("Не поняли вас, повторите ввод (\"y\" или \"n\")");
            }
        }
    }

    @Override
    public void showMoveHistory() {
        try {
            var out = new BufferedOutputStream(System.out);
            Files.copy(movesLog.toPath(), out);
            out.flush();
        } catch(IOException e){
            e.printStackTrace();
        }


    }
    @Override
    public void writeMove(Answer answer) {
        try {
            BufferedWriter logWriter = new BufferedWriter(new FileWriter(movesLog,true));
            logWriter.write(answer.toString());
            logWriter.newLine();
            logWriter.flush();

        } catch(IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void clearLog(){
        try {
            new FileWriter(movesLog, false).close();

        } catch(IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public GameStatus getGameStatus() {
        return gameStatus;
    }

    @Override
    public void askLength() {
        System.out.printf("Слово из %d букв%n",sizeWord);
    }




}
