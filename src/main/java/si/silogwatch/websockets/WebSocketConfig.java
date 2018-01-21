package si.silogwatch.websockets;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.socket.config.annotation.AbstractWebSocketMessageBrokerConfigurer;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;

@Configuration
@EnableWebSocketMessageBroker
@EnableScheduling
public class WebSocketConfig extends AbstractWebSocketMessageBrokerConfigurer {

    @Override
    public void configureMessageBroker(MessageBrokerRegistry config) {
        config.enableSimpleBroker("/topic"); // outgoing: subscription endpoint
        config.setApplicationDestinationPrefixes("/app"); // incomming: multi/broad/uni -cast
    }

    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        registry.
                addEndpoint("/ws-log-endpoint").
                setAllowedOrigins("*")
                .withSockJS();
    }
}
