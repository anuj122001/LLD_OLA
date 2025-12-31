package src;

public class UserFactory {
    public static User createUser(String type , String userId, String name,Location currLocation)
    {
        return switch (type) {
            case "RIDER" -> new Rider(userId, name);
            case "DRIVER" -> new VehicleDriver(userId, name,currLocation);
            default -> throw new IllegalArgumentException("No such User Found");
        };

    }
}
