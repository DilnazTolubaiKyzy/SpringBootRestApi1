package com.peaksoft.controller;

import com.peaksoft.dto.LoginMapper;
import com.peaksoft.repository.UserRepository;
import com.peaksoft.sequrity.jwt.JwtTokenUtil;
import com.peaksoft.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/jwt")
@RequiredArgsConstructor
public class AuthController {

    private final UserDetailsService userDetailsService;
    private final UserRepository userRepository;
    private final UserService userService;
    private final AuthenticationManager authenticationManager;
    private final LoginMapper loginMapper;
    private final JwtTokenUtil tokenUtil;
}
