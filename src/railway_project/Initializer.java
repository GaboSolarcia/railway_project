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
        //app.showCities();
    }
    
    public Train create_trains(){
        int randomCity = 0;
        for(int i = 0; i <= 4; i++){
            for(int j = 0; j <= 1; j++){
                do{
                    randomCity = ThreadLocalRandom.current().nextInt(0, 5);
                } while(randomCity == i);
                int randomPeopleCount = ThreadLocalRandom.current().nextInt(1, 15);
                app.trainLists(cities.get(i), cities.get(randomCity), randomPeopleCount);   
            }
        }
        return app.getBerlinTrains();
    }
}
