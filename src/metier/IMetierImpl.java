package metier;

import dao.IDao;

public class IMetierImpl implements IMetier {
    private IDao dao;
    @Override
    public double Calcul() {
        double temperature=dao.getData();
        double res =temperature*270/Math.sin(temperature*Math.cos(temperature));

        return res    ;
    }
/* ce setteur permet d'injecter la variable dao un objet d'une classe qui implemente l'interface IDa*/
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
