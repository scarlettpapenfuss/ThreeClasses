package org.vashonsd;

public class clothing {
    int currentTemp;
    String location;
    String timeOfDay;


    public clothing(int currentTemp, String location, String timeOfDay) {
        this.currentTemp =  currentTemp;
        this.location = location;
        this.timeOfDay = timeOfDay;
    }

    public void whatClothes(int currentTemp) {
        if (currentTemp >= 70) {
            System.out.println("Wear clothing like shorts or a tank top");
        } else if (currentTemp >= 50) {
            System.out.println("wear jeans and a shirt");
        } else {
            System.out.println("Wear a hoodie or sweatshirt with thick pants");
        }
    }

    public void bringJacket(int currentTemp){
        if(currentTemp <= 60){
            System.out.println("Bring a jacket");
        }else{
            System.out.println("You will not need a jacket today");
        }
    }
}


