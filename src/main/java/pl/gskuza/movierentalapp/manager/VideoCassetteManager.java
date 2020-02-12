package pl.gskuza.movierentalapp.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import pl.gskuza.movierentalapp.dao.VideoCassettsRepo;
import pl.gskuza.movierentalapp.dao.entity.VideoCassette;

import java.time.LocalDate;
import java.util.Optional;


@Service
public class VideoCassetteManager {

public VideoCassettsRepo videoCassettsRepo;

  @Autowired
   public VideoCassetteManager(VideoCassettsRepo videoCassettsRepo){
      this.videoCassettsRepo = videoCassettsRepo;
    }

  public Optional<VideoCassette> findById(Long id){
      return videoCassettsRepo.findById(id);
    }

    public Iterable<VideoCassette> findAll(){
        return videoCassettsRepo.findAll();
    }

    public VideoCassette save(VideoCassette videoCassette){
        return videoCassettsRepo.save(videoCassette);
    }

    public void deleteById(Long id){
        videoCassettsRepo.deleteById(id);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void fillDB(){

       save(new VideoCassette(1L,"Titanic", LocalDate.of(1995,1,1)));
       save(new VideoCassette(2L,"Fast&Furious", LocalDate.of(2001,9,21)));
    }
}
