package iuh.fit.util;

public class AppLogger {
	private static final AppLogger INSTANCE = new AppLogger();

	private AppLogger() {
	}

	public static AppLogger getInstance() {
		return INSTANCE;
	}

	public void log(String message) {
		System.out.println("[LOGGER] " + message);
	}
}
