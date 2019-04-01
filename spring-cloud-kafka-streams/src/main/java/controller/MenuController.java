package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import model.Menu;
import service.MenuService;

@RestController
public class MenuController {
	private final MenuService menuService;

    public MenuController(MenuService menuService) {
        this.menuService = menuService;
    }

    @GetMapping("/menu")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void menu(@RequestParam("message") String message) {
        Menu menu = Menu.builder()
            .message(message)
            .timestamp(System.currentTimeMillis())
            .build();

        menuService.sendMenu(menu);
    }

}
