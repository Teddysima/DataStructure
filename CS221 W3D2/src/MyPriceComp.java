

import java.util.Comparator;

class MyPriceComp implements Comparator<Vehicle>{
	 
    @Override
    public int compare(Vehicle e1, Vehicle e2) {
        if(e1.getVehiclePrice() > e2.getVehiclePrice()){
            return 1;
        } else {
            return -1;
        }
    }
}