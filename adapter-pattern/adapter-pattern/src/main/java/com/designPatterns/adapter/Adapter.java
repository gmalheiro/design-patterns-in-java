package com.designPatterns.adapter;

import com.designPatterns.adapter.pack.LegalPerson;
import com.designPatterns.adapter.pack.PhysicalPerson;
import com.designPatterns.adapter.pack.utils.PersonProcessor;

import java.util.Objects;

public class Adapter {

    //Converte a interface de uma classe para outra interface que o cliente espera encontrar,
    // "traduzindo" solicitações do formato requerido pelo usuário para o formato compatível

    public static void main(String[] args) {
        LegalPerson legaPerson = new LegalPerson("XX. XXX. XXX/0001-XX");
        PhysicalPerson physicalPerson = new PhysicalPerson("123.456.789-10");
        PersonProcessor.process(legaPerson);
        PersonProcessor.process(physicalPerson);
    }
}