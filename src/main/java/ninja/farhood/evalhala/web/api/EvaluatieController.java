package ninja.farhood.evalhala.web.api;

import ninja.farhood.evalhala.domain.Evaluatie;
import ninja.farhood.evalhala.repository.EvaluatieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;

@RestController
public class EvaluatieController {
    @Autowired
    EvaluatieRepository er;

    @RequestMapping(method= RequestMethod.GET, path="/api/evaluatie/{eid}", produces = "application/json")
    public Evaluatie getEvaluatie(@PathVariable("eid") int eid) {
        return er.findOne(eid);
    }

    @RequestMapping(method= RequestMethod.POST, path="/api/evaluatie", consumes = "application/json")
    public ResponseEntity<Evaluatie> createEvaluatie(@RequestBody  Evaluatie e) {
        er.save(e);
        try {
            return ResponseEntity.created(new URI("http://localhost:8080/api/evaluatie/" + e.getId())).body(null);
        } catch (URISyntaxException e1) {
            return ResponseEntity.status(500).body(null);
        }

    }
}
