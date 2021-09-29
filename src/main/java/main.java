import java.time.LocalTime;

public class main {

    public static void main (String args []){


        LocalTime openingTime = LocalTime.parse("09:00:00");
        LocalTime closingTime = LocalTime.parse("22:00:00");

        Restaurant restaurant = new Restaurant("Amelie's cafe","Chennai", openingTime, closingTime);

        restaurant.addToMenu("Sweet Corn Soup", 119);
        restaurant.addToMenu("Vegetable Lasagne",269);

    }

}
