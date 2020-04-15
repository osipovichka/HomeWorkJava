package homeWork1.conditions;

public class CountExpression {
    //Посчитать выражение (max(a*b*c, a+b+c) + 3). a, b и c - рандом от -10 до 10

    public int calcMax(int a, int b, int c){
        int pr = a * b * c;
        int sum = a + b + c;
        int max = 0;

        if(pr > sum){
           return max = pr + 3;
        }

        return max = sum + 3;
    }
}
