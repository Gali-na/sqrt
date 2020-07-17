public class SqrtOperation {
    public double sqrt(double number) throws IllegalArgumentException {
        double rezult = 0.0;
        if (number < 0) {
            throw new IllegalArgumentException("Expected non-negative number, got " + number);
        }
        if (number == 0) {
            return 0.0;
        }
        double temp;
        rezult = number / 2;
        do {
            temp = rezult;
            rezult = (temp + (number / temp)) / 2;
        } while ((temp - rezult) != 0);
        return rezult;
    }
}
