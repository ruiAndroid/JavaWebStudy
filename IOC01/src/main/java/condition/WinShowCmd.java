package condition;

public class WinShowCmd implements ShowCmd{
    @Override
    public String showCmd() {
        return "dir";
    }
}
