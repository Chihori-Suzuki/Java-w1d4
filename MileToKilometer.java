
public class MileToKilometer {
    public static void main(String[] args) {
        int mile = 1;
        float km = 0F;
        System.out.println("Miles      Kilometers");
        while (mile <= 10){
            km = mile * 1.069F;
            System.out.println(mile + "            " + km);

            mile++;
        }
    }
}
