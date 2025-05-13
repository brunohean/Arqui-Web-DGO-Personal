package pe.edu.upc.demo3165api.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.demo3165api.dtos.AppDTO;
import pe.edu.upc.demo3165api.dtos.LicenseDTO;
import pe.edu.upc.demo3165api.entities.App;
import pe.edu.upc.demo3165api.entities.License;
import pe.edu.upc.demo3165api.servicesinterfaces.ILicenseService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/licencias")
public class LicenseController {
    @Autowired
    private ILicenseService lS;

    @GetMapping("/listado")
    public List<LicenseDTO> listar() {
        return lS.list().stream().map(p -> {
            ModelMapper m = new ModelMapper();
            return m.map(p, LicenseDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void insertar(@RequestBody LicenseDTO dto) {
        ModelMapper m = new ModelMapper();
        License l = m.map(dto, License.class);
        lS.insert(l);
    }

    @GetMapping("/{id}")
    public LicenseDTO listarId(@PathVariable("id") int id) {
        ModelMapper m = new ModelMapper();
        LicenseDTO dto = m.map(lS.searchId(id), LicenseDTO.class);
        return dto;
    }

    @PutMapping
    public void modificar(@RequestBody LicenseDTO dto) {
        ModelMapper m = new ModelMapper();
        License a = m.map(dto, License.class);
        lS.update(a);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") int id) {
        lS.delete(id);
    }
}
