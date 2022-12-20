public class CurrencyRate {

    private Currency from;
    private Currency to;
    double rate;

    public CurrencyRate(Currency from, Currency to, double rate){
        this.from = from;
        this.to = to;
        this.rate = rate;
    }

    static CurrencyRate[] rates = {
            (new CurrencyRate(Currency.RUB, Currency.USD, 70.0)),
            (new CurrencyRate(Currency.USD, Currency.RUB, 0.14))
    };

    static CurrencyRate getRate(Currency from, Currency to) {
        for (CurrencyRate rate : rates ) {
            if (rate.from.equals(from) && rate.to.equals(to)) {
                return rate;
            }
        }
        return null;
    }
}
