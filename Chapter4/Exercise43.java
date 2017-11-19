/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

/**
 *
 * @author admin
 */
public class Exercise03 {
    public static void main(String[] args) {
        double radius = 6371.01;
        // Find the coordinates of four cities and convert to radians
        double atlantaLong = Math.toRadians(-84.38914111429442);
        double atlantaLat = Math.toRadians(33.747068484326746);
        double orlandoLong = Math.toRadians(-81.37923649999999);
        double orlandoLat = Math.toRadians(28.5383355);
        double savannahLong = Math.toRadians(-81.09983419999998);
        double savannahLat = Math.toRadians(32.0835407);
        double charlotteLong = Math.toRadians(-80.84312669999997);
        double charlotteLat = Math.toRadians(35.2270869);

        // Determine the distance between cities
        double distanceAtlantaOrlando = radius * Math.acos(Math.sin(atlantaLat) * Math.sin(orlandoLat) + 
                    Math.cos(atlantaLat) * Math.cos(orlandoLat) * 
                            Math.cos(atlantaLong - orlandoLong));
        double distanceAtlantaSavannah = radius * Math.acos(Math.sin(atlantaLat) * Math.sin(savannahLat) + 
                    Math.cos(atlantaLat) * Math.cos(savannahLat) * 
                            Math.cos(atlantaLong - savannahLong));
        double distanceSavannahOrlando = radius * Math.acos(Math.sin(savannahLat) * Math.sin(orlandoLat) + 
                    Math.cos(savannahLat) * Math.cos(orlandoLat) * 
                            Math.cos(savannahLong - orlandoLong));
        double distanceAtlantaCharlotte = radius * Math.acos(Math.sin(atlantaLat) * Math.sin(charlotteLat) + 
                    Math.cos(atlantaLat) * Math.cos(charlotteLat) * 
                            Math.cos(atlantaLong - charlotteLong));
        double distanceCharlotteSavannah = radius * Math.acos(Math.sin(charlotteLat) * Math.sin(savannahLat) + 
                    Math.cos(charlotteLat) * Math.cos(savannahLat) * 
                            Math.cos(charlotteLong - savannahLong));

        double firstPerimeter = (distanceAtlantaOrlando + distanceAtlantaSavannah + distanceSavannahOrlando) / 2;
        double firstArea = Math.sqrt(firstPerimeter * (firstPerimeter - distanceAtlantaOrlando) * (firstPerimeter - distanceAtlantaSavannah) * (firstPerimeter - distanceSavannahOrlando));
        double secondPerimeter = (distanceAtlantaSavannah + distanceAtlantaCharlotte + distanceCharlotteSavannah) / 2;
        double secondArea = Math.sqrt(secondPerimeter * (secondPerimeter - distanceAtlantaSavannah) * (secondPerimeter - distanceAtlantaCharlotte) * (secondPerimeter - distanceCharlotteSavannah));

        double totalArea = firstArea + secondArea;
        System.out.println(totalArea);
    }
}
