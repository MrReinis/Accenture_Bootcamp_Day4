import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main (String [] args){



        String [] myArray = new String[] {"RED","BLACK", "GREEN", "BLUE", "PINK", "PURPLE", "ORANGE"};
        List<String> colors = new ArrayList<>(Arrays.asList(myArray));

        System.out.println(myArray);
        System.out.println(colors);


        int endOfList = colors.size();

        colors.add(endOfList, "GREY");
        colors.remove(3);

        System.out.println("Colors after remove and add of element " +colors);

        colors.add(0,"BROWN");
        System.out.println("Colors plus the added color " +colors);



        for (int i = 0; i < colors.size(); i++){

            System.out.println(colors.get(i));

        }

        List<String> colorSublist = colors.subList(2 ,5);
        System.out.println("Color Sublist " + colorSublist );


        for (int j = 0; j < colorSublist.size(); j++){

            System.out.println(colors.get(j));


            }


        }



    }


