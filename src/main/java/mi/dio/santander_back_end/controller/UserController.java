package mi.dio.santander_back_end.controller;

import mi.dio.santander_back_end.model.User;
import mi.dio.santander_back_end.service.UserSerevice;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserSerevice userSerevice;

    public UserController(UserSerevice userSerevice) {
        this.userSerevice = userSerevice;
    }
    @GetMapping("/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id) {
        var user = userSerevice.findById(id);
        return ResponseEntity.ok(user);
    }

    @PostMapping
    public ResponseEntity<User> create(@RequestBody User userToCreated) {
        var userCreated = userSerevice.create(userToCreated);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(userCreated.getId())
                .toUri();
        return ResponseEntity.created(location).body(userCreated);
    }
}
