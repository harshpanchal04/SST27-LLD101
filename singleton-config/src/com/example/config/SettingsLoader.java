package com.example.config;

public class SettingsLoader {
    public void loadSettings() {
        // 3) Update SettingsLoader to use the singleton (no 'new').
        AppSettings settings = AppSettings.getInstance();
        settings.set("app.name", "Singleton App");
        settings.set("app.version", "1.1");
        System.out.println("Settings loaded into the singleton instance.");
    }
}