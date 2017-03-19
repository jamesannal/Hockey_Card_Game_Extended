package hockey.hockeygame;

import java.util.ArrayList;

/**
 * Created by user on 18/03/2017.
 */

public class History {
    private ArrayList<String> results;

    public History() {
        this.results = new ArrayList<String>();
    }

    public void add(String string) {
        results.add(string);
    }

    public void showResults() {
        for (String result : results) {
            System.out.println(result);
        }
        this.results.clear();
    }
}
