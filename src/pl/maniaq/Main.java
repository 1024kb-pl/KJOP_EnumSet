package pl.maniaq;

import java.util.EnumSet;

public class Main {

    public static void main(String[] args) {
        // metoda of pozwala utworzenie enuma na podstawie podanych argumentów
        EnumSet<Operations> computerOperations = EnumSet.of(Operations.ON, Operations.OFF, Operations.HIBERNATE, Operations.COPY, Operations.PASTE, Operations.CUT);

        EnumSet<Operations> textEditorOperations = EnumSet.noneOf(Operations.class);
        textEditorOperations.add(Operations.CREATE);
        textEditorOperations.add(Operations.COPY);
        textEditorOperations.add(Operations.PASTE);
        textEditorOperations.add(Operations.CUT);
        textEditorOperations.add(Operations.SAVE);

        // metoda allOf pozwala na dodanie automatycznie wszystkich operacji z enum
        EnumSet<Operations> allOperations = EnumSet.allOf(Operations.class);
        allOperations.remove(Operations.CREATE);
        allOperations.remove(Operations.ON);
        allOperations.remove(Operations.OFF);

        // Nie trzeba pisac metody toString w println, ponieważ metoda print sama wyszykuje tej metody w obiekcie
        System.out.println("Rozmiar computerOperations: " + computerOperations.size() + ", oraz jego elementy: " + computerOperations.toString());
        System.out.println("Rozmiar textEditorOperations: " + textEditorOperations.size() + ", oraz jego elementy: " + textEditorOperations);
        System.out.println("Rozmiar allOperations: " + allOperations.size() + ", oraz jego elementy: " + allOperations);



    }
}
