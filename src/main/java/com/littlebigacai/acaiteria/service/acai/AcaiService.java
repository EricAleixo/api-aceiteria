package com.littlebigacai.acaiteria.service.acai;

import com.littlebigacai.acaiteria.model.acai.Acai;
import com.littlebigacai.acaiteria.repository.acai.AcaiRepostory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AcaiService {
    private final AcaiRepostory acaiRepostory;

    public AcaiService(AcaiRepostory acaiRepostory){
        this.acaiRepostory = acaiRepostory;
    }

    public List<Acai> userFindAll(){
        return acaiRepostory.findAll();
    }
}
