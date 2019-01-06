package com.petfinder.backend.socketJS;


import java.util.LinkedList;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.messaging.simp.SimpMessageSendingOperations;
import org.springframework.messaging.simp.stomp.StompHeaderAccessor;
import org.springframework.messaging.support.GenericMessage;
import org.springframework.messaging.support.NativeMessageHeaderAccessor;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.messaging.SessionConnectedEvent;
import org.springframework.web.socket.messaging.SessionDisconnectEvent;


@Component
public class WebSocketEventListener {
	
	private static final Logger logger = LoggerFactory.getLogger(WebSocketEventListener.class);
	

	@Autowired
	private SimpMessageSendingOperations messagingTemplate;
	

	@EventListener
	public void handleWebSocketConnectListener(SessionConnectedEvent event) {
		logger.info("Received a new web socket connection");
        StompHeaderAccessor headerAccessor = StompHeaderAccessor.wrap(event.getMessage());
//        String chatUserId =  ((NativeMessageHeaderAccessor) headerAccessor.getNativeHeader("headers")).getNativeHeader("id").get(0);
//        System.out.println(chatUserId);
        String sessionId = headerAccessor.getSessionId();
        GenericMessage genericMessage = (GenericMessage) event.getMessage().getHeaders().get("simpConnectMessage");
        @SuppressWarnings("unchecked")
        Map<String, LinkedList> obj = (Map<String, LinkedList>) genericMessage.getHeaders().get("nativeHeaders");
        String id = obj.get("id").getFirst().toString();
        String isUser =  obj.get("user").getFirst().toString();
        if (isUser=="false") {
		}
//        this.cookieService.printSessionId(headerAccessor);
		
	}

	@EventListener
	public void handleWebSocketDisconnectListener(SessionDisconnectEvent event) {
		StompHeaderAccessor headerAccessor = StompHeaderAccessor.wrap(event.getMessage());
		String username = (String) headerAccessor.getSessionAttributes().get("username");
		if (username != null) {
		}
		String sessionId = headerAccessor.getSessionId();
        System.out.println( sessionId);
		
	}
}
