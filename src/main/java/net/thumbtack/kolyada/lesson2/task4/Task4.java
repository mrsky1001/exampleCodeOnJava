package net.thumbtack.kolyada.lesson2.task4;

import net.thumbtack.kolyada.dao.Dao;
import net.thumbtack.kolyada.task7.Point2D;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;

import static java.lang.System.out;


public class Task4 {

    public static void calcBigInteger() {
        BigInteger bi1 = BigInteger.valueOf(50000000);
        BigInteger bi2 = BigInteger.valueOf(50000000);
        int k = 5000;

        System.out.println(bi1.abs().toString());//	Returns BigInteger absolute value.
        System.out.println(bi1.add(bi2).toString());//	Returns sum of bi1 and bi2.
        System.out.println(bi1.divide(bi2).toString());//	Returns division of bi1 and bi2.
        System.out.println(bi1.divideAndRemainder(bi2).toString());//	Returns array of two BigIntegers representing the result of division and remainder of bi1 and bi2.
        System.out.println(bi1.gcd(bi2).toString());//	Returns greatest common divisor of bi1 and bi2.
        System.out.println(bi1.max(bi2).toString());//	Returns maximum of bi1 and bi2.
        System.out.println(bi1.min(bi2).toString());//	Returns minimum of bi1 and bi2
        System.out.println(bi1.mod(bi2).toString());//	Returns remainder after dividing bi1 by bi2
        System.out.println(bi1.multiply(bi2).toString());//	Returns product of bi1 and bi2.
        System.out.println(bi1.pow(k).toString());//	Returns bi1 to the bi2 power.
        System.out.println(bi1.remainder(bi2).toString());//	Returns remainder of dividing bi1 by bi2. May be negative.
        System.out.println(bi2.signum());//	-1 for neg numbers, 0 for zero, and +1 for positive.
        System.out.println(bi1.subtract(bi2).toString());//	Returns bi1 - bi2.
    }

    public static void calcBigDecimal() {
        BigDecimal bd1 = BigDecimal.valueOf(50000000);
        BigDecimal bd2 = BigDecimal.valueOf(50000000);
        int k = 5000;

        System.out.println(bd1.abs().toString());//	Returns BigDecimal absolute value.
        System.out.println(bd1.add(bd2).toString());//	Returns sum of bd1 and bd2.
        System.out.println(bd1.divide(bd2).toString());//	Returns division of bd1 and bd2.
        System.out.println(bd1.divideAndRemainder(bd2).toString());//	Returns array of two BigDecimals representing the result of division and remainder of bd1 and bd2.
        System.out.println(bd1.max(bd2).toString());//	Returns maximum of bd1 and bd2.
        System.out.println(bd1.min(bd2).toString());//	Returns minimum of bd1 and bd2
        System.out.println(bd1.multiply(bd2).toString());//	Returns product of bd1 and bd2.
        System.out.println(bd1.pow(k).toString());//	Returns bd1 to the bd2 power.
        System.out.println(bd1.remainder(bd2).toString());//	Returns remainder of dividing bd1 by bd2. May be negative.
        System.out.println(bd2.signum());//	-1 for neg numbers, 0 for zero, and +1 for positive.
        System.out.println(bd1.subtract(bd2).toString());//	Returns bd1 - bd2.
    }

    public static void main(String[] args) {
        calcBigInteger();
        calcBigDecimal();
    }
}
