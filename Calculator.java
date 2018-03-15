package loki.kra.ru;

public class Calculator {
    int $result;

    public double sum (int $firstArg, int $secondArg){
        $result = $secondArg + $firstArg;
        return $result;
    }
    public double substrata(int $firstArg, int $secondArg){
        $result = $secondArg - $firstArg;
        return $result;
    }
    public double multiple (int $firstArg, int $secondArg){
        $result = $secondArg * $firstArg;
        return $result;
    }
    public double decisions(int $firstArg, int $secondArg){
        $result = $firstArg/$secondArg;
        return $result;
    }
}
