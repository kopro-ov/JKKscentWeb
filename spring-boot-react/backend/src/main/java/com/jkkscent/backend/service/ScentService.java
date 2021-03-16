package com.jkkscent.backend.service;

import com.jkkscent.backend.domain.Scent;
import com.jkkscent.backend.dto.ScentResponseDto;
import com.jkkscent.backend.repository.ScentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class ScentService {

    private final ScentRepository scentRepository;

    @Transactional(readOnly = true)
    public List<ScentResponseDto> findAll() {
        return scentRepository.findAll().stream()
                .map(ScentResponseDto::new)
                .collect(Collectors.toList());
    }

    public ScentResponseDto findById(Long scentId) {
        Scent entity = scentRepository.findById(scentId)
                .orElseThrow(()->new IllegalArgumentException("해당 향수가 없습니다."));
        return new ScentResponseDto(entity);
    }

}
