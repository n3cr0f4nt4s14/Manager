package com.gmail.n3cr0f4nt4s14.manager.localization;

import com.gmail.n3cr0f4nt4s14.manager.registry.IRegistryObject;

/**
 * The interface for localizable properties.
 * 
 * @since 0.1.0
 * @created 2022-05-13
 * @updated 2022-05-16
 * @author Necrofantasia
 */
public interface ILocalizableProperty extends IRegistryObject {
	/**
	 * Returns the value of this localizable property.<br>
	 * Never null, if a property is localizable it needs a value.
	 * 
	 * @return the value of this localizable property
	 */
	String getValue();
	
	/**
	 * <b>Only to be called by {@link LocalizationDatabase}.</b><br>
	 * <br>
	 * When called it should update this object's value with the new
	 * given value.
	 * 
	 * @param newValue the updated value
	 */
	void onUpdate(final String newValue);
}
