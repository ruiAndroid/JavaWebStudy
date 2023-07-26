package condition;

public class OsShowCmd implements ShowCmd{
    @Override
    public String showCmd() {
        return "ls";
    }
}
