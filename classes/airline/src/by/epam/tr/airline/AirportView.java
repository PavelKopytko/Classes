package by.epam.tr.airline;

import java.util.Arrays;
import java.util.List;

public class AirportView {

	public void print(List<Airline> list) {
		for (Airline line : list) {
			System.out.println(
					" #" + line.getFlightNumber() + " " + line.getDestination() + " " + Arrays.toString(line.getDays())
							+ " " + line.getDepartureTime().getHours() + ":" + line.getDepartureTime().getMinutes());
		}
	}

}
