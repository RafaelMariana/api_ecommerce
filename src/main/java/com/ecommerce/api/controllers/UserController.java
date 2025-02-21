package com.ecommerce.api.controllers;


import com.ecommerce.api.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/users")
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<UserDTO> findById(@PathVariable Long id) {
        UserDTO dto = userService.findById(id);
        return ResponseEntity.ok(dto);

    }

    @GetMapping
    public ResponseEntity<List<UserDTO>> findAll() {
        List<UserDTO> dtoList = userService.findAll();
        return ResponseEntity.ok(dtoList);
    }

    @PostMapping
    public ResponseEntity<UserDTO> create(@RequestBody UserDTO userDTO){
        UserDTO userDTO = userService.create(userDTO);
        return ResponseEntity.ok(userDTO);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<UserDTO> update(@PathVariable Long id, @RequestBody UserDTO userDTO){
        UserDTO userDTO = userService.update(id, userDTO);
        return ResponseEntity.ok(userDTO);

    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<UserDTO> delete(@PathVariable Long id){
        service.delete(id);
        return ResponseEntity.noContent().build();

    }


}
