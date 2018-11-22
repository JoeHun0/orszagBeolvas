/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orszagbeovas;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Diak
 */
public class Tasks {

    private List<Country> c = new ArrayList<>();

    public void beolvas(String file) {

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            while ((line = br.readLine()) != null) {
                String[] s = line.split(" ");
                Country be = new Country(s[0], Integer.parseInt(s[1]), Integer.parseInt(s[2]), Integer.parseInt(s[3]));
                c.add(be);
            }
        } catch (FileNotFoundException fe) {
            System.out.println("Hibás fájlnév. " + fe.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public int biggerThanTenmillion() {
        int nov = 0;
        for (int i = 0; i != c.size(); i++) {
            if (c.get(i).getPopulation() > 10) {
                nov++;
            }
        }
        return nov;
    }

    public double averagePopulation() {
        int pop = 0;

        for (int i = 0; i != c.size(); i++) {
            pop += c.get(i).getPopulation();

        }
        return pop / c.size();
    }

    public int colors() {
        int help = 0;
        int help2 = 0;
        for (int i = 0; i != c.size(); i++) {
            if (c.get(i).getCountry().length() > help2) {
                help = i;
                help2 = c.get(i).getCountry().length();
            }
        }
        return c.get(help).getFlagColours();
    }

    public boolean isSmallerThanFivemillion() {
        boolean re = false;
        for (int i = 0; i != c.size(); i++) {
            if (c.get(i).getPopulation() < 5) {
                re = true;
            }
        }
        return re;
    }

    public int gap() {
        int help = 0;
        int help2 = c.get(0).getPopulation();
        for (int i = 0; i != c.size(); i++) {
            if (c.get(i).getPopulation() > help) {
                help = c.get(i).getPopulation();
            }
            if (c.get(i).getPopulation() < help2) {
                help2 = c.get(i).getPopulation();
            }
        }
        return help - help2;
    }
}
