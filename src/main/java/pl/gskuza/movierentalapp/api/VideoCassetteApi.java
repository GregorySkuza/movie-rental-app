package pl.gskuza.movierentalapp.api;


import org.springframework.web.bind.annotation.*;
import pl.gskuza.movierentalapp.dao.entity.VideoCassette;
import pl.gskuza.movierentalapp.manager.VideoCassetteManager;


import java.util.Optional;


@RestController
@RequestMapping("api/cassetts")
public class VideoCassetteApi {


    private VideoCassetteManager videoCassettes;

    @GetMapping("/all")
    public Iterable<VideoCassette>  getAll() {

        return videoCassettes.findAll();
    }

    @PostMapping
    public Optional<VideoCassette> getById(@RequestParam Long index) {

        return videoCassettes.findById(index);
    }

    @PostMapping
    public VideoCassette addVideo(@RequestBody VideoCassette videoCassette){

        return videoCassettes.save(videoCassette);
    }
    @PutMapping
    //@PutMapping- overwriting elements
    public VideoCassette updateVideo(@RequestBody VideoCassette videoCassette){

        return videoCassettes.save(videoCassette);
    }
    @DeleteMapping
    public void deleteVideo(@RequestParam Long index){
         videoCassettes.deleteById(index);

    }


}
