package org.Seminar10.task03.homeTask10;

import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;

public class BinaryCalc  <A,N extends Number> extends ListCalc{

    public BinaryCalc() {
    }

    public String anyToBin(A input){

        if(input instanceof String){
            try { Double converted = Double.parseDouble((String) input);
                return numToBin(converted);
            } catch(Exception e){
                System.out.println("char type strings binary values depend on encoding and cannot be converted precisely");
            }

        } else if(input instanceof Number){
            return numToBin( (Number) input);
        }

        System.out.println("inconvertible type");
        return "";

    }

    public String numToBin(Number num){
        StringBuilder sb = new StringBuilder();
        BigDecimal bd = new BigDecimal(String.valueOf(num.doubleValue()));
        int wholePart = bd.intValue();
        BigDecimal decimalPart = bd.subtract(new BigDecimal(wholePart));
        while (wholePart >0)
            {
                sb.append(wholePart %2 );
                wholePart /= 2;
            }

        String result = sb.reverse().toString();
        sb.delete(0, sb.length());
        if (decimalPart.signum()!=0){
            sb.append(".");

            while (decimalPart.intValue() <1)
            {
                sb.append(0);
                decimalPart = decimalPart.multiply(BigDecimal.valueOf(2)) ;
            }
            sb.append(1);
            result +=sb.toString();
            }
        return result;
    }



}
