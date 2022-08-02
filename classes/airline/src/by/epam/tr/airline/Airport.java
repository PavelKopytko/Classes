package by.epam.tr.airline;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Airport {

	private List<Airline> airlines;

	{
		airlines = new ArrayList<Airline>();
	}

	public Airport() {
	}

	public Airport(List<Airline> airlines) {
		this.airlines = airlines;
	}

	public void add(Airline airline) {
		airlines.add(airline);
	}

	public List<Airline> getAirlines() {
		return airlines;
	}

	public void setAirlines(List<Airline> airlines) {
		this.airlines = airlines;
	}

	@Override
	public int hashCode() {
		return Objects.hash(airlines);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Airport other = (Airport) obj;
		return Objects.equals(airlines, other.airlines);
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " [airlines=" + airlines + "]";
	}

}
