package com.lichangwu.carrental;
/**
 * @program: CarRentalSystem
 * @description: 载货车
 * @author: 李长武
 * @create: 2020-05-18 12:34
 **/
public class Trunk extends BaseCar{
    private double maxLoad;//最大载货数

    public Trunk() {
    }

    public Trunk(int order, String name, int price, double maxLoad) {
        super(order, name, price);
        this.maxLoad = maxLoad;
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
                "     租车费用:" + getPrice() +
                "\t最大载货:" + maxLoad;
    }
}
