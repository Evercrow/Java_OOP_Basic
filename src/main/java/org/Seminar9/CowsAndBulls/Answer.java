package org.Seminar9.CowsAndBulls;

import lombok.AllArgsConstructor;

import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data

public class Answer {
    private Integer cows;
    private Integer bulls;
    private String userInput;

    @Override
    public String toString() {
        return String.format("В вашем слове %s найдено %d коров и %d быков",userInput,cows,bulls);
    }
}
