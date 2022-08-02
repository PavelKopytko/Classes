package by.epam.tr.airline;

import java.util.Date;

public class Main {

	public static void main(String[] args) {

		Airport airport = new Airport();

		airport.add(new Airline("Анталия", "B2 8204", AirplaneType.PASSENGER, new Date(122, 06, 31, 4, 20),
				new DayOfWeek[] { DayOfWeek.MONDAY, DayOfWeek.SUNDAY, DayOfWeek.TUESDAY }));
		airport.add(new Airline("Сочи", "B2 926", AirplaneType.PASSENGER, new Date(122, 06, 31, 7, 00),
				new DayOfWeek[] { DayOfWeek.MONDAY, DayOfWeek.SUNDAY }));
		airport.add(new Airline("Тбилиси", "B2 736", AirplaneType.PASSENGER, new Date(122, 06, 31, 8, 10),
				new DayOfWeek[] { DayOfWeek.TUESDAY, DayOfWeek.SUNDAY }));
		airport.add(new Airline("Ереван", "B2 734", AirplaneType.PASSENGER, new Date(122, 06, 31, 9, 20),
				new DayOfWeek[] { DayOfWeek.TUESDAY }));
		airport.add(new Airline("Москва", "B2 958", AirplaneType.PASSENGER, new Date(122, 06, 31, 13, 40),
				new DayOfWeek[] { DayOfWeek.SUNDAY, DayOfWeek.TUESDAY }));
		airport.add(new Airline("Анталия", "B2 8106", AirplaneType.PASSENGER, new Date(122, 06, 31, 14, 50),
				new DayOfWeek[] { DayOfWeek.MONDAY, DayOfWeek.SUNDAY, DayOfWeek.TUESDAY, DayOfWeek.FRIDAY }));
		airport.add(new Airline("Москва", "B2 982", AirplaneType.PASSENGER, new Date(122, 06, 31, 16, 50),
				new DayOfWeek[] { DayOfWeek.MONDAY, DayOfWeek.WEDNESDAY, DayOfWeek.SUNDAY, DayOfWeek.TUESDAY }));

		AirportLogic logic = new AirportLogic();

		AirportView view = new AirportView();

		view.print(logic.listByDestination(airport, "москва"));

		System.out.println();

		view.print(logic.listByDay(airport, DayOfWeek.WEDNESDAY));

		System.out.println();

		view.print(logic.listByDay(airport, DayOfWeek.SUNDAY, new Date(122, 06, 31, 13, 00)));

	}

}
