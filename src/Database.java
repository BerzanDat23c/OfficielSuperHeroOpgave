import java.util.ArrayList;
import java.util.List;

public class Database {
    private final List<Object> superheroes;

    public Database(){
        this.superheroes = new ArrayList<>();
    }
    Class Superhero;
    public <Superhero> void addSuperhero(Superhero superhero) {
        superheroes.add(superhero);
    }

    public List<Object> getSuperheroes() {
        return superheroes;
    }

    public Object searchSuperhero(String name) {
        for (Object superhero : superheroes) {
            if (superhero.toString().equalsIgnoreCase)) {
                return superhero;
            }
        }
        return null;
    }

    public List<Object> searchSuperherosByPartialname(String partialName) {
        List<Object> matchingSuperheroes = new ArrayList<>();
        for (Object superhero : superheroes) {
            if (superhero.toString().toLowerCase().contains(partialName.toLowerCase())) {
                matchingSuperheroes.add(superhero);
            }
        }
        return matchingSuperheroes;
    }

    public boolean updateSuperhero(String name, Object newSuperhero){
        for (int i = 0; i < superheroes.size(); i++) {
            Object superhero = superheroes.get(i);
            if (superhero.toString().equalsIgnoreCase(name)) {
                superheroes.set(i,newSuperhero);
                return true;
            }
        }
        return false;
    }

    public boolean deleteSuperhero(String name) {
        for (Object superhero : superheroes) {
            if (superhero.toString().equalsIgnoreCase(name)) {
                superheroes.remove(superhero);
                return true;
            }
        }
        return false;
    }
}

