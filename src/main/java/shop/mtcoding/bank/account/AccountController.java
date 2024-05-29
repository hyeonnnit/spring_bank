package shop.mtcoding.bank.account;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


//@Slf4j // 로그 라이브러리

// 스프링이 관리하는 객체가 됨
@Controller // 컴퍼넌트 스캔(shop.mtcoding.bank 패키지 이하), IoC(new가 자동으로 됨) 등록
public class AccountController {
//    public AccountController() {
//        log.info("Account new 됨");
//
//    }
    @RequestMapping(method = RequestMethod.GET, value = "/home")
    public String home(){
        System.out.println("home 호출됨");
        return "home";
    }

}
