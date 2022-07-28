package ko.alliex.energy.jwt.controller;

import ko.alliex.energy.jwt.dto.request.JwtRequest;
import ko.alliex.energy.jwt.service.LoginService;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@Data
@AllArgsConstructor
public class LoginController {
    private final LoginService loginService;

    @PostMapping("/auth/login")
    public ResponseEntity<?> doLogin(@RequestBody(required = false) @Valid JwtRequest request) {
        return ResponseEntity.ok(loginService.doLogin(request.toDxo()));
    }
}
