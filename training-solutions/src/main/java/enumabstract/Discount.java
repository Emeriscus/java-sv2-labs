package enumabstract;

public enum Discount {

    SPECIAL_OFFER {
        @Override
        public double getAmountToPay(int price, int pieces) {
            return pieces * price * 0.8;
        }
    },
    BLACK_FRIDAY_OFFER {
        @Override
        public double getAmountToPay(int price, int pieces) {
            if (pieces == 1 || pieces == 2) {
                return pieces * price * 0.75;
            }
            if (pieces >= 3) {
                return (pieces - 1) * price * 0.75 + price * 0.5;
            }
            throw new IllegalArgumentException();
        }
    };

    public abstract double getAmountToPay(int price, int pieces);
}
