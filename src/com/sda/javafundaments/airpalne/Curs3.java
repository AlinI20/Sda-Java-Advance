package com.sda.airpalne;

public class Curs3 {

    public static void main(String[] args) {
//	    Pet cat = new Pet();
//	    cat.type = "felina";
//	    cat.nume = "kity";
//	    cat.sound = "miau!";
//		cat.greutate = 5;
//	    cat.makeSound();
//
//	    Pet dog = new Pet();
//	    dog.type = "Beagle";
//	    dog.nume = "Hatchico";
//	    dog.sound = "Woof!";
//	    dog.greutate = 7;
//	    dog.makeSound();

//		Person p1 = new Person();
//		p1.nume = "Purcaroiu";
//		p1.prenume = "Alexandru";
//		p1.varsta = 33;
//
//		Person p2 = new Person();
//		p2.nume = "Ionut";
//		p2.prenume = "Marius";
//		p2.varsta = 22;
//
//		Person[] persons = {p1, p2};
//		for(int index = 0; index < persons.length; index++){
//			persons[index].sayHello();
//		}

		Engine engine = new Engine(1000, "id-1");
		Seat seat1 = new Seat(21, false);
		Seat seat2 = new Seat(25, true);
		Seat[] seats = {seat1, seat2};
		Airplane airplane = new Airplane("WizzAir", engine, seats);
    	airplane.getInfo();
    	seat2.bookSeat();
		System.out.println("------------------------------------------------");
		airplane.getInfo();

		Seat[] freeSeats = airplane.getFreeSeats();
		int counter=0;
		for(int index=0; index < freeSeats.length; index++){
			if(freeSeats[index] != null){
				counter++;
			}
		}
		System.out.println("Locuri libere: " + counter);

		airplane.engine.startEngine();
		airplane.engine.increaseSpeed(100);
		airplane.engine.increaseSpeed(200);
		airplane.engine.increaseSpeed(800);
		airplane.engine.increaseSpeed(800);
    }
}
