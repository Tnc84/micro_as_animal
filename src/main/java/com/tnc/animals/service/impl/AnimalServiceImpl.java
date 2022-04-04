package com.tnc.animals.service.impl;

import com.tnc.animals.repository.interfaces.AnimalRepository;
import com.tnc.animals.service.domain.AnimalDomain;
import com.tnc.animals.service.interfaces.AnimalService;
import com.tnc.animals.service.mapper.AnimalDomainMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AnimalServiceImpl implements AnimalService {

    private final AnimalRepository animalRepository;
    private final AnimalDomainMapper animalDomainMapper;

    @Override
    public AnimalDomain get(Long id) {
        return animalDomainMapper.toDomain(animalRepository.getById(id));
    }

    @Override
    public List<AnimalDomain> getAll() {
        return animalDomainMapper.toDomainList(animalRepository.findAll());
    }

    @Override
    public AnimalDomain add(AnimalDomain animalDomain) {
        return animalDomainMapper.toDomain(animalRepository.save(animalDomainMapper.toEntity(animalDomain)));
    }

    @Override
    public AnimalDomain update(AnimalDomain animalDomain) {
        return animalDomainMapper.toDomain(animalRepository.save(animalDomainMapper.toEntity(animalDomain)));
    }
}
