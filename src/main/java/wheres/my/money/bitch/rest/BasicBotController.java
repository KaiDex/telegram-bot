package wheres.my.money.bitch.rest;

import com.google.common.collect.Lists;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/basic")
public class BasicBotController {

    @GetMapping(value = "/getAll")
    public List<String> getAll() {
        return Lists.newArrayList("Hello", "World");
    }
}
