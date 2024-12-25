package library.controller;

import library.models.response.TypeResponse;
import library.service.TypeService;
import org.springframework.web.bind.annotation.*;
import lombok.AllArgsConstructor;

import java.util.List;

@RestController
@RequestMapping("/auth")
@AllArgsConstructor
public class TypeController {
    private final TypeService typeService;

    @PostMapping("/add")
    public void addType(@RequestParam String name, @RequestHeader("Authorization") String token){
        typeService.addType(name, token);
    }
    @GetMapping("/types")
    public List<TypeResponse> typeResponses(){
        return typeService.getAll();
    }
}
