package command;

/**
 * @author kangkang lou
 */
public interface FileSystemReceiver {
    void openFile();

    void writeFile();

    void closeFile();
}
