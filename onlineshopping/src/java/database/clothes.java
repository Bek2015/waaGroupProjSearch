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
public class clothes {
  
    private List<cloth> clothes = new ArrayList();

public clothes() {
clothes.add(new cloth("jeans","men","medium",256,5));
clothes.add(new cloth("coats","men","large",156,15));
clothes.add(new cloth("dresses","women","medium",86,2));
}

    public List<cloth> getClothes() {
        return clothes;
    }

    public void setClothes(List<cloth> clothes) {
        this.clothes = clothes;
    }


}
