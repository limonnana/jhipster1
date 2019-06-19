package com.limonnana.web.rest;


import com.google.gson.Gson;
import com.limonnana.domain.MonthArrayOrder;
import com.limonnana.domain.MonthList;
import com.limonnana.domain.Reservation;
import com.limonnana.monthFactory.MonthCreator;
import io.github.jhipster.web.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class MonthController {

    @Autowired
   MonthCreator monthCreator;


    @GetMapping("/month")
    ResponseEntity<String> getMonths(){

        MonthList month = monthCreator.getMockTestListReservations();
        Gson gson = new Gson();

        String result = gson.toJson(month);

        return ResponseEntity.ok().body(result);

    }
}
