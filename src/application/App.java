package application;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static Element arr[][] = new Element[3][3];

    public static void main(String[] args) {

        for (int j = 0; j < 3; j++) {
            for (int k = 0; k < 3; k++) {
                Element e = new Element(j, k);
                arr[j][k] = e;
            }
        }

        //TEST//
        Element element = new Element(2, 2);
        List<Element> neighbors = getNeighbors(element);

        for (Element n : neighbors) {
            System.out.println("(" + n.x + "; " + n.y + ")");

        }
    }

    public static List<Element> getNeighbors(Element e) {
        ArrayList<Element> neighbors = new ArrayList<Element>();

        if(e.x == 0) {
            neighbors.add(arr[e.x + 1][e.y]);
            if (e.y != 0) {
                neighbors.add(arr[e.x][e.y - 1]);
                neighbors.add(arr[e.x + 1][e.y - 1]);
            }
            if (e.y != 2) {
                neighbors.add(arr[e.x][e.y + 1]);
                neighbors.add(arr[e.x + 1][e.y + 1]);
            }
        }

        else if (e.x == 2){
            neighbors.add(arr[e.x - 1][e.y]);
            if (e.y != 0) {
                neighbors.add(arr[e.x][e.y - 1]);
                neighbors.add(arr[e.x - 1][e.y - 1]);
            }
            if (e.y != 2) {
                neighbors.add(arr[e.x][e.y + 1]);
                neighbors.add(arr[e.x - 1][e.y + 1]);
            }
        }
        else if (e.x == 1){
            neighbors.add(arr[e.x + 1][e.y]);
            neighbors.add(arr[e.x - 1][e.y]);

            if(e.y != 0) {
                neighbors.add(arr[e.x - 1][e.y - 1]);
                neighbors.add(arr[e.x][e.y - 1]);
                neighbors.add(arr[e.x + 1][e.y - 1]);
            }

            if(e.y != 2) {
                neighbors.add(arr[e.x - 1][e.y + 1]);
                neighbors.add(arr[e.x][e.y + 1]);
                neighbors.add(arr[e.x + 1][e.y + 1]);
            }
        }

        return neighbors;
    }

}
