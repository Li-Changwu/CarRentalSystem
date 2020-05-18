package com.lichangwu.carrental;
/**
 * @program: CarRentalSystem
 * @description: 皮卡车
 * @author: 李长武
 * @create: 2020-05-18 12:34
 **/
public class Pickup extends BaseCar {
    private int maxPassenger;//最大载客数
    private double maxLoad;//最大载货数

    public Pickup() {
    }

    public Pickup(int order, String name, int price, int maxPassenger, double maxLoad) {
        super(order, name, price);
        this.maxPassenger = maxPassenger;
        this.maxLoad = maxLoad;
    }

    public int getMaxPassenger() {
        return maxPassenger;
    }

    public void setMaxPassenger(int maxPassenger) {
        this.maxPassenger = maxPassenger;
    }

    public double getMaxLoad() {
        return maxLoad;
    }

    public void setMaxLoad(double maxLoad) {
        this.maxLoad = maxLoad;
    }

    @Override
    public String toString() {
        return "序号:" + getOrder() +
                "  车辆名称:'" + getName() + '\'' +
                "  租车费用:" + getPrice() +
                "\t最大载人:" + maxPassenger +
                "\t最大载货:" + maxLoad;
    }
}
