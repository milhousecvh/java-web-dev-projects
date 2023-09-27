package main.java.org.launchcode;

public class Main {
    public static void main(String[] args) {

        // TODO: Declare and initialize a CD and a DVD object.
        CD zachBryan = new CD("Zach Bryan", true);
        CD printingProjects = new CD("Printmaking Projects");
        DVD suitsSeason3 = new DVD("Suits: Season 3");

        File track1 = new File("Fear and Fridays", 20);
        File track2 = new File("Overtime", 40);
        File track3 = new File("Summertime's Close", 25);
        zachBryan.writeFile(track1);
        zachBryan.writeFile(track2);
        zachBryan.writeFile(track3);

        File companyLogo = new File("company-logo.ai", 32);
        File companyFairPoster = new File("fair-poster", 57);
        printingProjects.writeFile(companyFairPoster);
        printingProjects.writeFile(companyLogo);

        File s3e1 = new File("S3 E1", 110);
        File s3e2 = new File("S3 E2", 110);
        File s3e3 = new File("S3 E3", 110);
        File s3e4 = new File("S3 E4", 110);
        suitsSeason3.writeFile(s3e1);
        suitsSeason3.writeFile(s3e2);
        suitsSeason3.writeFile(s3e3);
        suitsSeason3.writeFile(s3e4);


        System.out.println(zachBryan);
        System.out.println(printingProjects);
        System.out.println(suitsSeason3);
    }
}