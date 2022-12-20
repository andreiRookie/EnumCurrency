public enum Currency implements Convertable {
    RUB(new String[]{"рубль", "рубля", "рублей"}),
    USD(new String[]{"доллар", "доллара", "долларов"});

    private final String[] endings;

    Currency(String[] endings) {
        this.endings = endings;

    }

    public String getEndingMessage(int amount) {
        if (amount == 1) {
            return endings[0];
        } else if (amount >= 2 && amount <= 4) {
            return endings[1];
        } else {
            return endings[2];
        }
    }

    @Override
    public double covert(int amount, Currency currency) {
        CurrencyRate rate = CurrencyRate.getRate(this, currency);

        return amount * rate.rate;
    }
}
