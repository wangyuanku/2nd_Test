package CarsRentSystem;

import java.util.Scanner;

interface Car{
    int getNum(); //获取车辆序号
    String getName(); //获取车辆名称
    int getRentCost(); //获取车辆租车价格
    int getLoadPerson(); //获取车辆载人量
    float getLoadGoods(); //获取车辆载重量
}//车类型的接口

public class AllCars{
    private Car[] cars;
    private int   foot;

    public AllCars(int len){
        if(len>0){
            this.cars = new Car[len];
        } else {
            this.cars = new Car[1];
        }
    } //获取车辆类型个数
    public boolean add(Car car){
        if (this.foot < this.cars.length){
            this.cars[this.foot] = car;
            this.foot++;
            return true;
        } else {
            return false;
        }
    } // 录入车辆类型
    public Car[] getCars() {
        return cars;
    }   //得到车辆的对象数组
    public void ShowCars(){
        System.out.println("载客车：\n" +
                "序号\t车辆名称\t租车费用（元/（车·天））\t最大载人（人）");
        for (int i=0; i<=2; i++){
            System.out.println(cars[i].getNum() + "\t\t" + cars[i].getName() + "\t\t" + cars[i].getRentCost() + "\t\t\t\t\t\t\t" + cars[i].getLoadPerson());
        }
        System.out.println("载货车：\n" +
                "序号\t车辆名称\t租车费用（元/（车·天））\t最大载货（吨）");
        for (int i=3; i<=5; i++){
            System.out.println(cars[i].getNum() + "\t\t" + cars[i].getName() + "\t\t" + cars[i].getRentCost() + "\t\t\t\t\t\t\t" + cars[i].getLoadGoods());
        }
        System.out.println("皮卡车：\n" +
                "序号\t车辆名称\t租车费用（元/（车·天））\t最大载人（人）\t最大载货（吨）");
        for (int i=6; i<=7; i++){
            System.out.println(cars[i].getNum() + "\t\t" + cars[i].getName() + "\t" + cars[i].getRentCost() + "\t\t\t\t\t\t\t" + cars[i].getLoadPerson() + "\t\t\t\t" + (int)cars[i].getLoadGoods());
        }
    } //展示车辆信息
    public void AskForRent() throws Exception{
        int num[] = new int[cars.length];
        int person = 0;
        float goods = 0;
        int rentcost = 0;
        int day = 0;
        int carsum = 0;
        boolean flag = true;
        Scanner in  = new Scanner(System.in);
        System.out.print("请输入租车天数：");
        day = in.nextInt();
        for (int i=0; i<cars.length; i++){
            flag = true;
            System.out.print("请输入" + cars[i].getNum() + "的租用数量，为0则下一个:");
            while (flag == true){
                try{
                    num[i] = in.nextInt();
                    if (num[i] >= 0){
                        flag = false;
                    }
                    if (num[i] < 0 ){
                        System.out.print("输入错误！请输入正整数或者0：");
                        in.nextLine();
                    }
                } catch (Exception e){
                    System.out.print("输入错误！请输入正整数或者0：");
                    in.nextLine();
                }
            }
            person += num[i] * cars[i].getLoadPerson();
            goods += num[i] * cars[i].getLoadGoods();
            rentcost += num[i] * cars[i].getRentCost();
            carsum += num[i];
        }
        rentcost = rentcost * day;
        System.out.println("正在计算您的租车信息：");
        System.out.println("最大载人量：" + person + "人");
        System.out.println("最大载货量：" + goods + "吨");
        System.out.println("租车天数：" + day + "天");
        System.out.println("租车车辆总数：" + carsum + ", 其中有：" );
        for (int i=0; i<cars.length; i++){
            if (num[i] != 0){
                System.out.println(cars[i].getName() + "\t：" + num[i] + "辆");
            }
        }
        System.out.println("总体租车费用：" + rentcost + "元。");

    } //租车的详细情况
}
