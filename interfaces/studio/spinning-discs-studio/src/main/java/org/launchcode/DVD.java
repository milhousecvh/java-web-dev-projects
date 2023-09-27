package main.java.org.launchcode;

import main.java.org.launchcode.BaseDisc;
import main.java.org.launchcode.File;
import main.java.org.launchcode.Media;
import main.java.org.launchcode.Rewriteable;

public class DVD extends Media implements Rewriteable {


    public DVD(String name) {
        super(name, "DVD", 1200, 4700);
    }

    @Override
    public String toString() {
        return super.toString() + getFormattedFileList("Video Files");
    }

    @Override
    public void writeFile(File file) {
        spinDisc();
        if (getFiles().contains(file)) {
            System.out.println("the video, " + file.getName() + " has already been added.");
        } else if (getSpaceUsed() + file.getSize() > getCapacity()) {
            System.out.println(("WARNING: Not enough space on the " + getDiscType() + " for " + file.getName()));
        } else {
            getFiles().add(file);
            System.out.println("The video," + file.getName() + "has been added to " + getName() + "." );
        }
    }

    @Override
    public void removeFile(File file) {
            spinDisc();
            if (fileIsPresent(file)) {
                getFiles().remove(file);
                System.out.println("The file" + file.getName() + "has been removed from the " + getDiscType());
            }
    }

    @Override
    public void reformatDisc() {
        spinDisc();
        getFiles().clear();
    }

    @Override
    public void runFile(File file) {
        if(fileIsPresent(file)){
            spinDisc();
            System.out.println("Watching " + file.getName() + "...");
        }
    }
    // TODO: Implement your custom interface.
    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
