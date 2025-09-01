package com.example.profiles;

// import java.util.Objects;

/**
 * Assembles profiles with scattered, inconsistent validation.
 */
public class ProfileService {
    
    public UserProfile create(String id, String email, String displayName) {
        // 4) Update ProfileService to stop mutating after creation.
        return new UserProfile.Builder(id, email)
                .displayName(displayName)
                .build();
    }

    public UserProfile create(String id, String email, String displayName, String phone) {
        return new UserProfile.Builder(id, email)
                .displayName(displayName)
                .phone(phone)
                .build();
    }
}
