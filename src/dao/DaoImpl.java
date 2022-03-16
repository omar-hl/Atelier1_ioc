package dao;

public class DaoImpl implements IDao{

    @Override
    public double getData() {
        System.out.println("Version1 BD");
        double temperature=Math.random()*30;
        return temperature;
    }
}
