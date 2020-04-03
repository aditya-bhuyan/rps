package com.xp.rps;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class PlayController {

    @Autowired
    private RPSRepo rpsRepo;


    @PostMapping("/play")
    public ResponseEntity play(@RequestBody PlayRequest playRequest){
        RPS p1 = playRequest.getP1();
        RPS p2 = playRequest.getP2();
        rpsRepo.addRound();
        return new ResponseEntity(RPSApp.play(p1,p2).getResult(), HttpStatus.OK);
    }

    @GetMapping("/admin/round")
    public ResponseEntity getRound(){
        Integer data = rpsRepo.getRound();
        return new ResponseEntity(data,HttpStatus.OK);
    }

    @PutMapping("/admin/reset/{value}")
    public void reset(@PathVariable Integer value){
        rpsRepo.reset(value);
    }
}
