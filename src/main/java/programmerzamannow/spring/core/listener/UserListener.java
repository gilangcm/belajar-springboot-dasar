package programmerzamannow.spring.core.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import programmerzamannow.spring.core.event.LoginSuccessEvent;

@Component
@Slf4j
public class UserListener {

    @EventListener(classes = LoginSuccessEvent.class)
    public void onLoginSucessEvent(LoginSuccessEvent event){
        log.info("Success login again for user {} ", event.getUser());
    }

    @EventListener(classes = LoginSuccessEvent.class)
    public void onLoginSucessEvent2(LoginSuccessEvent event){
        log.info("Success login again for user {} ", event.getUser());
    }

    @EventListener(classes = LoginSuccessEvent.class)
    public void onLoginSucessEvent3(LoginSuccessEvent event){
        log.info("Success login again for user {} ", event.getUser());
    }
}
