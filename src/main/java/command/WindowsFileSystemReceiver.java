package command;

/**
 * @author kangkang lou
 */
public class WindowsFileSystemReceiver implements FileSystemReceiver {
    @Override
    public void openFile() {
        System.out.println("open file in windows");
    }

    @Override
    public void writeFile() {
        System.out.println("write file in windows");
    }

    @Override
    public void closeFile() {
        System.out.println("close file in windows");
    }
}
