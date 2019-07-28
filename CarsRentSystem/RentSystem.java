package CarsRentSystem;

import java.io.IOException;

public class RentSystem {
    public static void main(String args[]) throws Exception {
        //将车辆信息录入系统
        Car[] cars = new Car[8];
        AllCars ac = new AllCars(8);
        ac.add(new PassengerCars(1,"小轿车",40,4));
        ac.add(new PassengerCars(2,"面包车",65,7));
        ac.add(new PassengerCars(3,"大巴车",180,20));
        ac.add(new GoodsCars(4,"低栏车",30,1.5f));
        ac.add(new GoodsCars(5,"高栏车",47,2.5f));
        ac.add(new GoodsCars(6,"厢式车",80,4.5f));
        ac.add(new PickUpCars(7,"日式皮卡车",60,5,1));
        ac.add(new PickUpCars(8,"美式皮卡车",60,2,3));
        cars = ac.getCars();
        //系统运行
        System.out.println("欢迎使用该租车系统！以下是本系统提供的所有车辆的信息：");
        //所有车辆信息的展示
        ac.ShowCars();
        /*
        输入序号x的租用数量，为0则下一个，为负或小数提示输入错误，并询问租车天数
        展示租车的最大载人载货量，总体租车费用，租车天数，租用车辆总数，各个车辆的租用数目（分行列出，为0不列出）
        */
        ac.AskForRent();
        //用户输入回车结束程序
        System.out.println("感谢您对本系统的使用！请按回车退出程序。");
        if (System.in.read() == '\n'){
            System.exit(0);
        }
    }
}
