package loki.kra.ru;

import java.util.Scanner;

public class CalcOperation {
    public static void main(String[] args) {
        Scanner keyInput = new Scanner(System.in);
        int $argOne = 0;
        int $argTwo = 0;
        int $mathOperation;
        String $repeat = "yes";
        Calculator calc = new Calculator();
        while ($repeat.equals("yes")) {

            System.out.println("Выбирете действие");
            System.out.println("1 - Сложение");
            System.out.println("2 - Вычитание");
            System.out.println("3 - Умножение");
            System.out.println("4 - Деление");
            $mathOperation=keyInput.nextInt();
            if ( $mathOperation > 0 && $mathOperation < 5) {
                if ($argOne == 0) {
                    System.out.println("Первое число");
                    $argOne = keyInput.nextInt();
                }
                if ($argTwo == 0) {
                    System.out.println("Второе число");
                    $argTwo = keyInput.nextInt();
                }

                switch ($mathOperation) {
                    case 1:
                        System.out.println(calc.sum($argOne, $argTwo));
                        break;
                    case 2:
                        System.out.println(calc.substrata($argOne, $argTwo));
                        break;
                    case 3:
                        System.out.println(calc.multiple($argOne, $argTwo));
                        break;
                    case 4:
                        if ($argTwo == 0b0) {
                            System.out.println("на ноль делить нельзя");
                        } else {
                            System.out.println(calc.decisions($argOne, $argTwo));
                        }
                        break;

                }
            }

            System.out.println("Продолжим?(yes/no)");
            $repeat=keyInput.next();
            if ($repeat.equals("yes")) {
                System.out.println("Сохранить результат для использоваиния в качестве первого числа: нажмите 1");
                System.out.println("Сохранить результат для использоваиния в качестве второго числа: нажмите 2");
                System.out.println("Очистить значения: нажмите 0");
                int $save =keyInput.nextInt();
                switch ( $save){
                    case 1:
                        $argTwo = 0;
                        break;
                    case 2:
                        $argOne = 0;
                        break;
                    case 0:
                        $argOne = 0;
                        $argTwo = 0;
                        break;
                }
            } else {
                System.out.println("До свидания");
            }


        }
    }
}
