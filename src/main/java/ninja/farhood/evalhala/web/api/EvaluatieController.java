package ninja.farhood.evalhala.web.api;

import ninja.farhood.evalhala.domain.Evaluatie;
import ninja.farhood.evalhala.repository.EvaluatieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

@RestController
public class EvaluatieController {
    @Autowired
    EvaluatieRepository er;

    @RequestMapping(method= RequestMethod.POST, path="/api/evaluatie", consumes = "application/json")
    public ResponseEntity<Void> createEvaluatie(Evaluatie e) {
        System.out.println(e.getVoornaam());
        System.out.println(e.getAchternaam());

        er.save(e);

        return new ResponseEntity<Void>(HttpStatus.CREATED);
    }
}
