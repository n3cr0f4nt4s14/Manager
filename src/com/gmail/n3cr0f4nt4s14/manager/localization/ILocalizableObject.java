package com.gmail.n3cr0f4nt4s14.manager.localization;

import com.gmail.n3cr0f4nt4s14.manager.registry.IRegistryObject;

/**
 * The interface for localizable objects.
 * 
 * @since 0.1.0
 * @created 2022-05-13
 * @updated 2022-05-16
 * @author Necrofantasia
 */
public interface ILocalizableObject extends IRegistryObject {
	/**
	 * Returns the name of this localizable object.<br>
	 * Never null, if an object is localizable it at least needs a name.
	 * 
	 * @return the name of this localizable object.
	 */
	String getName();
	
	/**
	 * Returns the description of this localizable object.<br>
	 * The description may also be considered to be a tooltip or a hint.<br>
	 * May be null.
	 * 
	 * @return the description of this localizable object
	 */
	String getDescription();
	
	/**
	 * <b>Only to be called by {@link LocalizationDatabase}.</b><br>
	 * <br>
	 * When called it should update this object's name and description with
	 * the new given values.
	 * 
	 * @param newValue the updated value
	 * @param newDescription the updated description
	 */
	void onUpdate(final String newName, final String newDescription);
}
