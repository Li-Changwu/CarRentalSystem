package com.lichangwu.carrental;
/**
 * @program: CarRentalSystem
 * @description: 调用租车系统
 * @author: 李长武
 * @create: 2020-05-18 12:34
 **/
public class Main {
    public static void main(String[] args) {
        CarRentalSystem crs = new CarRentalSystem();
        crs.showCarMessage();//展示车辆信息
        crs.sureNumber();//确认租车数量
        crs.sureTime();//确认租车时间
        crs.resultShow();//结果展示
    }
}
