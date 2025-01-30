package oop_challenge.floor;

public class Carpet {
    private double cost;

    Carpet(double cost) {
        setCost(cost);
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = this.cost < 0 ? 0 : cost;
    }

}
