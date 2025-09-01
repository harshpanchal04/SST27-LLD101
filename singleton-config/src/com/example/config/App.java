package com.example.config;

public class App {
    public static void main(String[] args) {
        System.out.println("Starting application...");

        // Load settings using the loader
        SettingsLoader loader = new SettingsLoader();
        loader.loadSettings();

        // Access settings from another part of the app
        // Get the singleton instance
        AppSettings settings1 = AppSettings.getInstance();
        System.out.println("App Name: " + settings1.get("app.name"));

        // Get the instance again to verify it's the same
        AppSettings settings2 = AppSettings.getInstance();
        System.out.println("App Version: " + settings2.get("app.version"));

        if (settings1 == settings2) {
            System.out.println("Successfully verified: Both variables point to the same singleton instance.");
        } else {
            System.out.println("Error: Variables point to different instances.");
        }

        System.out.println("Application finished.");
    }
}