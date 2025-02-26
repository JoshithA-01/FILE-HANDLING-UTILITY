import java.util.*;

public class WeatherClient {
    public static void main(String[] args) {
        // Sample user preferences
        Map<String, List<String>> userPreferences = new HashMap<>();
        userPreferences.put("Alice", Arrays.asList("Laptop", "Smartphone", "Headphones"));
        userPreferences.put("Bob", Arrays.asList("Smartphone", "Tablet", "Smartwatch"));
        userPreferences.put("Charlie", Arrays.asList("Laptop", "Tablet"));

        // Generate recommendations
        String user = "Alice";
        List<String> recommendations = getRecommendations(user, userPreferences);
        System.out.println("Recommendations for " + user + ": " + recommendations);
    }

    public static List<String> getRecommendations(String user, Map<String, List<String>> preferences) {
        Set<String> recommendedItems = new HashSet<>();
        List<String> userItems = preferences.get(user);

        for (Map.Entry<String, List<String>> entry : preferences.entrySet()) {
            if (!entry.getKey().equals(user)) {
                for (String item : entry.getValue()) {
                    if (!userItems.contains(item)) {
                        recommendedItems.add(item);
                    }
                }
            }
        }
        return new ArrayList<>(recommendedItems);
    }
}
