package br.edu.ifba.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.ifba.projeto.model.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {

}
