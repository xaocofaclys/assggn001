package calculator;

public class Calculator{
    float findAverage(float ...numbers){

        float  sum = 0f;
        for (var f : numbers)
            sum += f;

        return Math.round((sum / numbers.length) * 100f) / 100f; 
    }
}