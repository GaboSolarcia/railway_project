package railway_project;

public class Operations {
    private Train trainsList;
    private City trainsListBerlin;
    private City trainsListMunich;
    private City trainsListHamburg;
    private City trainsListFrankfurt;
    private City trainsListLeipzig;
    private City citiesList;
    
    public Operations(){
        this.trainsList = null;
        this.trainsListBerlin = null;
        this.trainsListMunich = null;
        this.trainsListHamburg = null;
        this.trainsListFrankfurt = null;
        this.trainsListLeipzig = null;
        this.citiesList = null;
    }
    
    public boolean createCities(String city){
        City newNode = new City();
        newNode.city = city;
        newNode.people_amount = 0;
        newNode.next = null;
        try{
            if(this.citiesList == null)
                this.citiesList = newNode;
            else{
                newNode.next = this.citiesList;
                this.citiesList = newNode;                
            }
            return true;
        }catch(Exception e){
            return false;
        }
    }
    
    public boolean createCitiesStacks(String city){
        City newNode = new City();
        newNode.city = city;
        newNode.people_amount = 0;
        newNode.next = null;
        try{
            switch (city) {
                case "Berlin":
                    if(this.trainsListBerlin == null)
                        this.trainsListBerlin = newNode;
                    else{
                        newNode.next = this.trainsListBerlin;
                        this.trainsListBerlin = newNode;
                    }
                    break;
                case "Hamburg":
                    if(this.trainsListHamburg == null)
                        this.trainsListHamburg = newNode;
                    else{
                        newNode.next = this.trainsListHamburg;
                        this.trainsListHamburg = newNode;
                    }
                    break;
                case "Leipzig":
                    if(this.trainsListLeipzig == null)
                        this.trainsListLeipzig = newNode;
                    else{
                        newNode.next = this.trainsListLeipzig;
                        this.trainsListLeipzig = newNode;
                    }
                    break;
                case "Frankfurt":
                    if(this.trainsListFrankfurt == null)
                        this.trainsListFrankfurt = newNode;
                    else{
                        newNode.next = this.trainsListFrankfurt;
                        this.trainsListFrankfurt = newNode;
                    }
                    break;
                case "Munich":
                    if(this.trainsListMunich == null)
                        this.trainsListMunich = newNode;
                    else{
                        newNode.next = this.trainsListMunich;
                        this.trainsListMunich = newNode;
                    }
                    break;
                default:
                    break;
            }
            return true;
        }catch(Exception e){
            return false;
        }
    }
    
    public boolean trainList(String actual_city, String destination, int people_amount, int trainId){
        Train newNode = new Train();
        newNode.actual_city = actual_city;
        newNode.destination = destination;
        newNode.people_amount = people_amount;
        newNode.trainId = trainId;
        createCitiesStacks(actual_city);
        try {
            if(this.trainsList == null){
                this.trainsList = newNode;
            }
            else{
                newNode.next = this.trainsList;
                this.trainsList = newNode;
            }
            createCitiesStacks(actual_city);
            return true;
        } catch (Exception e){
            return false;
        }
    }
    
    public Train getTrainInfo(int trainId){
        Train selectedTrain = new Train();
        Train aux = this.trainsList;
        while(aux.trainId != trainId){
            aux = aux.next;
        }
        selectedTrain.actual_city = aux.actual_city;
        selectedTrain.destination = aux.destination;
        selectedTrain.people_amount = aux.people_amount;
        
        return selectedTrain;
    }
    
    public City getCityInfo(String city){
        City aux = this.citiesList;
        while (aux.city != city){
            System.out.println(aux.city);
            aux = aux.next;
        }
        return aux;
    }
        
}
