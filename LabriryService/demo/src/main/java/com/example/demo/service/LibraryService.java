package com.example.demo.service;

import com.example.demo.model.Library;
import com.example.demo.repostory.LibraryRep;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LibraryService {
    private final LibraryRep libraryRep;

    public Library getLibrary(int id) {
        return libraryRep.findById(id).get();
    }
    public Library saveLibrary(Library library) {
        return  libraryRep.save(library);
    }
}
