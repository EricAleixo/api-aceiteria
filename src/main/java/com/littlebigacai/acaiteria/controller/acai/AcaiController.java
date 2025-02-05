package com.littlebigacai.acaiteria.controller.acai;

import com.littlebigacai.acaiteria.model.acai.Acai;
import com.littlebigacai.acaiteria.service.acai.AcaiService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/acais")
public class AcaiController {

    private final AcaiService acaiService;

    public AcaiController(AcaiService acaiService){
        this.acaiService = acaiService;
    }

    @GetMapping
    public List<Acai> listAcais(){
        return acaiService.userFindAll();
    }

}
