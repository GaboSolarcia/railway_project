package railway_project;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Initializer {
    Operations app = new Operations();
    List<String> cities = List.of("Berlin", "Munich", "Hamburgo", "FrankFurt", "Leipzig");
    
    public void create_cities(){
        for (int i = 0; i < cities.size(); i++){
            app.createCities(cities.get(i));
        }
        app.showCities();
    }
    
    public void create_trains(){
        for(int i = 0; i <= 4; i++){
            for(int j = 0; j <= 1; j++){
                int randomInt = ThreadLocalRandom.current().nextInt(0, 5);
                
                
            }
        }
    }
}
