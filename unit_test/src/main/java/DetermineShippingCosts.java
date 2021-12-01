public class DetermineShippingCosts {
    public double determineShippingCosts(boolean calculateShippingCosts, String typeOfShippingCosts, double totalPrice) {
        double result;
        if (calculateShippingCosts) {
            if (totalPrice > 1500.00) {
                result = 0.00;
            } else {
                switch (typeOfShippingCosts) {
                    case ShippingType.GROUND:
                        result = 100.00;
                        break;
                    case ShippingType.IN_STORE:
                        result = 50.00;
                        break;
                    case ShippingType.NEXT_DAY_AIR:
                        result = 250.00;
                        break;
                    case ShippingType.SECOND_DAY_AIR:
                        result = 125.00;
                        break;
                    default:
                        result = 0.00;
                }
            }
        }
        else {
            result = 0.00;
        }

        return result;
    }
}
