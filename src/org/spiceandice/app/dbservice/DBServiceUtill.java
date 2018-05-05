package org.spiceandice.app.dbservice;

import org.spiceandice.app.model.QuickSupport;

public interface DBServiceUtill {
	public boolean saveObject(QuickSupport objectToSave);
	public QuickSupport retreiveObject(String bookingNumber, String email);
	
}
