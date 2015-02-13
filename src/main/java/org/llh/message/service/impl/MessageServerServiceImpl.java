package org.llh.message.service.impl;

import java.util.ArrayList;

import org.llh.message.common.LogUtil;
import org.llh.message.service.MessageServerService;

public class MessageServerServiceImpl implements MessageServerService {

	@Override
	public void receiveTipMessage(String sender) {
		
		try{
			
			System.out.println(sender);
			System.out.println("=================发送站内信====================");
			
		}catch(Exception e){
			LogUtil.getErrorLogger().error(e.getMessage(),e);
		}finally {
			
		}
		
	}
	
	@Override
	public void receiveTipMessageList(ArrayList<String> senders){
		
		try {
			
			System.out.println(senders);
			System.out.println("=================批量发送站内信====================");
			
		} catch (Exception e) {
			LogUtil.getErrorLogger().error(e.getMessage(), e);
		}finally {
			
		}
		
	}

}
