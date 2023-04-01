package org.Seminar9.CowsAndBulls;



public class NumberGame extends AbstractGame{



    @Override
    public String generateWord() {
        sizeWord = r.nextInt(4,10);
        maxTry = sizeWord;
        return  this.generateWord(sizeWord,maxTry);
    }

    @Override
    public String generateWord(Integer sizeWord, Integer maxTry) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < sizeWord; ++i) {
            sb.append(r.nextInt(10));
        }
        this.maxTry = maxTry;
        this.sizeWord = sizeWord;
        return sb.toString();
    }

    @Override
    public void askLength() {
        System.out.println("Последовательность из "+ sizeWord+" цифр");
    }

    @Override
    public void settings() {
        System.out.println("желаете задать параметры загадываемой последовательности(y/n)?");
        while(true){
            String ans = in.next();
            if (ans.equals("y")){
                System.out.println("Введите длину последовательности:");
                sizeWord = in.nextInt();
                System.out.println("Введите количество попыток:");
                maxTry = in.nextInt();
                word = this.generateWord(sizeWord,maxTry);
                break;
            } else if (ans.equals("n")){
                System.out.println("Хорошо, загадаем случайную последовательность");
                word = this.generateWord();
                break;
            } else {
                System.out.println("Не поняли вас, повторите ввод (\"y\" или \"n\")");
            }
        }


    }


}
