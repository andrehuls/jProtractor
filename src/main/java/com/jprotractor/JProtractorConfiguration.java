package com.jprotractor;

import java.io.IOException;
import java.net.URL;
import java.util.Properties;

public class JProtractorConfiguration {
	private static final String PAGE_LOAD_TIMEOUT = "PAGE_LOAD_TIMEOUT";
	private static final String WEBDRIVER_TIMEOUT = "WEBDRIVER_TIMEOUT";
	private static final String ANGULAR_TIMEOUT = "ANGULAR_TIMEOUT";
	private static final String PAGE_SYNC_TIMEOUT = "PAGE_SYNC_TIMEOUT";
	public static final long DEFAULT_PAGE_LOAD_TIMEOUT = 10 * 1000;
	public static final long DEFAULT_PAGE_SYNC_TIMEOUT = 11 * 1000;
	public static final long DEFAULT_ANGULAR_TIMEOUT = 10 * 1000;
	public static final long DEFAULT_WEBDRIVER_TIMEOUT = 11 * 1000;
	private static Properties properties;

	public static long getPageLoadTimeout() {
		return getProperty(PAGE_LOAD_TIMEOUT);
	}

	public static long getPageSyncTimeout() {
		return getProperty(PAGE_SYNC_TIMEOUT);
	}

	public static long getAngularTimeout() {
		return getProperty(ANGULAR_TIMEOUT);
	}

	public static long getWebDriverTimeout() {
		return getProperty(WEBDRIVER_TIMEOUT);
	}

	private static long getProperty(String key) {
		if (properties == null)
			loadDefaultProperties();
		return Long.parseLong((String) properties.get(key));
	}

	private static void loadDefaultProperties() {
		properties = new Properties();
		setProperty(PAGE_LOAD_TIMEOUT, DEFAULT_PAGE_LOAD_TIMEOUT);
		setProperty(PAGE_SYNC_TIMEOUT, DEFAULT_PAGE_SYNC_TIMEOUT);
		setProperty(ANGULAR_TIMEOUT, DEFAULT_ANGULAR_TIMEOUT);
		setProperty(WEBDRIVER_TIMEOUT, DEFAULT_WEBDRIVER_TIMEOUT);
	}

	private static void setProperty(String key, long value) {
		properties.setProperty(key, "" + value);
	}

	public static void loadConfig(URL url) throws IOException {
		loadDefaultProperties();
		if (url != null)
			properties.load(url.openStream());
	}
}