package railway_project;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Initializer {
    private Operations Op;
    
    public Initializer(){
        Op = new Operations();
    }    
    
    List<String> cities = List.of("Berlin", "Munich", "Hamburgo", "FrankFurt", "Leipzig");
    
    public void create_cities(){
        
        for (int i = 0; i < cities.size(); i++){
            Op.createCities(cities.get(i));
        }
    }
    
    public void create_trains(){
        int randomCity = 0;
        int trainId = 0;
        for(int i = 0; i <= 4; i++){
            for(int j = 0; j <= 1; j++){
                do{
                    randomCity = ThreadLocalRandom.current().nextInt(0, 5);
                } while(randomCity == i);
                int randomPeopleCount = ThreadLocalRandom.current().nextInt(1, 20);
                Op.trainList(cities.get(i), cities.get(randomCity), randomPeopleCount, trainId);  
                trainId++;
            }
        }
    }
    
    public Train getTrain(int trainId){
        return Op.getTrainInfo(trainId);
    }
    
    public City getCity(String city){
        return Op.getCityInfo(city);
    }
}
