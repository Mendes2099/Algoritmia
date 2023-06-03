package Ex4;

public class Main {
    public static void main(String[] args) {

        FileManager fileManager = FileManager.getInstance("C:\\Users\\User\\OneDrive - IEFP Formação\\Desktop\\Code\\CESAE\\Algoritmias\\Teste_Design\\Ficha_Singleton");

        //Criar ficheiros
        fileManager.createFile("file.txt");
        fileManager.createFile("fileToDelete.txt");

        // Apagar ficheiros
        fileManager.deleteFile("fileToDelete.txt");

        fileManager.setRootDirectory("");
        fileManager.createFile("newFile.txt");



    }
}
