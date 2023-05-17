package ms.entrevista1.Service;

import ms.entrevista1.Entity.Equipo;
import ms.entrevista1.Repository.EquipoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EquipoService {
    @Autowired
    EquipoRepository equipoRepository;
    public Optional<Equipo> getEquipo(Integer id){return equipoRepository.findById(id);}
    public List<Equipo> getEquipos(){return equipoRepository.findAll();}
    public Equipo insertarEquipo(Equipo equipo){return equipoRepository.save(equipo);}
    public void  eliminar(Integer id){equipoRepository.deleteById(id);}
    public Equipo actualizar(Equipo equipo){return equipoRepository.save(equipo);}


}
