public class City {
    private String name;
    private String country;
    private long population;

    public City(String name, String country, long population) {
        setName(name);
        setCountry(country);
        setPopulation(population);
    }

    public City(City source){
        setName(source.getName());
        setCountry(source.getCountry());
        setPopulation(source.getPopulation());
    }

    public String getName() {
        return this.name;
    }

    public String getCountry() {
        return this.country;
    }

    public long getPopulation() {
        return this.population;
    }

    public void setName(String name){
        if(name.isBlank() || name.isEmpty()){
            throw new IllegalArgumentException("Name cannot be blank.");
        }
        this.name = name;
    }

    public void setCountry(String country){
        if(country.isBlank() || country.isEmpty()){
            throw new IllegalArgumentException("Country cannot be blank.");
        }
        this.country = country;
    }

    public void setPopulation(long population) {
        if(population <= 0){
            throw new IllegalArgumentException("Population must be greater than 0.");
        }
        this.population = population;
    }
}
