package com.example.filmy.manager;

import com.example.filmy.dao.VideoCasseteRepo;
import com.example.filmy.dao.entity.VideoCassete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Optional;

@Service
public class VideoCasseteManager {
    private VideoCasseteRepo videoCasseteRepo;

    @Autowired
    public VideoCasseteManager(VideoCasseteRepo videoCasseteRepo){
        this.videoCasseteRepo=videoCasseteRepo;
    }

    public Optional<VideoCassete> findAllById(Long id){
        return videoCasseteRepo.findAllById(id);
    }

    public Iterable<VideoCassete> findAll(){
        return videoCasseteRepo.findAll();
    }

    public VideoCassete save(VideoCassete videoCassete){
        return videoCasseteRepo.save(videoCassete);
    }

    public void delete(Long id){
        videoCasseteRepo.deleteById(id);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void fillDB(){
        save(new VideoCassete(1L,"Helikopter w ogniu", LocalDate.of(2001,3,22)));
        save(new VideoCassete(2L,"Thor: Ragnarok", LocalDate.of(2017,10,17)));
    }
}
