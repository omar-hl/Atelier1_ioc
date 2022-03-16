package ext;

import dao.IDao;

public class DaoImpl2 implements IDao {
    @Override
    public double getData() {
        System.out.println("Version 2");
        double temperature=1000;
        return temperature;
    }
}
