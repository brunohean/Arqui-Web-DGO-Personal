package pe.edu.upc.demo3165api.servicesinterfaces;

import pe.edu.upc.demo3165api.entities.App;

import java.util.List;

public interface IAppService {
    public List<App> list();

    public void insert(App a);

    public App searchId(int id);

    public void update(App a);

    public void delete(int id);
    public List<App> search(String name);
}
