package com.rohith.ChallegeApp;

import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/challenges")
public class ChallengeController {
    List<Challenge> challenges = new ArrayList<>();

    private ChallengeService challengeService ;

    public ChallengeController(ChallengeService challengeService) {
        this.challengeService = challengeService;
    }



    @GetMapping
    public ResponseEntity<List<Challenge>> getAllChallenges() {
        List l = challengeService.getAllChallenges();
        if (l.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(l, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<String> addChallenge(@RequestBody Challenge c) {
       boolean ifexist =  challengeService.addChallenge(c);
        if(ifexist){

            return new ResponseEntity<>("Challenge added successfully", HttpStatus.OK) ;
        }
        else{
            return new ResponseEntity<>("Challenge not added ",HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/{dayNumber}")
    public ResponseEntity<Challenge> getChallenges(@PathVariable int dayNumber) {
       Challenge c =  challengeService.getChallenge(dayNumber);
       if(c!=null){
           return new ResponseEntity<>(c, HttpStatus.OK);
       }
       else{
           return new ResponseEntity<>(HttpStatus.NOT_FOUND);
       }
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateChallenge(@PathVariable Long id,@RequestBody Challenge update){
        boolean isupdate =  challengeService.updateChallenge(id,update);
        if(isupdate){

            return new ResponseEntity<>("Challenge updated successfully", HttpStatus.OK) ;
        }
        else{
            return new ResponseEntity<>("Challenge not updated ",HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteChallenge(@PathVariable  Long id){
        boolean isdeleted = challengeService.deleteChallenge(id);
        if(isdeleted){
            return new ResponseEntity<>("Challenge deleted successfully", HttpStatus.OK) ;
        }
        else{
            return new ResponseEntity<>("Challenge not deleted ",HttpStatus.NOT_FOUND);
        }

    }
}
