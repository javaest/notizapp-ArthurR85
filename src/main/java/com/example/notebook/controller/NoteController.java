package com.example.notebook.controller;

import com.example.notebook.model.Note;
import com.example.notebook.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/notes")
public class NoteController {
    @Autowired
    private NoteRepository noteRepository;

    @PostMapping("/create")
    public Note createNote(@RequestBody Note note) {
        return noteRepository.save(note);
    }

    @GetMapping("/list")
    public List<Note> listNotes() {
        return noteRepository.findAll();
    }
}
