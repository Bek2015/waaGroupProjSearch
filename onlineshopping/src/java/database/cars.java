/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Bereket
 */
public class cars {

    private List<car> cars = new ArrayList();

    public cars() {
        cars.add(new car("Honda", "Civic Ex", "2004", 45589, 4500, 2));
        cars.add(new car("Honda", "Civic Ex", "2004", 45589, 4500, 2));
        cars.add(new car("Honda", "Civic Ex", "2004", 45589, 4500, 2));

    }

    public List<car> getCars() {
        return cars;
    }

    public void setCars(List<car> cars) {
        this.cars = cars;
    }
    
    
}
