package example_10;

/*
 * TODO -> App Example using Composite design pattern
 */
public class RunApp {
    public static void main(String[] args) {
        Component principalFolder = new Folder("D:");

        Component gamesFolder = new Folder("Juegos");
        Component UTPFolder = new Folder("UTP");

        Component warcraftFolder = new Folder("Warcraft");
        Component hlFolder = new Folder("Half-Life");
        Component coursesFolder = new Folder("Cursos");

        Component w3RCFile = new File("Warcraft 3: Reign of Chaos.exe");
        Component w3FTFile = new File("Warcraft 3: Frozen Throne.exe");
        Component worldEditorFile = new File("World Editor.exe");

        Component hlFile = new File("HL.exe");

        principalFolder.add(gamesFolder);
        principalFolder.add(UTPFolder);

        gamesFolder.add(warcraftFolder);
        gamesFolder.add(hlFolder);

        UTPFolder.add(coursesFolder);

        warcraftFolder.add(w3RCFile);
        warcraftFolder.add(w3FTFile);
        warcraftFolder.add(worldEditorFile);

        hlFolder.add(hlFile);

        principalFolder.showChildren();
    }
}
