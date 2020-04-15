package homeWork1.linearAlgorithms;

public class CreditSetOff {
//    1. Рассчитать выплаты по кредиту:
//    Рассчитать месячные выплаты (m) и суммарную выплату (s) по кредиту.
//    О кредите известно, что он составляет sumCredit рублей, берется на years лет, под percent процентов.
//    Месячные выплаты находятся по формуле:
//    m = (sumCredit * percent * (1 + percent)years) / (12 * ((1 + percent)years – 1)), где p выражается в долях единицы, а не процентах.
//    Суммарная выплата представляет собой выплаты за все месяцы каждого года:
//    s = (m * 12) * y

    public double monthlyPayments(double sumCredit, double month, double percent){
        double sum;
        double per = percent / 100;
        sum = (sumCredit * per * Math.pow((1 + per), month)) / (12 * (Math.pow((1 + per), (month - 1))));
        return (double)Math.round(sum * 100d) / 100d;
    }

    public double totalPayout(double sumCredit, double month, double percent){
        double sum;
        sum = (monthlyPayments(sumCredit, month, percent) * 12) * month;
        return  Math.round(sum);
    }
}
