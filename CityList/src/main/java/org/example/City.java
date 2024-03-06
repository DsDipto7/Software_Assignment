package org.example;

public class City implements Comparable<City>{
    private String city;
    private String province;

    /**
     * It is a constructor
     * @param city
     * name of city
     * @param province
     * name of province
     */
    City(String city, String province){
        this.city = city;
        this.province = province;
    }

    /**
     * It ia a function which
     * returns the city name(String)
     * @return
     */
    String getCityName(){
        return this.city;
    }

    /**
     * It returns the province name(String)
     * @return
     */
    String getProvinceName(){

        return this.province;
    }

    /**
     * This is  used in sorting operation
     * @param city the object to be compared.
     * @return
     */

    @Override
    public int compareTo(City city) {

        return this.city.compareTo(city.getCityName());
    }
}
