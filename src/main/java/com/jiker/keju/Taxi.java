import java.io.IOException;

public class Taxi {
    private int distance;
    private int waitingTime;
    private int taxiPrice;

    public Taxi() {
    }

    public void parameter(int distance, int waitingT) {
        this.distance = distance;
        this.waitingTime = waitingT;
    }

    public double getDistancePrice() {
        double distancePrice = 0;
        if (distance <= 2) {
            distancePrice = 6;     //不超过2公里
        } else if (2 < distance && distance <= 8) {
            distancePrice = 6 + (distance - 2) * 0.8;     //超过2公里但不超过8公里
        } else { distancePrice = 10.8 + (distance - 8) * 1.2;}     //超过8公里
        return distancePrice;
    }

    public String getPrice() {
        if (waitingTime == 0) {
            taxiPrice = (int) Math.round(getDistancePrice());
        } else {
            taxiPrice = (int) Math.round(getDistancePrice() + waitingTime * 0.25);
        }
        return "收费" + taxiPrice + "元" + "\n";
    }
}

