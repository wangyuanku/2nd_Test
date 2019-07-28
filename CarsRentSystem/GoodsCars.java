package CarsRentSystem;
/*
载货车类
 */
public class GoodsCars implements Car{
    private int    num;
    private String name;
    private int    rentcost;
    private float    loadgoods;
    public GoodsCars(int num,String name, int rentcost, float loadgoods){
        this.name = name;
        this.rentcost = rentcost;
        this.loadgoods = loadgoods;
        this.num = num;
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
        return 0;
    }

    @Override
    public float getLoadGoods() {
        return loadgoods;
    }

    @Override
    public int getNum(){
        return num;
    }
}
