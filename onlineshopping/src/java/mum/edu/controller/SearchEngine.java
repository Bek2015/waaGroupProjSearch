/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum.edu.controller;

import database.book;
import database.books;
import database.car;
import database.cars;
import database.cloth;
import database.clothes;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author Bereket
 */
@Named("searchBn")
@SessionScoped
public class SearchEngine implements Serializable {

    private String selectedItem;
    private String enteredText;
    private List<book> foundBooks = new ArrayList();
    private List<car> foundCars = new ArrayList();
    private List<cloth> foundClothes = new ArrayList();

    public String getSelectedItem() {
        return selectedItem;
    }

    public void setSelectedItem(String selectedItem) {
        this.selectedItem = selectedItem;
    }

    public String getEnteredText() {
        return enteredText;
    }

    public void setEnteredText(String enteredText) {
        this.enteredText = enteredText;
    }

    public List<book> getFoundBooks() {
        return foundBooks;
    }

    public void setFoundBooks(List<book> foundBooks) {
        this.foundBooks = foundBooks;
    }

    public List<car> getFoundCars() {
        return foundCars;
    }

    public void setFoundCars(List<car> foundCars) {
        this.foundCars = foundCars;
    }

    public List<cloth> getFoundClothes() {
        return foundClothes;
    }

    public void setFoundClothes(List<cloth> foundClothes) {
        this.foundClothes = foundClothes;
    }

    public SearchEngine() {
    }

    public String viewSearch() {
        foundBooks.clear();
        if (selectedItem.equals("Books")) {
            books mybooks = new books();
            for (book b : mybooks.getBooklists()) {

                //if decide to include price as search criteria
//                try {
//                    int n = Integer.parseInt(enteredText);
//                    if (b.getPrice() <= n) {
//                        foundBooks.add(b);
//
//                    }
//
//                } catch (NumberFormatException e) {
//                    if (b.getTitle().toLowerCase().contains(enteredText.toLowerCase()) || b.getAuthor().toLowerCase().contains(enteredText.toLowerCase()) ) {
//                        foundBooks.add(b);
//
//                    }
//                }
                if (b.getTitle().toLowerCase().contains(enteredText.toLowerCase()) || b.getAuthor().toLowerCase().contains(enteredText.toLowerCase())) {
                    foundBooks.add(b);

                }

            }

            return "/booksearchresult";
        } else if (selectedItem.equals("Cars")) {
            foundCars.clear();
            cars mycars = new cars();
            for (car c : mycars.getCars()) {
                if (c.getMake().contains(enteredText) || c.getModel().contains(enteredText) || c.getYear().equals(enteredText)) {
                    foundCars.add(c);

                }

            }
            return "/carsearchresult";
        } else if (selectedItem.equals("Clothes")) {
            foundClothes.clear();
            clothes myclothes = new clothes();
            for (cloth cl : myclothes.getClothes()) {
                if (cl.getCatagory().contains(enteredText) || cl.getSection().contains(enteredText)) {
                    foundClothes.add(cl);

                }
            }
            return "/clothsearchresult";
        } else {
            return "/nothingfound";
        }

    }

}
