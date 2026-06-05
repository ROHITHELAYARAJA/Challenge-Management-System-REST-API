package com.rohith.ChallegeApp;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
public class ChallengeService {


    List<Challenge> challenges = new ArrayList<>();
    private Long nextid = 1L;

    public ChallengeService() {
        Challenge c = new Challenge(true,2,"Daily 4 liter of water consumption", 2L ,"Water goal");
        challenges.add(c);
    }



    public List<Challenge> getAllChallenges() {
        return challenges;
    }

    public boolean addChallenge(Challenge c) {
      if(c!=null) {
          c.setId(nextid++);
          challenges.add(c);
          return true;
      }
      else {
          return false;
      }
    }

    public Challenge getChallenge(int dayNumber) {
        for(Challenge c : challenges) {
            if(c.getDayNumber()==(dayNumber)) {
                return c;
            }
        }
        return null;
    }

    public boolean updateChallenge(Long id, Challenge update) {
        for (Challenge c : challenges) {
            if (c.getId().equals(id)) {
                c.setTitle(update.getTitle());
                c.setDescription(update.getDescription());
                c.setDayNumber(update.getDayNumber());
                c.setCompleted(update.isCompleted());
                return true;
            }
        }
        return false;
    }

    public boolean deleteChallenge(Long id) {
        return challenges.removeIf(c -> c.getId().equals(id));
    }
}
