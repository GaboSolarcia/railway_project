package railway_project;

public class Operations {
    private Train trainsListBerlin;
    private Train trainsListMunich;
    private Train trainsListHamburg;
    private Train trainsListFrankfurt;
    private Train trainsListLeipzig;
    private City citiesList;
    
            
    public Operations(){
        this.trainsListBerlin = null;
        this.trainsListMunich = null;
        this.trainsListHamburg = null;
        this.trainsListFrankfurt = null;
        this.trainsListLeipzig = null;
        this.citiesList = null;
    }
    
    public boolean createCities(String city){
        City newNode = new City();
        newNode.name = city;
        newNode.people_amount = 0;
        newNode.trains_amount = 0;
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
    
    public void showCities(){
        try{
            if (this.citiesList == null) 
                System.out.println("No hay ciudades creadas");
            else{
                City aux = citiesList;
                for(; aux != null; System.out.println(aux.name), aux = aux.next);
            }
        }
        catch (Exception e){
            System.out.println("Hubo un problema al conectar con la lista");
        }
    }
    
    public boolean trainLists(String actual_city, String destination, int people_amount){
        Train newNode = new Train();
        newNode.actual_city = actual_city;
        newNode.destination = destination;
        newNode.people_amount = people_amount;
        switch (actual_city) {
            case "Berlin":
                try {
                    if(this.trainsListBerlin == null){
                        this.trainsListBerlin = newNode;
                    }
                    else{
                        newNode.next = this.trainsListBerlin;
                        this.trainsListBerlin = newNode;
                    }
                    return true;
                } catch (Exception e) {
                    return false;
                }
            case "Munich":
                try {
                    if(this.trainsListMunich == null){
                        this.trainsListMunich = newNode;
                    }
                    else{
                        newNode.next = this.trainsListMunich;
                        this.trainsListMunich = newNode;
                    }
                    return true;
                } catch (Exception e) {
                    return false;
                }
            case "Hamburg":
                try {
                    if(this.trainsListHamburg == null){
                        this.trainsListHamburg = newNode;
                    }
                    else{
                        newNode.next = this.trainsListHamburg;
                        this.trainsListHamburg = newNode;
                    }
                    return true;
                } catch (Exception e) {
                    return false;
                }
            case "Frankfurt":
                try {
                    if(this.trainsListFrankfurt == null){
                        this.trainsListFrankfurt = newNode;
                    }
                    else{
                        newNode.next = this.trainsListFrankfurt;
                        this.trainsListFrankfurt = newNode;
                    }
                    return true;
                } catch (Exception e) {
                    return false;
                }
            case "Leipzig":
                try {
                    if(this.trainsListLeipzig == null){
                        this.trainsListLeipzig = newNode;
                    }
                    else{
                        newNode.next = this.trainsListLeipzig;
                        this.trainsListLeipzig = newNode;
                    }
                    return true;
                } catch (Exception e) {
                    return false;
                }
            default:
                return false;
        }
    }
}
