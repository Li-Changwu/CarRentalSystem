package com.lichangwu.carrental;

/**
 * @program: CarRentalSystem
 * @description: 由载客车、载货车、皮卡车向上提取的基类
 * @author: 李长武
 * @create: 2020-05-18 12:34
 **/
public class BaseCar {
    private int order;//序号
    private String name;//车辆名称
    private int price;//价格

    public BaseCar() {
    }

    public BaseCar(int order, String name, int price) {
        this.order = order;
        this.name = name;
        this.price = price;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "BaseCar{" +
                "order=" + order +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
