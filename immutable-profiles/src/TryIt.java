// import com.example.profiles.*;
import com.example.profiles.ProfileService;
import com.example.profiles.UserProfile;


public class TryIt {
    public static void main(String[] args) {
        System.out.println("Building profiles...");

        // Use the builder directly
        UserProfile profile1 = new UserProfile.Builder("id1", "test@example.com")
                .displayName("Test User 1")
                .phone("123-456-7890")
                .marketingOptIn(true)
                .build();

        System.out.println("Profile 1: " + profile1);

        // Use the service which now uses the builder
        ProfileService service = new ProfileService();
        UserProfile profile2 = service.create("id2", "another@example.com", "Test User 2");

        System.out.println("Profile 2: " + profile2);

        System.out.println("Done.");
    }
}
