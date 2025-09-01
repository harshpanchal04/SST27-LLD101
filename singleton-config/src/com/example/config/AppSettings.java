package com.example.config;

import java.io.Serializable;
import java.util.Properties;

public class AppSettings implements Serializable {
    // 1) Make AppSettings a proper, thread-safe singleton (lazy init)
    private static volatile AppSettings INSTANCE;

    private final Properties properties = new Properties();

    // Private constructor to prevent direct instantiation.
    private AppSettings() {
        // 2) Block reflection-based multiple construction.
        if (INSTANCE != null) {
            throw new IllegalStateException("Singleton instance already exists. Use getInstance() method.");
        }
    }

    public static AppSettings getInstance() {
        // Double-checked locking for thread-safe lazy initialization.
        if (INSTANCE == null) {
            synchronized (AppSettings.class) {
                if (INSTANCE == null) {
                    INSTANCE = new AppSettings();
                }
            }
        }
        return INSTANCE;
    }

    public String get(String key) {
        return properties.getProperty(key);
    }

    public void set(String key, String value) {
        properties.setProperty(key, value);
    }

    // 2) Preserve singleton on serialization.
    protected Object readResolve() {
        return getInstance();
    }
}