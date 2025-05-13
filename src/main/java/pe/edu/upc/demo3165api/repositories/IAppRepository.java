package pe.edu.upc.demo3165api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.demo3165api.entities.App;

import java.util.List;

@Repository
public interface IAppRepository extends JpaRepository<App,Integer> {
    @Query("Select a from App a where a.nameApp like %:nombre%")
    public List<App> buscar(@Param("nombre") String nombre);
}
