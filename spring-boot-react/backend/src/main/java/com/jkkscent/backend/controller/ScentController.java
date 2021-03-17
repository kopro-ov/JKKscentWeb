package com.jkkscent.backend.controller;

import com.jkkscent.backend.dto.ScentResponseDto;
import com.jkkscent.backend.service.ScentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/scent")
public class ScentController {

    private final ScentService scentService;

    @GetMapping("")
    public List<ScentResponseDto> findAll() {
        return scentService.findAll();
    }

    @GetMapping("/{id}")
    public ScentResponseDto findById(@PathVariable Long id) {
        return scentService.findById(id);
    }


}
