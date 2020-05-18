package com.lichangwu.carrental;
import java.util.Scanner;
/**
 * @program: CarRentalSystem
 * @description: 租车系统类
 * @author: 李长武
 * @create: 2020-05-18 12:34
 **/
public class CarRentalSystem {
    private int totalPrice;//总价格
    private int totalPassenger;//总体最大载人数
    private double totalLoad;//总体最大载货数
    private int day;//租车天数
    private int[] carNum = new int[9];//记录每种车租赁的天数
    private Scanner scanner = new Scanner(System.in);
    
    BaseCar cars[] = {
            new Bus(1,"小轿车",40,4),
            new Bus(2,"面包车",65,7),
            new Bus(3,"大巴车",180,20),
            new Trunk(4,"低栏车",30,1.5),
            new Trunk(5,"高栏车",47,2.5),
            new Trunk(6,"厢式车",80,4.5),
            new Pickup(7,"日式皮卡车",60,5,1),
            new Pickup(8,"美式皮卡车",60,2,3)
    };

    /**
    * @Description: 展示所有车辆的信息
    * @Param: []
    * @return: void
    * @Author: 李长武
    * @Date: 2020/5/18
    */
    public void showCarMessage(){
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i].toString());
        }
    }
    /**
    * @Description: 确认各类车租车数量
    * @Param: []
    * @return: void
    * @Author: 李长武
    * @Date: 2020/5/18
    */
    public void sureNumber(){
        for (int i = 0; i < cars.length; i++) {
            System.out.format("请输入序号%d（%s）的租用数量:\n",i + 1, cars[i].getName());
            while(true){
                try {
                    carNum[i] = scanner.nextInt();
                    if(carNum[i] < 0){
                        System.out.println("请输入大于等于0的整数：");
                    }else{
                        break;
                    }

                } catch (Exception e) {
                    scanner = new Scanner(System.in);
                    System.out.println("请输入大于等于0的整数：");
                }
            }
            if(i<3){
                totalPrice += ((Bus)cars[i]).getPrice() * carNum[i];
                totalPassenger += ((Bus)cars[i]).getMaxPassenger() * carNum[i];
            }
            else if(i < 6){
                totalPrice += ((Trunk)cars[i]).getPrice() * carNum[i];
                totalLoad += ((Trunk)cars[i]).getMaxLoad() * carNum[i];
            }else if(i < 9){
                totalPrice += ((Pickup)cars[i]).getPrice() * carNum[i];
                totalPassenger += ((Pickup)cars[i]).getMaxPassenger() * carNum[i];
                totalLoad += ((Pickup)cars[i]).getMaxLoad() * carNum[i];
            }else {
                System.out.println("error");
            }//判断是哪类车，然后添加相应的价格、最大载人、最大载货
        }
    }
    /**
    * @Description: 确认租车天数
    * @Param: []
    * @return: void
    * @Author: 李长武
    * @Date: 2020/5/18
    */
    public void sureTime(){
        System.out.println("请输入租车天数:");
        while(true){
            try {
                day = scanner.nextInt();
                if(day < 0){
                    System.out.println("请输入大于等于0的整数：");
                }else{
                    break;
                }

            } catch (Exception e) {
                scanner = new Scanner(System.in);
                System.out.println("请输入大于等于0的整数：");
            }
        }
        totalPrice = totalPrice * day;
    }
    /**
    * @Description: 展示最终结算
    * @Param: []
    * @return: void
    * @Author: 李长武
    * @Date: 2020/5/18
    */
    public void resultShow(){
        int totalNumber = 0;//租车总数
        System.out.println("以下是你的详细账单:\n您租赁了");
        for (int i = 0; i < cars.length; i++) {
            if(carNum[i] > 0) {
                System.out.format("\t%s*%d\n", cars[i].getName(), carNum[i]);
                totalNumber += carNum[i];//计算租车总数
            }
        }
        System.out.format("共计%d辆车\n租车时间为%d天\n总共可载%d（人）,可载货%.2f（吨）\n",totalNumber,day,totalPassenger,totalLoad);
        System.out.format("您总共需要支付%d元\n",totalPrice);

        scanner.nextLine();scanner.nextLine();//等待用户输入回车
    }
}
