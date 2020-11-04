public class Settings {
    private static Settings instance;

    private String name;
    private float backLight;

    private Settings() {}

    public static synchronized Settings getInstance() {
        if (instance == null) {
            instance = new Settings();
        }

        return instance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setBackLight(float level) {
        if (level < 0) { 
            backLight = 0;
        } else if (level > 1) {
            backLight = 1;
        } else {
            backLight = level;
        }
    }

    public float getBackLight() {
        return this.backLight;
    }
}