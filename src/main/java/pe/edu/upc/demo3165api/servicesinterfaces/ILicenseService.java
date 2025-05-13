package pe.edu.upc.demo3165api.servicesinterfaces;

import pe.edu.upc.demo3165api.entities.App;
import pe.edu.upc.demo3165api.entities.License;

import java.util.List;

public interface ILicenseService {
    public List<License> list();
    public void insert(License license);
    public License searchId(int id);

    public void update(License a);

    public void delete(int id);
}
