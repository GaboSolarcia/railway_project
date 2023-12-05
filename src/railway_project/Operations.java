package railway_project;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Operations {
    private Train trainsList;
    private Train trainsListBerlin;
    private Train trainsListMunich;
    private Train trainsListHamburg;
    private Train trainsListFrankfurt;
    private Train trainsListLeipzig;
    private City citiesList;
    private Person peopleBerlin;
    private Person peopleHamburg;
    private Person peopleMunich;
    private Person peopleLeipzig;
    private Person peopleFrankfurt;
    
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
        newNode.people_amount = 15;
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
        
    public boolean pushTrainIntoStacks(String actual_city, String destination, int people_amount, int trainId){
        Train newNode = new Train();
        newNode.actual_city = actual_city;
        newNode.destination = destination;
        newNode.people_amount = people_amount;
        newNode.trainId = trainId;
        newNode.next = null;
        try{
            switch (actual_city) {
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
        newNode.next = null;
        try {
            if(this.trainsList == null){
                this.trainsList = newNode;
            }
            else{
                newNode.next = this.trainsList;
                this.trainsList = newNode;
            }
            return true;
        } catch (Exception e){
            return false;
        }
    }
    
    public Train getTrainInfo(int trainId){
        Train aux = this.trainsListBerlin;
        while(aux.trainId != trainId){
            aux = aux.next;
            if(aux.next == null)
                break;
        }
        if(aux.trainId == trainId)
                return aux;
        aux = this.trainsListFrankfurt;
        while(aux.trainId != trainId){
            aux = aux.next;
            if(aux.next == null)
                break;
        }
        if(aux.trainId == trainId)
                return aux;
        aux = this.trainsListMunich;
        while(aux.trainId != trainId){
            aux = aux.next;
            if(aux.next == null)
                break;
        }
        if(aux.trainId == trainId)
                return aux;
        aux = this.trainsListLeipzig;
        while(aux.trainId != trainId){
            aux = aux.next;
            if(aux.next == null)
                break;
        }
        if(aux.trainId == trainId)
                return aux;
        aux = this.trainsListHamburg;
        while(aux.trainId != trainId){
            aux = aux.next;
            if(aux.next == null)
                break;
        }
        if(aux.trainId == trainId)
                return aux;
        return aux;
    }
    
    public City getCityInfo(String city){
        City aux = this.citiesList;
        while (aux.city != city){
            aux = aux.next;   
        }
        return aux;
    }
    
    public boolean pushPersonToCity(String city, String destination){
        Person newNode = new Person();
        newNode.actual_city = city;
        newNode.destination = destination;
        newNode.next = null;
        try{
            switch (city) {
                case "Berlin":
                    if(this.peopleBerlin == null)
                        this.peopleBerlin = newNode;
                    else{
                        newNode.next = this.peopleBerlin;
                        this.peopleBerlin = newNode;
                    }
                    break;
                case "Hamburg":
                    if(this.peopleHamburg == null)
                        this.peopleHamburg = newNode;
                    else{
                        newNode.next = this.peopleHamburg;
                        this.peopleHamburg = newNode;
                    }
                    break;
                case "Leipzig":
                    if(this.peopleLeipzig == null)
                        this.peopleLeipzig = newNode;
                    else{
                        newNode.next = this.peopleLeipzig;
                        this.peopleLeipzig = newNode;
                    }
                    break;
                case "Frankfurt":
                    if(this.peopleFrankfurt == null)
                        this.peopleFrankfurt = newNode;
                    else{
                        newNode.next = this.peopleFrankfurt;
                        this.peopleFrankfurt = newNode;
                    }
                    break;
                case "Munich":
                    if(this.peopleMunich == null)
                        this.peopleMunich = newNode;
                    else{
                        newNode.next = this.peopleMunich;
                        this.peopleMunich = newNode;
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
        
    public int getPeoplePerCity(String City){
        int amount = 1;
        Person aux = new Person();
        switch (City) {
            case "Berlin":
                aux = this.peopleBerlin;
                break;
            case "Hamburg":
                aux = this.peopleHamburg;
                break;
            case "Munich":
                aux = this.peopleMunich;
                break;
            case "Frankfurt":
                aux = this.peopleFrankfurt;
                break;
            case "Leipzig":
                aux = this.peopleLeipzig;
                break;
            default:
                break;
        }
        for(; aux.next != null; aux = aux.next, amount++);
        return amount;
    }
    
    public void moveTrains(){
        if(this.trainsListBerlin == null)
            System.out.println("No hay trenes en Berlin");
        else{
            Train firstTrain = this.trainsListBerlin;
            firstTrain.actual_city = firstTrain.destination;
            firstTrain.destination = newDestination(firstTrain.destination);
            this.trainsListBerlin = this.trainsListBerlin.next;
            switchCityList(firstTrain);
            
        }
        if(this.trainsListFrankfurt == null)
            System.out.println("No hay trenes en Frankfurt");
        else{
            Train firstTrain = this.trainsListFrankfurt;
            firstTrain.actual_city = firstTrain.destination;
            firstTrain.destination = newDestination(firstTrain.destination);
            this.trainsListFrankfurt = this.trainsListFrankfurt.next;
            switchCityList(firstTrain);
            
        }
        if(this.trainsListHamburg == null)
            System.out.println("No hay trenes en Hamburg");
        else{
            Train firstTrain = this.trainsListHamburg;
            firstTrain.actual_city = firstTrain.destination;
            firstTrain.destination = newDestination(firstTrain.destination);
            this.trainsListHamburg = this.trainsListHamburg.next;
            switchCityList(firstTrain);
        }
        if(this.trainsListLeipzig == null)
            System.out.println("No hay trenes en Leipzig");
        else{
            Train firstTrain = this.trainsListLeipzig;
            firstTrain.actual_city = firstTrain.destination;
            firstTrain.destination = newDestination(firstTrain.destination);
            this.trainsListLeipzig = this.trainsListLeipzig.next;
            switchCityList(firstTrain);
        }
        if(this.trainsListMunich == null)
            System.out.println("No hay trenes en Munich");
        else{
            Train firstTrain = this.trainsListMunich;
            firstTrain.actual_city = firstTrain.destination;
            firstTrain.destination = newDestination(firstTrain.destination);
            this.trainsListMunich = this.trainsListMunich.next;
            switchCityList(firstTrain);
        }
    }
    
    public boolean switchCityList(Train newTrain){
        try{
            switch (newTrain.destination) {
                case "Berlin":
                    if(this.trainsListBerlin == null)
                        this.trainsListBerlin = newTrain;
                    else{
                        newTrain.next = this.trainsListBerlin;
                        this.trainsListBerlin = newTrain;
                    }
                    break;
                case "Hamburg":
                    if(this.trainsListHamburg == null)
                        this.trainsListHamburg = newTrain;
                    else{
                        newTrain.next = this.trainsListHamburg;
                        this.trainsListHamburg = newTrain;
                    }
                    break;
                case "Leipzig":
                    if(this.trainsListLeipzig == null)
                        this.trainsListLeipzig = newTrain;
                    else{
                        newTrain.next = this.trainsListLeipzig;
                        this.trainsListLeipzig = newTrain;
                    }
                    break;
                case "Frankfurt":
                    if(this.trainsListFrankfurt == null)
                        this.trainsListFrankfurt = newTrain;
                    else{
                        newTrain.next = this.trainsListFrankfurt;
                        this.trainsListFrankfurt = newTrain;
                    }
                    break;
                case "Munich":
                    if(this.trainsListMunich == null)
                        this.trainsListMunich = newTrain;
                    else{
                        newTrain.next = this.trainsListMunich;
                        this.trainsListMunich = newTrain;
                    }
                    break;
                default:
                    break;
            }
            return true;
        } catch(Exception e){
            return false;
        }
        
    }

    private String newDestination(String destination) {
        List<String> cities = List.of("Berlin", "Munich", "Hamburg", "Frankfurt", "Leipzig");
        int randomCity;
        do{
            randomCity = ThreadLocalRandom.current().nextInt(0, 5);
        } while(cities.get(randomCity) == destination);
        return cities.get(randomCity);
    }
}
