package com.company;

import java.util.function.*;

public class Calculator {
    static Supplier<Calculator> instance = Calculator::new;
    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    /*
           в исходной версии класса Calculator.java ошибка будет возникать по причине не обработанного исключения ArithmeticException,
           переменной devide, способы решения
           - обернуть в Try And Catch
           - проверить (Y<=0) условием if, switch -> return 0
           - проверить тернарным оператором devide = (x, y) -> y>0 ? x / y : 0;
           или devide = (x, y) -> this.isPositive.test(y) ? x / y : 0;
           также можно проводить операции с модулями чисел, например
           devide = (x, y) -> this.isPositive.test(this.abs.apply(y)) ? this.abs.apply(y) / this.abs.apply(y) : 0;
           также операцию деления можно производить с модулем числа, например
           this.isPositive.test(this.abs.apply(y)) ? x / y : 0;

    */
    //BinaryOperator<Integer> devide = (x, y) -> x / y;
    BinaryOperator<Integer> devide = (x, y) -> this.isPositive.test(this.abs.apply(y)) ? x / y : 0;
    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;
    Predicate<Integer> isPositive = x -> x > 0;
    Consumer<Integer> println = System.out::println;
}