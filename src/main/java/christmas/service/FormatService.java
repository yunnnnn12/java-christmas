package christmas.service;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class FormatService {
    public ArrayList<List> formatingOrder(String inputs){
        ArrayList<List> nameAndQuantity = new ArrayList<>();
        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> quantities = new ArrayList<>();
        StringTokenizer tokenizer= new StringTokenizer(inputs,",");

        while(tokenizer.hasMoreTokens()){
            String menu = tokenizer.nextToken();
            String[] menuArr = menu.split("-");
            names.add(menuArr[0]);
            quantities.add(menuArr[1]);
        }
        nameAndQuantity.add(names);
        nameAndQuantity.add(quantities);


        return nameAndQuantity;
    }

}
