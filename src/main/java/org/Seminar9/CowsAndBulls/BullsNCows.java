package org.Seminar9.CowsAndBulls;


public interface BullsNCows extends MoveLog{


    void start(BullsNCows type);

    void settings();

    GameStatus getGameStatus();

    String generateWord();

    Answer inputGuess(String value);

    String generateWord(Integer sizeWord, Integer maxTry);

    void askLength();
}
