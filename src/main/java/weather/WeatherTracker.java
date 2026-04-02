package weather;

public class WeatherTracker {
    String currentConditions;
    Notifier notifier;

    public WeatherTracker() {
        this.notifier = new Phone();
    }

    public void setCurrentConditions(String weatherDescription) {
        switch (weatherDescription) {
            case "rainy": this.notifier = new Phone(); break;
            case "sunny": this.notifier = new Email(); break;
        }
        this.currentConditions = weatherDescription;

        notifyWeather(weatherDescription);
    }

    private void notifyWeather(String weatherDescription) {
        String alert = notifier.generateWeatherAlert(weatherDescription);
        System.out.print(alert);
    }
}