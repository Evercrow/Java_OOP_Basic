package org.Seminar12.Library.CalculatorComplex.Model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class CalcLogger {
    String x ;
    String y;
    String res;
    String operand;


    public void logOperation() throws IOException{
        File log = new File("calc_log.txt");
        FileWriter fw = new FileWriter(log);
        fw.write(String.format(
                "%s %s %s = %s\n",x,operand, y ,res ));
        fw.flush();
    }

    public void setX(String x) {
        this.x = x;
    }

    public void setY(String y) {
        this.y = y;
    }

    public void setRes(String res) {
        this.res = res;
    }

    public void setOperand(String operand) {
        this.operand = operand;
    }
}
