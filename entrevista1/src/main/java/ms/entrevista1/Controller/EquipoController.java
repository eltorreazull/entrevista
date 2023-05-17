package ms.entrevista1.Controller;

import ms.entrevista1.Entity.Equipo;
import ms.entrevista1.Service.EquipoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("equipo")
@RestController
public class EquipoController {
    @Autowired
    EquipoService equipoService;
    @GetMapping("/equipo/{id}")
    public Optional<Equipo> getEquipo(@PathVariable int id){return equipoService.getEquipo(id);}
    @GetMapping("/equipos")
    public List<Equipo> getEquipos(){return equipoService.getEquipos();}
    @PostMapping("/insertar")
    public  Equipo insertarEquipo(@RequestBody Equipo equipo){return equipoService.insertarEquipo(equipo);}
    @DeleteMapping("borrar/{id}")
    public  void  eliminar(@PathVariable int id){equipoService.eliminar(id);}
    @PutMapping("/modificar")
    public Equipo modificar(@RequestBody Equipo equipo){return equipoService.actualizar(equipo);}
}
