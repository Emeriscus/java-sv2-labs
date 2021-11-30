package methodpass.troopers;

import java.util.ArrayList;
import java.util.List;

public class HeadQuarter {

    private List<Trooper> troopers = new ArrayList<>();

    public List<Trooper> getTroopers() {
        return troopers;
    }

    public void addTrooper(Trooper trooper) {
        troopers.add(trooper);
    }

    public void moveTrooperByName(String name, Position target) {
        moveTrooper(findTrooperByName(name), target);
    }

    public void moveClosestTrooper(Position target) {
        if (target == null) {
            throw new IllegalArgumentException("The target position cannot be null");
        }
        moveTrooper(findClosestTrooper(target), target);
    }

    private Trooper findTrooperByName(String name) {
        for (Trooper actual : troopers) {
            if (actual.getName().equals(name)) {
                return actual;
            }
        }
        return null;
    }

    private Trooper findClosestTrooper(Position target) {
        Trooper result = troopers.get(0);
        for (Trooper actual : troopers) {
            if (actual.distanceFrom(target) < result.distanceFrom(target)) {
                result = actual;
            }
        }
        return result;
    }

    private void moveTrooper(Trooper trooper, Position target) {
        trooper.changePosition(target);
    }

}
