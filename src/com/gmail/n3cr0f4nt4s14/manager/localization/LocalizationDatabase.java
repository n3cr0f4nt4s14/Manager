package com.gmail.n3cr0f4nt4s14.manager.localization;

import java.util.Locale;
import java.util.Objects;

/**
 * The LocalizationDatabase.
 * 
 * @since 0.1.0
 * @created 2022-05-13
 * @updated 2022-05-13
 * @author Necrofantasia
 */
public class LocalizationDatabase {
	/** The singleton LocalizationDatabase instance. */
	public static final LocalizationDatabase INSTANCE = new LocalizationDatabase();
	/** The default locale. */
	public static final Locale LOCALE_DEFAULT = Locale.ENGLISH;
	
	/** The current locale. Defaults to the JVM's system locale. */
	private Locale localeCurrent = Locale.getDefault();
	
	/** Determines whether the locale is loaded. */
	private boolean isLoaded = false;
	/** Determines whether the current local is fully loaded. */
	private boolean isLoadedFully = false;
	/** Determines whether the database is currently updating. */
	private boolean isUpdating = false;
	
	private LocalizationDatabase() {}
	
	/**
	 * Returns the singleton LocalizationDatabase instance.
	 * 
	 * @return the singleton LocalizationDatabase instance
	 */
	public static LocalizationDatabase getInstance() {
		return INSTANCE;
	}
	
	/**
	 * Returns the default locale.<br>
	 * This will always return {@link Locale#ENGLISH}.
	 * 
	 * @return the default locale
	 */
	public Locale getDefaultLocale() {
		return LOCALE_DEFAULT;
	}
	
	/**
	 * Returns the current locale.<br>
	 * <br>
	 * Selects the JVM's default locale as current locale on startup.
	 * Changing the JVM's default locale during runtime does not have
	 * any impact.
	 * 
	 * @return the current locale
	 * @see #setLocaleCurrent(Locale)
	 */
	public Locale getLocaleCurrent() {
		return localeCurrent;
	}
	
	/**
	 * Returns whether a locale is currently loaded.<br>
	 * <br>
	 * Always returns false before {@link #update(Locale)} or
	 * {@link #reload()} is called the first time.
	 *  
	 * @return true if it is loaded, else false
	 */
	public boolean isLoaded() {
		return isLoaded;
	}
	
	/**
	 * Returns whether the current locale is fully loaded.<br>
	 * <br>
	 * If even a single value failed to load, this will return false.
	 * 
	 * @return true if it is fully loaded, else false
	 */
	public boolean isLoadedFully() {
		return isLoadedFully;
	}
	
	/**
	 * Returns whether the database is currently updating.
	 * 
	 * @return true if it is updating, else false
	 */
	public boolean isUpdating() {
		return isUpdating;
	}
	
	/**
	 * Updates the current locale.<br>
	 * <br>
	 * Only updates the locale, if the new value is different from the
	 * current one.<br>
	 * To reload the current locale call {@link #reload()}.
	 * 
	 * @param newLocale the new locale
	 * @return the LocalizationDatabase
	 * @see #reload()
	 */
	public synchronized LocalizationDatabase update(final Locale newLocale) {
		Objects.requireNonNull(newLocale);//TODO: add custom message.
		
		if(isUpdating) {
			//TODO: log that an update process is running.
		}
		else if(localeCurrent.equals(newLocale)) {
			//TODO: log that newLocale must be different from the current one.
		}
		else {
			//Only update if the locale actually changed.
			localeCurrent = newLocale;
			reload();
		}
		
		return this;
	}
	
	/**
	 * Reloads the current locale.
	 * 
	 * @return the LocalizationDatabase
	 */
	public synchronized LocalizationDatabase reload() {
		if(isUpdating) {
			//TODO: log that an update process is running.
		}
		else {
			//TODO: relaod
		}
		
		return this;
	}
}
