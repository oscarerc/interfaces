import java.util.ArrayList;
import java.util.List;

public class CocheCRUDImpl implements CocheCRUD {

    List<Coche> coches = new ArrayList<>();
    @Override
    public void save(Coche coche) {
        System.out.println("Agregado con exito");
        coches.add(coche);
    }
    @Override
    public List<Coche> findAll() {
        System.out.println(coches);
        return coches;
    }
    @Override
    public void delete(Coche coche) {
        coches.remove(coche);
    }
}
