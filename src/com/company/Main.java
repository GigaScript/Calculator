package com.company;

public class Main {

    public static void main(String[] args) {
        /*
        в исходной версии класса Calculator.java ошибка будет возникать по причине не обработанного исключения ArithmeticException,
        переменной devide, способы решения
        - обернуть в Try And Catch
        - проверить (Y<=0) условием if, switch -> return 0
        - проверить тернарным оператором devide = (x, y) -> y>0 ? x / y : 0;
        или devide = (x, y) -> this.isPositive.test(y) ? x / y : 0;
        также можно проводить операции с модулями чисел, например
        devide = (x, y) -> this.isPositive.test(this.abs.apply(y)) ? this.abs.apply(y) / this.abs.apply(y) : 0;
         */
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        int c = calc.devide.apply(a, b);
        calc.println.accept(c);
    }
}
