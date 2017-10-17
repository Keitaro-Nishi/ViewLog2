import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@Slf4j
public class DebugController {

    @RequestMapping({"/debug"})
    public String debug(@AuthenticationPrincipal AppUserDetail userDetail) {
        log.info("debug: {}", userDetail);

        return "user";
    }
}
