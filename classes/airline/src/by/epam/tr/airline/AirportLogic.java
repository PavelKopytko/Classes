package by.epam.tr.airline;

/*Найти и вывести: 
a) список рейсов для заданного пункта назначения; 
b) список рейсов для заданного дня недели; 
c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
*/

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AirportLogic {

	public List<Airline> listByDestination(Airport airport, String destination) {

		List<Airline> dest = new ArrayList<Airline>();

		for (Airline line : airport.getAirlines()) {
			if (line.getDestination().equalsIgnoreCase(destination)) {
				dest.add(line);
			}
		}
		return dest;
	}

	public List<Airline> listByDay(Airport airport, DayOfWeek day) {

		List<Airline> days = new ArrayList<Airline>();

		for (Airline line : airport.getAirlines()) {
			for (int i = 0; i < line.getDays().length; i++) {
				if (line.getDays()[i].equals(day)) {
					days.add(line);
				}
			}
		}
		return days;
	}

	public List<Airline> listByDay(Airport airport, DayOfWeek day, Date date) {

		List<Airline> days = listByDay(airport, day);
		List<Airline> dayDate = new ArrayList<Airline>();

		for (Airline d : days) {
			if (d.getDepartureTime().getTime() > date.getTime()) {
				dayDate.add(d);
			}
		}
		return dayDate;
	}

}
