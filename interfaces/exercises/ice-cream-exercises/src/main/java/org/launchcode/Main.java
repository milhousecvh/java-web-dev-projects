package org.launchcode;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();

        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name' field.
      Comparator comparator = new FlavorComparator();
      flavors.sort(comparator);
        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost' field.
        Comparator conecomp = new ConeComparator();
        cones.sort(conecomp);
        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
        for (int i = 0; i < flavors.size(); i++) {
            System.out.println(flavors.get(i).getName());
        }

        for (int j = 0; j < cones.size(); j++) {
            System.out.println(cones.get(j).getName() + " - " + cones.get(j).getCost());
        }
    }
}