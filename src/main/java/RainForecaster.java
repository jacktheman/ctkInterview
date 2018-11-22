/**
 * Created by jackflurry on 2018-11-21.
 */
public class RainForecaster {

    public static void main(String[] args) {
        Consumer consumer = new Consumer();
        if(consumer.consume() != null){
            String weather = consumer.consume().getList().get(0).getWeather().get(0).getMain();
            System.out.println("The Weather in Gothenburg is " + weather + "!");
        }else{
            System.out.print("Something went wrong!");
        }
    }

}
