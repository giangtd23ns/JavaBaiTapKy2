package fileTree;

import javax.swing.tree.DefaultMutableTreeNode;

public class Controller {
	private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
        initView();
    }

    private void initView() {
        DefaultMutableTreeNode rootNode = model.getRootNode();
        view = new View(rootNode);
    }

}
