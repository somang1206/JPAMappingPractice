package com.ohgiraffers.mapping.section01.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SnackRegistService {
    private SnackRepository snackRepository;

    @Autowired
    public SnackRegistService(SnackRepository snackRepository){
        this.snackRepository = snackRepository;
    }

    @Transactional
    public void registSnack(SnackDTO snackInfo){
        Snack snack = new Snack(
                snackInfo.getSnackName(),
                snackInfo.getSnackCompany(),
                snackInfo.getOrderableStatus(),
                snackInfo.getSnackCompany(),
                new Price(
                        snackInfo.getRegularPrice(),
                        snackInfo.getDiscountRate()
                )
        );

        snackRepository.save(snack);
    }
}
