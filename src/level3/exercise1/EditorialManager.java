package level3.exercise1;

import java.util.ArrayList;
import java.util.Scanner;


public class EditorialManager {
    private ArrayList<Editor> editors;

    public EditorialManager() {
        this.editors = new ArrayList<>();
        loadSampleData();
    }

    private void loadSampleData() {

        Editor editor1 = new Editor("John Doe", "1234");
        Editor editor2 = new Editor("Jane Smith", "5678");


        FootballNews footballNews = new FootballNews("Champions League", "Real Madrid", "Vinicius Jr",
                "Final match", "Exciting final game", 0.0, 0.0);
        footballNews.setPrice(footballNews.calculatePriceNews());
        footballNews.setScore(footballNews.calculateScoreNews());

        TennisNews tennisNews = new TennisNews("Roger Federer", "Federer wins!", "Federer wins his 21st title",
                0.0, 0.0);
        tennisNews.setPrice(tennisNews.calculatePriceNews());
        tennisNews.setScore(tennisNews.calculateScoreNews());


        editor1.addNews(footballNews);
        editor2.addNews(tennisNews);


        this.editors.add(editor1);
        this.editors.add(editor2);
    }


    public void createEditor(Scanner scanner) {
        System.out.println("Can you tell me the name of the editor");
        String name = scanner.next();
        scanner.nextLine();

        System.out.println("Can you tell me the number of DNI");
        final String dni = scanner.next();
        scanner.nextLine();

        Editor editor = new Editor(name, dni);
        this.editors.add(editor);

        System.out.println("editor created successfully");


    }

    public void showEditor() {
        for (Editor editor : this.editors) {
            //System.out.println(editor.toString());
            editor.showEditorNews();
        }
    }

    public void deleteEditor(String dni) {

        boolean found = false;

        for (int i = 0; i < this.editors.size(); ++i) {
            Editor editor = this.editors.get(i);
            if (editor.getDni().equalsIgnoreCase(dni)) {
                this.editors.remove(i);
                System.out.println("The editor has been successfully removed");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("The editor you mentioned has not been found");
        }

    }

    public void addNewsEditor(Scanner scanner) {
        System.out.println("Can you tell me the ID of the editor?");
        String dni = scanner.next();
        scanner.nextLine();


        Editor foundEditor = null;
        for (Editor editor : editors) {

            if (editor.getDni().equalsIgnoreCase(dni)) {
                foundEditor = editor;
                break;
            }

        }
        if (foundEditor == null) {
            System.out.println("No editor found with the provided ID.");
            return;
        }


        System.out.println("Can you tell me the headline of the news");
        String holder = scanner.next();
        scanner.nextLine();

        System.out.println("Can you tell me the text of the news");
        String text = scanner.next();
        scanner.nextLine();

        System.out.println("What kind of new is football, basquet, tennis, F1, motoGp");
        String textUser = scanner.next();
        scanner.nextLine();

        if (textUser.equals("football")) {
            System.out.println("Can you tell me the competition of the news");
            String competition = scanner.next();
            scanner.nextLine();

            System.out.println("Can you tell me the club of the news");
            String club = scanner.next();
            scanner.nextLine();

            System.out.println("Can you tell me the player of the news");
            String player = scanner.next();
            scanner.nextLine();

            FootballNews footballNews = new FootballNews(competition, club, player, holder, text, 0.0, 0.0);
            double price = footballNews.calculatePriceNews();
            double score = footballNews.calculateScoreNews();

            footballNews.setPrice(price);
            footballNews.setScore(score);

            foundEditor.addNews(footballNews);

            System.out.println("Football news has been successfully created");

        }

        if (textUser.equals("basquet")) {
            System.out.println("Can you tell me the competition of the news");
            String competition = scanner.next();
            scanner.nextLine();

            System.out.println("Can you tell me the club of the news");
            String club = scanner.next();
            scanner.nextLine();


            BasquetNews basquetNews = new BasquetNews(competition, club, holder, text, 0.0, 0.0);
            double price = basquetNews.calculatePriceNews();
            double score = basquetNews.calculateScoreNews();

            basquetNews.setPrice(price);
            basquetNews.setScore(score);

            foundEditor.addNews(basquetNews);

            System.out.println("Basquet news has been successfully created");

        }
        if (textUser.equals("tennis")) {
            System.out.println("Can you tell me the name of the player");
            String player = scanner.next();
            scanner.nextLine();


            TennisNews tennisNews = new TennisNews(player, holder, text, 0.0, 0.0);
            double price = tennisNews.calculatePriceNews();
            double score = tennisNews.calculateScoreNews();

            tennisNews.setPrice(price);
            tennisNews.setScore(score);

            foundEditor.addNews(tennisNews);

            System.out.println("Tennis news has been successfully created");

        }
        if (textUser.equals("F1")) {
            System.out.println("Can you tell me the name of the team");
            String team = scanner.next();
            scanner.nextLine();


            F1News f1News = new F1News(team, holder, text, 0.0, 0.0);
            double price = f1News.calculatePriceNews();
            double score = f1News.calculateScoreNews();

            f1News.setPrice(price);
            f1News.setScore(score);

            foundEditor.addNews(f1News);

            System.out.println("Tennis news has been successfully created");

        }
        if (textUser.equals("MotoGP")) {
            System.out.println("Can you tell me the name of the team");
            String team = scanner.next();
            scanner.nextLine();


            MotoGpNews motoGpNews = new MotoGpNews(team, holder, text, 0.0, 0.0);
            double price = motoGpNews.calculatePriceNews();
            double score = motoGpNews.calculateScoreNews();

            motoGpNews.setPrice(price);
            motoGpNews.setScore(score);

            foundEditor.addNews(motoGpNews);

            System.out.println("Tennis news has been successfully created");

        }


    }

    public void calculateNewsScoreEditor(Scanner scanner) {

        System.out.println("Can you tell me the ID of the editor please?");
        String dniScore = scanner.next();
        scanner.nextLine();


        Editor foundEditor = null;
        for (Editor editor : editors) {

            if (editor.getDni().equalsIgnoreCase(dniScore)) {
                foundEditor = editor;
                break;
            }

        }
        if (foundEditor == null) {
            System.out.println("No editor found with the provided ID.");
            return;
        }
        System.out.println("What kind of new is footballNews, basquetNews, tennisNews, F1News, motoGpNews");
        String textUser = scanner.next();
        scanner.nextLine();

        if (textUser.equalsIgnoreCase("footballNews")) {

            System.out.println("Football news for editor " + foundEditor.getName() + ":");
            for (News n : foundEditor.getNews()) {
                if (n instanceof FootballNews) {
                    System.out.println("Title: " + n.getHolder());
                    System.out.println("Score: " + n.getScore());

                }

            }

        }
        if (textUser.equalsIgnoreCase("basquetNews")) {

            System.out.println("Basquet news for editor " + foundEditor.getName() + ":");
            for (News n : foundEditor.getNews()) {
                if (n instanceof BasquetNews) {
                    System.out.println("Title: " + n.getHolder());
                    System.out.println("Score: " + n.getScore());

                }

            }

        }
        if (textUser.equalsIgnoreCase("tennisNews")) {

            System.out.println("Tennis news for editor " + foundEditor.getName() + ":");
            for (News n : foundEditor.getNews()) {
                if (n instanceof TennisNews) {
                    System.out.println("Title: " + n.getHolder());
                    System.out.println("Score: " + n.getScore());

                }

            }

        }
        if (textUser.equalsIgnoreCase("F1News")) {

            System.out.println("F1 news for editor " + foundEditor.getName() + ":");
            for (News n : foundEditor.getNews()) {
                if (n instanceof F1News) {
                    System.out.println("Title: " + n.getHolder());
                    System.out.println("Score: " + n.getScore());

                }

            }

        }
        if (textUser.equalsIgnoreCase("MotoGpNews")) {

            System.out.println("MotoGp news for editor " + foundEditor.getName() + ":");
            for (News n : foundEditor.getNews()) {
                if (n instanceof MotoGpNews) {
                    System.out.println("Title: " + n.getHolder());
                    System.out.println("Score: " + n.getScore());

                }

            }

        }
    }

    public void calculateNewsPriceEditor(Scanner scanner) {

        System.out.println("Can you tell me the ID of the editor please?");
        String dniPrice = scanner.next();
        scanner.nextLine();


        Editor foundEditor = null;
        for (Editor editor : editors) {

            if (editor.getDni().equalsIgnoreCase(dniPrice)) {
                foundEditor = editor;
                break;
            }

        }
        if (foundEditor == null) {
            System.out.println("No editor found with the provided ID.");
            return;
        }
        System.out.println("What kind of new is footballNews, basquetNews, tennisNews, F1News, motoGpNews");
        String textUser = scanner.next();
        scanner.nextLine();

        if (textUser.equalsIgnoreCase("footballNews")) {

            System.out.println("Football news for editor " + foundEditor.getName() + ":");
            for (News n : foundEditor.getNews()) {
                if (n instanceof FootballNews) {
                    System.out.println("Title: " + n.getHolder());
                    System.out.println("Price: " + n.getPrice());

                }

            }

        }
        if (textUser.equalsIgnoreCase("basquetNews")) {

            System.out.println("Basquet news for editor " + foundEditor.getName() + ":");
            for (News n : foundEditor.getNews()) {
                if (n instanceof BasquetNews) {
                    System.out.println("Title: " + n.getHolder());
                    System.out.println("Price: " + n.getPrice());

                }

            }

        }
        if (textUser.equalsIgnoreCase("tennisNews")) {

            System.out.println("Tennis news for editor " + foundEditor.getName() + ":");
            for (News n : foundEditor.getNews()) {
                if (n instanceof TennisNews) {
                    System.out.println("Title: " + n.getHolder());
                    System.out.println("Price: " + n.getPrice());

                }

            }

        }
        if (textUser.equalsIgnoreCase("F1News")) {

            System.out.println("F1 news for editor " + foundEditor.getName() + ":");
            for (News n : foundEditor.getNews()) {
                if (n instanceof F1News) {
                    System.out.println("Title: " + n.getHolder());
                    System.out.println("Price: " + n.getPrice());

                }

            }

        }
        if (textUser.equalsIgnoreCase("MotoGpNews")) {

            System.out.println("MotoGp news for editor " + foundEditor.getName() + ":");
            for (News n : foundEditor.getNews()) {
                if (n instanceof MotoGpNews) {
                    System.out.println("Title: " + n.getHolder());
                    System.out.println("Price: " + n.getPrice());

                }

            }

        }
    }

    public void deleteNewsEditor(Scanner scanner) {

        System.out.println("Can you tell me the ID of the editor?");
        String dni = scanner.nextLine();


        Editor foundEditor = null;
        for (Editor editor : editors) {

            if (editor.getDni().equalsIgnoreCase(dni)) {
                foundEditor = editor;
                break;
            }

        }
        if (foundEditor == null) {
            System.out.println("No editor found with the provided ID.");
            return;
        }

        System.out.println("What kind of new is footballNews, basquetNews, tennisNews, F1News, motoGpNews");
        String textUser = scanner.nextLine();

        System.out.println("What is the title of the news?");
        String title = scanner.nextLine();


            boolean found = false;

            for (int i = 0; i < foundEditor.getNews().size(); i++) {
                News currentNews = foundEditor.getNews().get(i);


                if ((textUser.equalsIgnoreCase("footballNews") && currentNews instanceof FootballNews) ||
                        (textUser.equalsIgnoreCase("basquetNews") && currentNews instanceof BasquetNews) ||
                        (textUser.equalsIgnoreCase("tennisNews") && currentNews instanceof TennisNews) ||
                        (textUser.equalsIgnoreCase("F1News")  && currentNews instanceof F1News) ||
                        (textUser.equalsIgnoreCase("motoGpNews") && currentNews instanceof MotoGpNews)) {

                    if (currentNews.getHolder().equalsIgnoreCase(title)) {
                        foundEditor.getNews().remove(i);

                    System.out.println("The news of editor has been successfully removed");
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("The news of editor you mentioned has not been found");
            }
        }


    }
}



