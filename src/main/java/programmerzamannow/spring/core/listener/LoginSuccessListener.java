package programmerzamannow.spring.core.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import programmerzamannow.spring.core.event.LoginSuccessEvent;

import java.awt.desktop.AppForegroundListener;

@Component
@Slf4j
public class LoginSuccessListener implements ApplicationListener<LoginSuccessEvent> {


    @Override
    public void onApplicationEvent(LoginSuccessEvent event) {
        log.info("Success login for user {} ", event.getUser());
    }
}
