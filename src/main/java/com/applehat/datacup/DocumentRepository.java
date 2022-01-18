package com.applehat.datacup;

import org.springframework.data.jpa.repository.JpaRepository;

interface DocumentRepository extends JpaRepository<Document, String> {
    
}