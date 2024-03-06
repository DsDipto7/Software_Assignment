package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CityTest {
    @Test
    void testDelete(){


        City c1 = new City("Kingston", "Jamaica");
        City c2 = new City("Port of Spain", "Trinidad and Tobago");
        City c3 = new City("Bridgetown", "Barbados");
        City c4 = new City("Castries", "Saint Lucia");

        CityList cityList= new CityList();
        cityList.add(c1);
        cityList.add(c2);
        cityList.add(c3);
        cityList.add(c4);
        cityList.delete(c2);
        assertEquals(3,cityList.count());
    }
    @Test
    void testDeleteException(){
        City c1 = new City("Kingston", "Jamaica");
        City c2 = new City("Port of Spain", "Trinidad and Tobago");
        City c3 = new City("Bridgetown", "Barbados");
        City c4 = new City("Castries", "Saint Lucia");
        City c5 = new City("St. John's", "Antigua and Barbuda");
        CityList cityList= new CityList();
        cityList.add(c1);
        cityList.add(c2);
        cityList.add(c3);
        cityList.add(c4);

        assertThrows(IllegalArgumentException.class, () -> {
            cityList.delete(c5);
        });
    }

    @Test
    void testCount(){

        City c1 = new City("Kingston", "Jamaica");
        City c2 = new City("Port of Spain", "Trinidad and Tobago");
        City c3 = new City("Bridgetown", "Barbados");
        City c4 = new City("Castries", "Saint Lucia");
        City c5 = new City("St. John's", "Antigua and Barbuda");
        CityList cityList= new CityList();
        cityList.add(c1);
        cityList.add(c2);
        cityList.add(c3);
        cityList.add(c4);
        assertEquals(4,cityList.count());
    }
    @Test
    void testSort(){



        City c1 = new City("Kingston", "Jamaica");
        City c2 = new City("Port of Spain", "Trinidad and Tobago");
        City c3 = new City("Bridgetown", "Barbados");
        City c4 = new City("Castries", "Saint Lucia");

        CityList cityList= new CityList();
        cityList.add(c1);
        cityList.add(c2);
        cityList.add(c3);
        cityList.add(c4);
        assertEquals("Bridgetown",cityList.getCitiesNameSorted().get(0).getCityName());
        assertEquals("Castries",cityList.getCitiesNameSorted().get(1).getCityName());
        assertEquals("Kingston",cityList.getCitiesNameSorted().get(2).getCityName());
        assertEquals("Port of Spain",cityList.getCitiesNameSorted().get(3).getCityName());
    }

}