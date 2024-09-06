package ru.javaops.cloudjava.menuservice.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.javaops.cloudjava.menuservice.dto.CreateMenuRequest;
import ru.javaops.cloudjava.menuservice.dto.MenuItemDto;
import ru.javaops.cloudjava.menuservice.dto.SortBy;
import ru.javaops.cloudjava.menuservice.dto.UpdateMenuRequest;
import ru.javaops.cloudjava.menuservice.service.MenuService;
import ru.javaops.cloudjava.menuservice.storage.model.Category;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/v1/menu-items")
@RequiredArgsConstructor
public class MenuItemController {

    private final MenuService menuService;

}
