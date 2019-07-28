package CarsRentSystem;
/*
皮卡车类
 */
public class PickUpCars implements Car{
    private int num;
    private String name;
    private int    rentcost;
    private int    loadperson;
    private float    loadgoods;

    public PickUpCars(int num, String name, int rentcost, int loadperson, float loadgoods){
        this.num = num;
        this.name = name;
        this.rentcost = rentcost;
        this.loadgoods = loadgoods;
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
        return loadgoods;
    }
}
