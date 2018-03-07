package command;

/**
 * @author kangkang lou
 */
public class UnixFileSystemReceiver implements FileSystemReceiver {
    @Override
    public void openFile() {
        System.out.println("open file in unix");
    }

    @Override
    public void writeFile() {
        System.out.println("write file in unix");
    }

    @Override
    public void closeFile() {
        System.out.println("close file in unix");
    }
}
