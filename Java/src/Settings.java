// setting을 싱글턴 객체로 생성
public class Settings {
//   인스턴스 생성 막기
    private Settings() {};
    private static Settings settings = null;

    public static Settings getSettings() {
        if (settings == null) {
            settings = new Settings();
        }
        return settings;
    }

    private boolean darkMode = false;

    private int fontSize = 13;

    public boolean getDarkMode() {
        return darkMode;
    }

    public int getFontSize() {
        return fontSize;
    }

    public void setDarkMode(boolean _darkMode) {
        this.darkMode = _darkMode;
    }

    public void setFontSize(int _fontSize) {
        this.fontSize = _fontSize;
    }


}
