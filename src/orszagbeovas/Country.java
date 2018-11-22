/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orszagbeovas;

/**
 *
 * @author Diak
 */
public class Country {
    private String country;
    private int population;
    private int flagColours;
    private int borderCountries;

    public Country(String country, int population, int flagColours, int borderCountries) {
        this.country = country;
        this.population = population;
        this.flagColours = flagColours;
        this.borderCountries = borderCountries;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getFlagColours() {
        return flagColours;
    }

    public void setFlagColours(int flagColours) {
        this.flagColours = flagColours;
    }

    public int getBorderCountries() {
        return borderCountries;
    }

    public void setBorderCountries(int borderCountries) {
        this.borderCountries = borderCountries;
    }
    
}
