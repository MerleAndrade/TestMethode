public class LimitPerson {

    public static void main(String[] args) {

    }

    public static String limitedPerson( int numberOfPerson){

        if(numberOfPerson > 30){
            return "Zu viele Personen";
        }
        else{
            return "Maximale Personenanzahl nicht überschritten";
        }
    }

}
