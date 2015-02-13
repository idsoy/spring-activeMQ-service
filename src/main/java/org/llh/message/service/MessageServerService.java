package org.llh.message.service;

import java.util.ArrayList;


public interface MessageServerService {
	
	public void receiveTipMessage(String sender);

	public void receiveTipMessageList(ArrayList<String> sender);
	
}
