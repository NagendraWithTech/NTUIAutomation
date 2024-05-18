package config;

public class Config {
    public static final String BASE_URL = "https://www.amazon.in/";

    // Define the search term as a constant variable
    private static final String SEARCH_TERM = "laptop";

    // Provide a method to access the search term
    public static String getSearchTerm() {
        return SEARCH_TERM;
    }
}
