package realnews;

public class PhraseOMatic {
    public static void main(String[] args) {
        String[] fastFood = {"Mcdonalds", "BurgerKing","Wayback Burgers" };
        String[] gasStation = {"Wawa", "Valero","Royal Farms" };
        String[] restaurants = {"Pats", "Trevis","Taco Jardin" };
        //find the lengths
        int oneLength = fastFood.length;
        int twoLength = gasStation.length;
        int threeLength = restaurants.length;

        // generate random numbers
        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        String phrase = fastFood[rand1] + ", " + gasStation[rand2] + ", and " + restaurants[rand3];

        System.out.println("My favorite places are "+ phrase);
    }
}
