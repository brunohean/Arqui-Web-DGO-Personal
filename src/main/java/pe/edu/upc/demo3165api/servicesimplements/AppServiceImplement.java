package pe.edu.upc.demo3165api.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.demo3165api.entities.App;
import pe.edu.upc.demo3165api.repositories.IAppRepository;
import pe.edu.upc.demo3165api.servicesinterfaces.IAppService;

import java.util.List;

@Service
public class AppServiceImplement implements IAppService {
    @Autowired
    private IAppRepository aR;

    @Override
    public List<App> list() {
        return aR.findAll();
    }

    @Override
    public void insert(App a) {
        aR.save(a);
    }

    @Override
    public App searchId(int id) {
        return aR.findById(id).orElse(new App());
    }

    @Override
    public void update(App a) {
        aR.save(a);
    }

    @Override
    public void delete(int id) {
        aR.deleteById(id);
    }

    @Override
    public List<App> search(String name) {
        return aR.buscar(name);
    }
}
