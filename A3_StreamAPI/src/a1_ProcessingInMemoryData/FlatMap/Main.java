package a1_ProcessingInMemoryData.FlatMap;

import java.util.List;
import java.util.stream.IntStream;

class City {
	public String name;
	public long population;

	public City(String name, long population) {
		this.name = name;
		this.population = population;
	}
}

class Country {
	public String name;
	public List<City> cities;

	public Country(String name, List<City> cities) {
		this.name = name;
		this.cities = cities;
	}

}

public class Main {

	public static void main(String[] args) {

		City mumbai = new City("mumbai", 3000);
		City delhi = new City("delhi", 200);
		City pune = new City("pune", 400);
		Country in = new Country("in", List.of(mumbai, delhi, pune));

		City ny = new City("ny", 800);
		City dallas = new City("dallas", 700);
		Country us = new Country("us", List.of(ny, dallas));

		List<Country> countries = List.of(in, us);

		// Q. Find the total population of all cities.
		//make sure flat map must be work on Collection and return stream
		long totalPopulation = countries.stream().flatMap(country -> country.cities.stream())
				.mapToLong(city -> city.population).sum();
		System.out.println(totalPopulation);
		
		

	}
}
