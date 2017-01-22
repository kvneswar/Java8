package org.example;

public class Main {

	public static void main(String[] args) {

		Vehicle vehicle = new Vehicle() {

			@Override
			public void vehileInfo(String info) {
				System.out.println(info);
			}
		};

		printVehileInfo(vehicle, "My New Vehicle !!!");

		printVehileInfo((String str) -> 
			System.out.println(str) , "My New Vehicle !!!");
		
		printVehileInfo(System.out::println , "My New Vehicle !!!");
		
	}

	private static void printVehileInfo(Vehicle vehicle, String info){
		vehicle.vehileInfo(info);
	};

}





interface Vehicle{

	void vehileInfo(String info);

}
