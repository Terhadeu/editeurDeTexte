package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeRemplacer extends CommandeDocument{

    public CommandeRemplacer(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        if(parameters.length < 3) {
            System.err.println("Format attendu : remplacer;debut;fin;chaine");
            return;
        }
        Integer debut = Integer.parseInt(parameters[1]);
        Integer fin = Integer.parseInt(parameters[2]);
        String chaine = "";
        if(parameters.length == 4) {
            chaine = parameters[3];
        }
        this.document.remplacer(debut,fin,chaine);
        super.executer();
    }
}
