package com.gmail.n3cr0f4nt4s14.manager;

/**
 * The Manager.
 * 
 * @since 0.1.0
 * @created 2022-05-13
 * @updated 2022-05-13
 * @author Necrofantasia
 */
public final class Manager {
	/** The singleton manager instance. */
	public static final Manager INSTANCE = new Manager();
	
	private Manager() {
		
	}
	
	/**
	 * Returns the singleton Manager instance.
	 * 
	 * @return the singleton Manager instance
	 */
	public static Manager getInstance() {
		return INSTANCE;
	}
}
