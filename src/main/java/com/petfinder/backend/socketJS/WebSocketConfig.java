package com.petfinder.backend.socketJS;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.AbstractWebSocketMessageBrokerConfigurer;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {
	
	@Override
	public void registerStompEndpoints(StompEndpointRegistry registry) {
		registry.addEndpoint("/ws").setAllowedOrigins("*").withSockJS();
	}

	
//	@Override
//    public void configureMessageBroker(MessageBrokerRegistry config) {
//		config.setApplicationDestinationPrefixes("/app");
////        config.enableSimpleBroker("/manager");
//    }

//	public void configureMessageBroker(MessageBrokerRegistry registry) {
//
//	    // Use this for enabling a Full featured broker like RabbitMQ
//		registry.enableStompBrokerRelay("/topic")
//        .setRelayHost("127.0.0.1:8000")
//        .setRelayPort(61613)
//        .setClientLogin("system")
//        .setClientPasscode("password");
//    registry.setApplicationDestinationPrefixes("/app");
//	}
	
}
