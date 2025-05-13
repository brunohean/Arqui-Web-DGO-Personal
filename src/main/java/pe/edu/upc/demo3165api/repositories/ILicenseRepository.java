package pe.edu.upc.demo3165api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.demo3165api.entities.License;
@Repository
public interface ILicenseRepository extends JpaRepository<License, Integer> {
}
