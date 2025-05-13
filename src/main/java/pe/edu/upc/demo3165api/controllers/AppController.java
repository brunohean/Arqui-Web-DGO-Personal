package pe.edu.upc.demo3165api.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.demo3165api.dtos.AppDTO;
import pe.edu.upc.demo3165api.entities.App;
import pe.edu.upc.demo3165api.servicesinterfaces.IAppService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/aplicaciones")
public class AppController {
    @Autowired
    private IAppService aS;

    @GetMapping
    @PreAuthorize("hasAnyAuthority('ADMIN','OPE')")
    public List<AppDTO> listar() {
        return aS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, AppDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping
    @PreAuthorize("hasAnyAuthority('ADMIN','PARCA')")
    public void insertar(@RequestBody AppDTO dto) {
        ModelMapper m = new ModelMapper();
        App a = m.map(dto, App.class);
        aS.insert(a);
    }
    @GetMapping("/{id}")
    @PreAuthorize("hasAnyAuthority('ADMIN','OPE','PARCA')")
    public AppDTO listarId(@PathVariable("id") int id) {
        ModelMapper m = new ModelMapper();
        AppDTO dto = m.map(aS.searchId(id), AppDTO.class);
        return dto;
    }
    @PutMapping
    public void modificar(@RequestBody AppDTO dto) {
        ModelMapper m = new ModelMapper();
        App a = m.map(dto, App.class);
        aS.update(a);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") int id) {
        aS.delete(id);
    }

    @GetMapping("/busquedas")
    public List<AppDTO> buscar(@RequestParam String n){
        return aS.search(n).stream().map(h->{
            ModelMapper m = new ModelMapper();
            return m.map(h, AppDTO.class);
        }).collect(Collectors.toList());
    }


}
