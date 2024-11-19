package com.example.demo.repostory;

import com.example.demo.model.Library;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibraryRep extends JpaRepository<Library, Integer> {
}
