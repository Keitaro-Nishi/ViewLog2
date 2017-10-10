import org.springframework.security.web.bind.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import demo.dto.LoginUser;

@Controller
public class MenuController {

    @RequestMapping(value = "/index")
    public String index(@AuthenticationPrincipal LoginUser loginUser, Model model) {
        // @AuthenticationPrincipalを使うと認証オブジェクトを参照できる。

        return "/index";
    }
}