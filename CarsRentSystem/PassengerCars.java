package CarsRentSystem;
/*
载客车类
 */
public class PassengerCars implements Car{
    private int    num;
    private String name;
    private int    rentcost;
    private int    loadperson;

    public PassengerCars(int num, String name, int rentcost, int loadperson){
        this.num = num;
        this.name = name;
        this.rentcost = rentcost;
        this.loadperson = loadperson;
    }
    @Override
    public int getNum() {
        return num;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getRentCost() {
        return rentcost;
    }

    @Override
    public int getLoadPerson() {
        return loadperson;
    }

    @Override
    public float getLoadGoods() {
        return 0;
    }
}
