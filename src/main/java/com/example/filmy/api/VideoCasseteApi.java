package com.example.filmy.api;

import com.example.filmy.dao.entity.VideoCassete;
import com.example.filmy.manager.VideoCasseteManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/cassets")
public class VideoCasseteApi {
    private VideoCasseteManager videoCassets;

    @Autowired
    public VideoCasseteApi(VideoCasseteManager videoCassets){
        this.videoCassets=videoCassets;
         }

    @GetMapping("/all")
    public Iterable<VideoCassete> getAll(){
        return videoCassets.findAll();
    }

    @GetMapping
    public Optional<VideoCassete> getById(@RequestParam long index){
        return  videoCassets.findAllById(index);
    }

    @PostMapping
    public VideoCassete addVideo(@RequestBody VideoCassete videoCassete){
        return videoCassets.save(videoCassete);
    }

    @PutMapping
    public VideoCassete updateVideo(@RequestBody VideoCassete videoCassete){
        return videoCassets.save(videoCassete);
    }
    @DeleteMapping
    public void deleteVideo(@RequestParam long index){
        videoCassets.delete(index);
    }

}
