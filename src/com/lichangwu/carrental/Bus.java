package com.lichangwu.carrental;
/**
 * @program: CarRentalSystem
 * @description: 载客车
 * @author: 李长武
 * @create: 2020-05-18 12:34
 **/
public class Bus extends BaseCar {
    private int maxPassenger;//最大载客数

    public Bus() {
    }

    public Bus(int order, String name, int price, int maxPassenger) {
        super(order, name, price);
        this.maxPassenger = maxPassenger;
    }

    public int getMaxPassenger() {
        return maxPassenger;
    }

    public void setMaxPassenger(int maxPassenger) {
        this.maxPassenger = maxPassenger;
    }

    @Override
    public String toString() {
        return "序号:" + getOrder() +
                "  车辆名称:'" + getName() + '\'' +
                "     租车费用:" + getPrice() +
                "\t最大载人:" + maxPassenger;

    }
}
