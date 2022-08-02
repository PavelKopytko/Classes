package by.epam.tr.airline;

import java.util.Arrays;
import java.util.Date;
import java.util.Objects;

/*Создать класс Airline, спецификация которого приведена ниже. 
 *Определить конструкторы, set- и get- методы и метод  toString()
 *Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели*/

public class Airline {

	private String destination;
	private String flightNumber;
	private AirplaneType type;
	private Date departureTime;
	private DayOfWeek[] days;

	public Airline() {
		super();
	}

	public Airline(String destination, String flightNumber, AirplaneType type, Date departureTime, DayOfWeek[] days) {
		super();
		this.destination = destination;
		this.flightNumber = flightNumber;
		this.type = type;
		this.departureTime = departureTime;
		this.days = days;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public AirplaneType getType() {
		return type;
	}

	public void setType(AirplaneType type) {
		this.type = type;
	}

	public Date getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(Date departureTime) {
		this.departureTime = departureTime;
	}

	public DayOfWeek[] getDays() {
		return days;
	}

	public void setDays(DayOfWeek[] days) {
		this.days = days;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(days);
		result = prime * result + Objects.hash(departureTime, destination, flightNumber, type);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Airline other = (Airline) obj;
		return Arrays.equals(days, other.days) && Objects.equals(departureTime, other.departureTime)
				&& Objects.equals(destination, other.destination) && Objects.equals(flightNumber, other.flightNumber)
				&& type == other.type;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " [destination=" + destination + ", flightNumber=" + flightNumber
				+ ", type=" + type + ", departureTime=" + departureTime + ", days=" + Arrays.toString(days) + "]";
	}

}
