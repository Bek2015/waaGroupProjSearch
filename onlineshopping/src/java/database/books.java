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
public class books {

private List<book> booklists = new ArrayList();

public books() {
    
booklists.add(new book("Introduction to Java Programming", "Zehafta T. Berhe", 2, 145));
booklists.add(new book("Web Application Architecture using Spring MVC", "Bereket Tesfatsion",5, 85));
booklists.add(new book("Debugging Your Programs","Ambasager Gebreseskel",5,45));
booklists.add(new book("Java Enterprise Architecture for Beginners", "Eyob Biratu",3,121));
}

    public List<book> getBooklists() {
        return booklists;
    }



}
