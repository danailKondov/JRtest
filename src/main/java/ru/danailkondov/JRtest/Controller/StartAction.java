package ru.danailkondov.JRtest.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created 11.02.2018.
 * Аннотация @Controller указывает, что данный класс играет роль контроллера,
 * потому нет необходимости наследования какого-либо базового класса контроллера или использования Servlet API.
 *
 * Основная цель аннотации @Controller - назначать шаблон данному классу, показывая его роль.
 * Это значит, что диспетчер будет сканировать Controller-классы на предмет реализованных методов,
 * проверяя @RequestMapping аннотации.
 */
@Controller
public class StartAction {

    /**
     * Задаем методам вашего контроллера адреса, по которым они будут доступны на клиенте.
     * Этот метод будет срабатывать по адресу "http://localhost:8080/".
     * @return строка как ответ на запрос
     */
    @RequestMapping("/")
    public @ResponseBody String startAction(@RequestParam(value="name", required=false, defaultValue="World") String name,
                                            Model uiModel) {
        uiModel.addAttribute("name", name);
        return "index";
    }
}
