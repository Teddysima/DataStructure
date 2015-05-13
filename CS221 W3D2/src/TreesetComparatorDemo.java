import java.util.TreeSet;


public class TreesetComparatorDemo {

	public static void main(String a[]){
       
        TreeSet<Vehicle> priceComp = new TreeSet<Vehicle>(new MyPriceComp());
        priceComp.add(new Vehicle("Toyota",3000,1998));
        priceComp.add(new Vehicle("Honda",6000,1982));
        priceComp.add(new Vehicle("Acurra",2000,2000));
        priceComp.add(new Vehicle("Ford",2400,1955));
    
        for(Vehicle e:priceComp){
            System.out.println(e);
        }
	}
}
/*output
VehicleName:  Acurra VehiclePrice:  2000 Vehiclemodel:     2000
VehicleName:  Ford VehiclePrice:  2400 Vehiclemodel:     1955
VehicleName:  Toyota VehiclePrice:  3000 Vehiclemodel:     1998
VehicleName:  Honda VehiclePrice:  6000 Vehiclemodel:     1982*/