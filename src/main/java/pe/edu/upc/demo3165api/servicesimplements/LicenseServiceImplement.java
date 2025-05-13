package pe.edu.upc.demo3165api.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.demo3165api.entities.License;
import pe.edu.upc.demo3165api.repositories.ILicenseRepository;
import pe.edu.upc.demo3165api.servicesinterfaces.ILicenseService;

import java.util.List;

@Service
public class LicenseServiceImplement implements ILicenseService {
    @Autowired
    private ILicenseRepository lR;

    @Override
    public List<License> list() {
        return lR.findAll();
    }

    @Override
    public void insert(License license) {
        lR.save(license);
    }

    @Override
    public License searchId(int id) {
        return lR.findById(id).orElse(new License());
    }

    @Override
    public void update(License a) {
        lR.save(a);
    }

    @Override
    public void delete(int id) {
        lR.deleteById(id);
    }
}
