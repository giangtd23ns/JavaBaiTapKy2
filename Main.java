package fileTree;

public class Main {
	public static void main(String[] args) {
            Model model = new Model();
            View view = new View(model.getRootNode());
            Controller controller = new Controller(model, view);
    }
}
